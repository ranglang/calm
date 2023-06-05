package com.lqiong.model.symbol

import com.lqiong.jep.entry.{DateFormat, SymbolEnum}
import com.lqiong.jep.option.OptionDirection.{CALL, PUT}
import com.lqiong.jep.option.OptionProductName.{HT300, HX50}
import com.lqiong.model.symbol.codesyntax.{
  interpolate,
  interpolateBlockSymbol,
  interpolateConvertiable,
  interpolateFund,
  interpolateHk,
  interpolateIndex,
  interpolateOption,
  interpolateSwIndex,
  interpolateUsaSymbol
}
import com.lqiong.model.symbol.datesyntax.interpolateTime
import com.lqiong.model._
import org.joda.time.DateTime

import scala.annotation.tailrec

trait codesyntax {
  implicit class UriContext(val sc: StringContext) {

    /** Parse the given string (with embedded expressions) as an uri.
      *
      * Any values embedded in the URI using the `${...}` syntax will be URL-encoded, taking into
      * account the context. Parts of the URI given as literal strings (not embedded values), are
      * assumed to be URL-encoded and thus will be decoded when creating the `Uri` instance.
      *
      * Embedded values can be optional for hosts (subdomains) query parameters and the fragment. If
      * the value is `None`, the appropriate URI component will be removed.
      *
      * Sequences in the host part will be expanded to a subdomain sequence, and sequences in the
      * path will be expanded to path components. Maps, sequences of tuples and sequences of values
      * can be embedded in the query part. They will be expanded into query parameters. Maps and
      * sequences of tuples can also contain optional values, for which mappings will be removed if
      * `None`.
      *
      * All components of the URI can be embedded from values: scheme, username/password, host,
      * port, path, query and fragment. The embedded values won't be further parsed, with the
      * exception of the `:` in the host part, which is commonly used to pass in both the host and
      * port.
      *
      * If a string containing the protocol is embedded at the very beginning, it will not be
      * escaped, allowing to embed entire addresses as prefixes, e.g.: `uri"$endpoint/login"`, where
      * `val endpoint = "http://example.com/api"`. This is useful when a base URI is stored in a
      * value, and can then be used as a base for constructing more
      */
    def c(args: Any*): StockSymbol = interpolate(sc, args: _*)
    def i(args: Any*): IndexSymbol = interpolateIndex(sc, args: _*)
    def hk(args: Any*): HkSymbol = interpolateHk(sc, args: _*)
    def opt(args: Any*): OptionSymbol = interpolateOption(sc, args: _*)
    def sw(args: Any*): SwIndexSymbol = interpolateSwIndex(sc, args: _*)
    def b(args: Any*): ConvertibleSymbol =
      interpolateConvertiable(sc, args: _*) // bond 债券
    def j(args: Any*): JiJinSymbol = interpolateFund(sc, args: _*)
    def t(args: Any*): DateTime = interpolateTime(sc, args: _*)
    def bk(args: Any*): BlockSymbol = interpolateBlockSymbol(sc, args: _*)
    def u(args: Any*): UsSymbol = interpolateUsaSymbol(sc, args: _*)
  }
}

object codesyntax extends codesyntax {

  def interpolateTime(sc: StringContext, args: Any*): DateTime = {
    val tokens = tokenize(sc, args: _*)

    val builders = List(
      UriBuilderTime.SchemeTime
    )
    val (uri, leftTokens) = {
      builders.foldLeft((DateTime.now, tokens)) { case ((u, t), builder) =>
        builder.fromTokens(u, t)
      }
    }
    uri
  }

  def interpolateFund(sc: StringContext, args: Any*): JiJinSymbol = {
    val tokens = tokenize(sc, args: _*)

    val builders = List(
      UriBuilder.Scheme
    )
    val startingUri = JiJinSymbol()

    val (uri, leftTokens) =
      builders.foldLeft((startingUri, tokens)) { case ((u, t), builder) =>
        builder.fromTokens(u, t)
      }

    if (leftTokens.nonEmpty) {
      throw new IllegalStateException(
        s"Tokens left after building the whole uri: $leftTokens, result so far: $uri"
      )
    }

    JiJinSymbol(uri.code)
  }

  def interpolateUsaSymbol(sc: StringContext, args: Any*): UsSymbol = {
    val tokens = tokenizeUsa(sc, args: _*)

    val builders = List(
      UriBuilder.Scheme
    )
    val startingUri = UsSymbol()

    val (uri, leftTokens) =
      builders.foldLeft((startingUri, tokens)) { case ((u, t), builder) =>
        builder.fromTokens(u, t)
      }

    if (leftTokens.nonEmpty) {
      throw new IllegalStateException(
        s"Tokens left after building the whole uri: $leftTokens, result so far: $uri"
      )
    }

    UsSymbol(uri.code)
  }

