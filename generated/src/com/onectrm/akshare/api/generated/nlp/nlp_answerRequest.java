
    package com.onectrm.akshare.api.generated.nlp;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: nlp
    * 接口: nlp_answer
    * 目标地址: https://ownthink.com/robot.html
    * 描述: 获取思知-对话机器人的接口, 以此来进行智能问答
    * 限量: 单次返回查询的数据结果
    */
    public class nlp_answerRequest extends AkShareRequestAndResponse {
    public nlp_answerRequest(){
    setInterfaceName("nlp_answer");
    }

    public static String name() {
        return "nlp_answer";
    }
    public String getName() {
    return "nlp_answer";
    }

    public static nlp_answerRequest of(


    String p_question,


    Map.Entry
    <String
    , String>... others){
    nlp_answerRequest t = new nlp_answerRequest();


    t.p_question = p_question;
    t.other.put("question", p_question.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: question
    * type: str
    * desc: question=&quot;姚明的身高&quot;
    * required: Y
    */
    private String p_question;

    public String getP_question() { return this.p_question;}
    public void setP_question(String v) { this.p_question = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
