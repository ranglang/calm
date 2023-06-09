
    package com.onectrm.akshare.api.generated.nlp;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: nlp
    * 接口: nlp_ownthink
    * 目标地址: https://ownthink.com/
    * 描述: 获取思知-知识图谱的接口, 以此来查询知识图谱数据
    * 限量: 单次返回查询的数据结果
    */
    public class nlp_ownthinkRequest extends AkShareRequestAndResponse {
    public nlp_ownthinkRequest(){
    setInterfaceName("nlp_ownthink");
    }

    public static String name() {
        return "nlp_ownthink";
    }
    public String getName() {
    return "nlp_ownthink";
    }

    public static nlp_ownthinkRequest of(


    String p_word,

    String p_indicator,


    Map.Entry
    <String
    , String>... others){
    nlp_ownthinkRequest t = new nlp_ownthinkRequest();


    t.p_word = p_word;
    t.other.put("word", p_word.toString());

    t.p_indicator = p_indicator;
    t.other.put("indicator", p_indicator.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: word
    * type: str
    * desc: word=&quot;人工智能&quot;
    * required: Y
    */
    private String p_word;

    public String getP_word() { return this.p_word;}
    public void setP_word(String v) { this.p_word = v;}

    /**
    * name: indicator
    * type: str
    * desc: indicator=&quot;entity&quot;; Please refer **Indicator Info** table
    * required: Y
    */
    private String p_indicator;

    public String getP_indicator() { return this.p_indicator;}
    public void setP_indicator(String v) { this.p_indicator = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
