
    package com.onectrm.akshare.api.generated.macro;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_usa_michigan_consumer_sentiment
    * 目标地址: https://cdn.jin10.com/dc/reports/dc_usa_michigan_consumer_sentiment_all.js?v=1578576228
    * 描述: 获取美国密歇根大学消费者信心指数初值报告, 数据区间从19700301-至今
    * 限量: 单次返回所有历史数据
    */
    public class macro_usa_michigan_consumer_sentimentRequest extends AkShareRequestAndResponse {
    public macro_usa_michigan_consumer_sentimentRequest(){
    setInterfaceName("macro_usa_michigan_consumer_sentiment");
    }

    public static String name() {
        return "macro_usa_michigan_consumer_sentiment";
    }
    public String getName() {
    return "macro_usa_michigan_consumer_sentiment";
    }

    public static macro_usa_michigan_consumer_sentimentRequest of(


    String p_wu2,


    Map.Entry
    <String
    , String>... others){
    macro_usa_michigan_consumer_sentimentRequest t = new macro_usa_michigan_consumer_sentimentRequest();


    t.p_wu2 = p_wu2;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 无
    * type: 无
    * desc: 无
    * required: 无
    */
    private String p_wu2;

    public String getP_wu2() { return this.p_wu2;}
    public void setP_wu2(String v) { this.p_wu2 = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