  def interpolateConvertiable(
    sc: StringContext,
    args: Any*
  ): ConvertibleSymbol = {
    val tokens = tokenize(sc, args: _*)

    val builders = List(
      UriBuilder.Scheme
    )
    val startingUri = ConvertibleSymbol()

    val (uri, leftTokens) =
      builders.foldLeft((startingUri, tokens)) { case ((u, t), builder) =>
        builder.fromTokens(u, t)
      }

    if (leftTokens.nonEmpty) {
      throw new IllegalStateException(
        s"Tokens left after building the whole uri: $leftTokens, result so far: $uri"
      )
    }

    ConvertibleSymbol(uri.code)
  }

  def interpolateBlockSymbol(sc: StringContext, args: Any*): BlockSymbol = {
    val tokens = tokenizeBlock(sc, args: _*)

    val builders = List(
      UriBuilder.Scheme
    )
    val startingUri = BlockSymbol()

    val (uri, leftTokens) =
      builders.foldLeft((startingUri, tokens)) { case ((u, t), builder) =>
        builder.fromTokens(u, t)
      }

    if (leftTokens.nonEmpty) {
      throw new IllegalStateException(
        s"Tokens left after building the whole uri: $leftTokens, result so far: $uri"
      )
    }

    BlockSymbol(uri.code)
  }

  def interpolateSwIndex(sc: StringContext, args: Any*): SwIndexSymbol = {
    val tokens = tokenize(sc, args: _*)

    val builders = List(
      UriBuilder.Scheme
    )
    val startingUri = IndexSymbol()

    val (uri, leftTokens) =
      builders.foldLeft((startingUri, tokens)) { case ((u, t), builder) =>
        builder.fromTokens(u, t)
      }

    if (leftTokens.nonEmpty) {
      throw new IllegalStateException(
        s"Tokens left after building the whole uri: $leftTokens, result so far: $uri"
      )
    }

    SwIndexSymbol(uri.code)
  }

  def interpolateOption(sc: StringContext, args: Any*): OptionSymbol = {
    val tokens = tokenizeOption(sc, args: _*)

    val builders = List(
      UriBuilder.Scheme
    )
    val startingUri = OptionSymbol()

    val (uri, leftTokens) =
      builders.foldLeft((startingUri, tokens)) { case ((u, t), builder) =>
        builder.fromTokens(u, t)
      }

    if (leftTokens.nonEmpty) {
      throw new IllegalStateException(
        s"Tokens left after building the whole uri: $leftTokens, result so far: $uri"
      )
    }

    val timestamp = "(HX|HT)([0-9]{4})(P|C)([0-9]{4})".r

    val description = uri.code match {
      case timestamp(productName, month, direction, price) => {
        val productName1 = if (productName == "HX") HX50 else HT300
        val monthTime = DateFormat.parseNoGapTime(month)
        val direction1 = if (direction == "P") PUT else CALL
        val price1 = price.toLong
        OptionSymbol(
          uri.code,
          symbolType = SymbolEnum.option,
          direction = direction1,
          date = monthTime,
          price = Some(price1),
          productName = productName1
        )
      }

      case _ =>
        throw new Error("parse error ")
    }
    description
  }

  def interpolateHk(sc: StringContext, args: Any*): HkSymbol = {
    val tokens = tokenizeHk(sc, args: _*)

    val builders = List(
      UriBuilder.Scheme
    )
    val startingUri = HkSymbol()

    val (uri, leftTokens) =
      builders.foldLeft((startingUri, tokens)) { case ((u, t), builder) =>
        builder.fromTokens(u, t)
      }

    if (leftTokens.nonEmpty) {
      throw new IllegalStateException(
        s"Tokens left after building the whole uri: $leftTokens, result so far: $uri"
      )
    }

    HkSymbol(uri.code)
  }

  def interpolateIndex(sc: StringContext, args: Any*): IndexSymbol = {
    val tokens = tokenize(sc, args: _*)

    val builders = List(
      UriBuilder.Scheme
    )
    val startingUri = IndexSymbol()

    val (uri, leftTokens) =
      builders.foldLeft((startingUri, tokens)) { case ((u, t), builder) =>
        builder.fromTokens(u, t)
      }

    if (leftTokens.nonEmpty) {
      throw new IllegalStateException(
        s"Tokens left after building the whole uri: $leftTokens, result so far: $uri"
      )
    }

    IndexSymbol(uri.code)
  }

  def interpolate(sc: StringContext, args: Any*): StockSymbol = {
    val tokens = tokenize(sc, args: _*)

    val builders = List(
      UriBuilder.Scheme
    )
    val startingUri = IndexSymbol()

    val (uri, leftTokens) =
      builders.foldLeft((startingUri, tokens)) { case ((u, t), builder) =>
        builder.fromTokens(u, t)
      }

    if (leftTokens.nonEmpty) {
      throw new IllegalStateException(
        s"Tokens left after building the whole uri: $leftTokens, result so far: $uri"
      )
    }

    StockSymbol(uri.code)
  }

  private def tokenizeUsa(sc: StringContext, args: Any*): Vector[Token] = {
    val strings = sc.parts.iterator
    val expressions = args.iterator

    var (tokenizer, tokens) = Tokenizer.SchemeUsa.tokenize(strings.next())

    tokens
  }

