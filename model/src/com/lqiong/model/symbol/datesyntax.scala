package com.lqiong.model.symbol
import com.lqiong.jep.entry.DateFormat
import com.lqiong.model.Rfc3986
import com.lqiong.model.symbol.datesyntax.interpolateTime
import org.joda.time.DateTime

import scala.annotation.tailrec

trait datesyntax {
  implicit class UriContext(val sc: StringContext) {
    def t(args: Any*): DateTime = interpolateTime(sc, args: _*)
  }
}

object datesyntax extends datesyntax {

  def interpolateTime(sc: StringContext, args: Any*): DateTime = {
    val tokens = tokenize(sc, args: _*)

    val builders = List(
      UriBuilder.SchemeTime
    )
    val (uri, leftTokens) = {
      builders.foldLeft((DateTime.now, tokens)) { case ((u, t), builder) =>
        builder.fromTokens(u, t)
      }
    }
    // TODO
    uri
//    println(s"uri ${uri}")
//    DateFormat.fromString(uri)
//    DateTime.now
  }

  private def tokenize(sc: StringContext, args: Any*): Vector[Token] = {
    val strings = sc.parts.iterator
    val expressions = args.iterator

    var (tokenizer, tokens) = Tokenizer.TimeScheme.tokenize(strings.next())

    tokens
  }

  sealed trait Token
  case class StringToken(s: String) extends Token
  case class ExpressionToken(e: Any) extends Token
  case object SchemeEnd extends Token

  trait Tokenizer {
    def tokenize(s: String): (Tokenizer, Vector[Token])
    def endToken: Option[Token] = None // token to add if the input is exhausted
  }

  object Tokenizer {

    object TimeScheme extends Tokenizer {
      private val SchemePattern = "[0-9|-]{10}".r

      override def tokenize(s: String): (Tokenizer, Vector[Token]) = {
        SchemePattern.findPrefixOf(s) match {
          // #59: if the entire string matches the pattern, then there's no scheme terminator (`:`). This means there's
          // no scheme, hence - tokenizing as a relative uri.
          case Some(scheme) if scheme.length == s.length =>
            (this, Vector(StringToken(s)))
          case _ => // no scheme
            throw new Error(s"code should be number ${s}")
        }
      }

      override def endToken: Option[Token] = Some(SchemeEnd)
    }

    private def splitPreserveSeparators(
      s: String,
      sep: Set[Char],
      escape: Option[(Char, Char)]
    ): Vector[String] = {
      @tailrec
      def doSplit(s: String, acc: Vector[String]): Vector[String] = {
        split(s, sep, escape) match {
          case Left(x) => acc :+ x
          case Right((before, separator, after)) =>
            doSplit(after, acc ++ Vector(before, separator.toString))
        }
      }

      doSplit(s, Vector.empty)
    }

    private def split(
      s: String,
      sep: Set[Char],
      escape: Option[(Char, Char)]
    ): Either[String, (String, Char, String)] = {
      escape match {
        case None    => splitNoEscape(s, sep)
        case Some(e) => splitWithEscape(s, sep, e)
      }
    }

    private def splitNoEscape(
      s: String,
      sep: Set[Char]
    ): Either[String, (String, Char, String)] = {
      val i = s.indexWhere(sep.contains)
      if (i == -1) Left(s)
      else Right((s.substring(0, i), s.charAt(i), s.substring(i + 1)))
    }

    private def splitWithEscape(
      s: String,
      sep: Set[Char],
      escape: (Char, Char)
    ): Either[String, (String, Char, String)] = {
      var inEscape: Boolean = false
      for (i <- 0 until s.length) {
        val c = s(i)
        if (inEscape && c == escape._2) {
          inEscape = false
        } else if (!inEscape && c == escape._1) {
          inEscape = true
        } else if (!inEscape) {
          if (sep.contains(c)) {
            return Right((s.substring(0, i), s.charAt(i), s.substring(i + 1)))
          }
        }
      }

      Left(s)
    }
  }