  private def tokenizeBlock(sc: StringContext, args: Any*): Vector[Token] = {
    val strings = sc.parts.iterator
    val expressions = args.iterator
    var (tokenizer, tokens) = Tokenizer.BlockScheme.tokenize(strings.next())
    tokens
  }

  private def tokenize(sc: StringContext, args: Any*): Vector[Token] = {
    val strings = sc.parts.iterator
    val expressions = args.iterator

    var (tokenizer, tokens) = Tokenizer.Scheme.tokenize(strings.next())

    tokens
  }

  private def tokenizeOption(sc: StringContext, args: Any*): Vector[Token] = {
    val strings = sc.parts.iterator
    val expressions = args.iterator

    var (tokenizer, tokens) = Tokenizer.SchemeOption.tokenize(strings.next())

    tokens
  }

  private def tokenizeHk(sc: StringContext, args: Any*): Vector[Token] = {
    val strings = sc.parts.iterator
    val expressions = args.iterator

    var (tokenizer, tokens) = Tokenizer.HkScheme.tokenize(strings.next())

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
            throw new Error(s"code should be number $s")
        }
      }

      override def endToken: Option[Token] = Some(SchemeEnd)
    }

    object SchemeUsa extends Tokenizer {
      private val SchemePattern = "[A-Z]{2,10}".r

      override def tokenize(s: String): (Tokenizer, Vector[Token]) = {
        SchemePattern.findPrefixOf(s) match {
          // #59: if the entire string matches the pattern, then there's no scheme terminator (`:`). This means there's
          // no scheme, hence - tokenizing as a relative uri.
          case Some(scheme) if scheme.length == s.length =>
            (this, Vector(StringToken(s)))
          case _ => // no scheme
            throw new Error(s"code should be number $s")
        }
      }

      override def endToken: Option[Token] = Some(SchemeEnd)
    }

    object SchemeOption extends Tokenizer {
      val SchemePattern = "(HX|HT)[0-9]{4}(P|C)[0-9]{4}".r

      override def tokenize(s: String): (Tokenizer, Vector[Token]) = {
        SchemePattern.findPrefixOf(s) match {
          // #59: if the entire string matches the pattern, then there's no scheme terminator (`:`). This means there's
          // no scheme, hence - tokenizing as a relative uri.
          case Some(scheme) if scheme.length == s.length =>
            (this, Vector(StringToken(s)))
          case _ => // no scheme
            throw new Error(s"option's format should be right $s")
        }
      }

      override def endToken: Option[Token] = Some(SchemeEnd)
    }

    object HkScheme extends Tokenizer {
      private val SchemePattern = "[0-9]{5}".r

      override def tokenize(s: String): (Tokenizer, Vector[Token]) = {
        SchemePattern.findPrefixOf(s) match {
          // #59: if the entire string matches the pattern, then there's no scheme terminator (`:`). This means there's
          // no scheme, hence - tokenizing as a relative uri.
          case Some(scheme) if scheme.length == s.length =>
            (this, Vector(StringToken(s)))
          case _ => // no scheme
            throw new Error(s"code should be number $s")
        }
      }

      override def endToken: Option[Token] = Some(SchemeEnd)
    }

    object BlockScheme extends Tokenizer {
      private val BlockSchemePattern = "(.){4,}".r

      override def tokenize(s: String): (Tokenizer, Vector[Token]) = {
        BlockSchemePattern.findPrefixOf(s) match {
          // #59: if the entire string matches the pattern, then there's no scheme terminator (`:`). This means there's
          // no scheme, hence - tokenizing as a relative uri.
          case Some(scheme) if scheme.length == s.length =>
            (this, Vector(StringToken(s)))
          case _ => // no scheme
            throw new Error(s"code should be number $s")
        }
      }

      override def endToken: Option[Token] = Some(SchemeEnd)
    }

    object Scheme extends Tokenizer {
      private val SchemePattern = "[0-9]{6}".r

      override def tokenize(s: String): (Tokenizer, Vector[Token]) = {
        SchemePattern.findPrefixOf(s) match {
          // #59: if the entire string matches the pattern, then there's no scheme terminator (`:`). This means there's
          // no scheme, hence - tokenizing as a relative uri.
          case Some(scheme) if scheme.length == s.length =>
            (this, Vector(StringToken(s)))
          case _ => // no scheme
            throw new Error(s"code should be number $s")
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

  sealed trait UriBuilderTime {
    def fromTokens(u: DateTime, t: Vector[Token]): (DateTime, Vector[Token])
  }

  sealed trait UriBuilder {
    def fromTokens[T <: LSymbol](u: T, t: Vector[Token]): (T, Vector[Token])
  }

  object UriBuilderTime {

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

    case object SchemeTime extends UriBuilderTime {
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

    case object Scheme extends UriBuilder {
      override def fromTokens[T <: LSymbol](
        u: T,
        t: Vector[Token]
      ): (T, Vector[Token]) = {
        val scheme = tokensToString(t)
        (u.setCode(scheme).asInstanceOf[T], Vector.empty)
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