  sealed trait UriBuilder {
    def fromTokens(u: DateTime, t: Vector[Token]): (DateTime, Vector[Token])
  }

  object UriBuilder {

    private def tokensToStringOpt(
      t: Vector[Token],
      decodePlusAsSpace: Boolean = false
    ): Option[String] =
      t match {
        case Vector()                   => None
        case Vector(ExpressionToken(e)) => anyToStringOpt(e)
        case _                          => Some(tokensToString(t, decodePlusAsSpace))
      }

    private def tokensToString(
      t: Vector[Token],
      decodePlusAsSpace: Boolean = false
    ): String = {
      t.collect {
        case StringToken(s)     => decode(s, decodePlusAsSpace)
        case ExpressionToken(e) => anyToString(e)
      }.mkString("")
    }

    case object SchemeTime extends UriBuilder {
      override def fromTokens(
        u: DateTime,
        t: Vector[Token]
      ): (DateTime, Vector[Token]) = {
        val scheme: String = tokensToString(t)
        (DateFormat.fromString(scheme), Vector.empty)
      }
    }

    private def anyToString(a: Any): String = anyToStringOpt(a).getOrElse("")

    private def anyToStringOpt(a: Any): Option[String] =
      a match {
        case None    => None
        case null    => None
        case Some(x) => Some(x.toString)
        case x       => Some(x.toString)
      }

    /*
      #102: the + sign should be decoded into a space only when it's part of the query. Otherwise, it should be
      kept as-is.
     */
    private def tokensToStringSeq(
      tokens: Vector[Token],
      decodePlusAsSpace: Boolean = false
    ): Seq[String] = {
      /*
        #40: when converting tokens to a string sequence, we have to look at
        groups of string/expression (value) tokens separated by others. If there
        are multiple tokens in each such group, their string representations
        should be concatenated (corresponds to e.g. $x$y). A single
        collection-valued token should be expanded.
       */

      def isValueToken(t: Token) =
        t match {
          case ExpressionToken(_) => true
          case StringToken(_)     => true
          case _                  => false
        }

      @tailrec
      def doToSeq(ts: Vector[Token], acc: Vector[String]): Seq[String] = {
        val tsWithValuesPrefix = ts.dropWhile(to => !isValueToken(to))
        val (valueTs, tailTs) = tsWithValuesPrefix.span(isValueToken)

        valueTs match {
          case Vector() => acc // tailTs must be empty then as well
          case Vector(ExpressionToken(s: Iterable[_])) =>
            doToSeq(tailTs, acc ++ s.flatMap(anyToStringOpt).toVector)
          case Vector(ExpressionToken(s: Array[_])) =>
            doToSeq(tailTs, acc ++ s.flatMap(anyToStringOpt).toVector)
          case _ =>
            val values = valueTs
              .flatMap {
                case ExpressionToken(e) => anyToStringOpt(e)
                case StringToken(s)     => Some(decode(s, decodePlusAsSpace))
                case _                  => None
              }

            val strToAdd =
              if (values.isEmpty) None else Some(values.mkString(""))

            doToSeq(tailTs, acc ++ strToAdd)
        }
      }

      doToSeq(tokens, Vector.empty)
    }

    private def split[T](
      v: Vector[T],
      sep: Set[T]
    ): Either[Vector[T], (Vector[T], T, Vector[T])] = {
      val i = v.indexWhere(sep.contains)
      if (i == -1) Left(v) else Right((v.take(i), v(i), v.drop(i + 1)))
    }

    private def splitToGroups[T](v: Vector[T], sep: T): Vector[Vector[T]] = {
      @tailrec
      def doSplit(vv: Vector[T], acc: Vector[Vector[T]]): Vector[Vector[T]] = {
        vv.indexOf(sep) match {
          case -1 => acc :+ vv
          case i  => doSplit(vv.drop(i + 1), acc :+ vv.take(i))
        }
      }

      doSplit(v, Vector.empty)
    }

    private def decode(s: String, decodePlusAsSpace: Boolean): String =
      Rfc3986.decode(decodePlusAsSpace)(s)
  }

}
