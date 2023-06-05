
    package com.onectrm.akshare.api.generated.fx;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fx
    * 接口: macro_fx_sentiment
    * 目标地址: https://datacenter.jin10.com/reportType/dc_ssi_trends
    * 描述: 获取货币对-投机情绪报告
    * 限量: 单次返回指定日期所有品种的数据(所指定的日期必须在当前交易日之前的30个交易日内)
    */
    public class macro_fx_sentimentRequest extends AkShareRequestAndResponse {
    public macro_fx_sentimentRequest(){
    setInterfaceName("macro_fx_sentiment");
    }

    public static String name() {
        return "macro_fx_sentiment";
    }
    public String getName() {
    return "macro_fx_sentiment";
    }

    public static macro_fx_sentimentRequest of(


    String p_startdate,

    String p_enddate,


    Map.Entry
    <String
    , String>... others){
    macro_fx_sentimentRequest t = new macro_fx_sentimentRequest();


    t.p_startdate = p_startdate;
    t.other.put("start_date", p_startdate.toString());

    t.p_enddate = p_enddate;
    t.other.put("end_date", p_enddate.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: start_date
    * type: str
    * desc: start_date=&quot;2020-04-07&quot;; 所指定的日期必须在当前交易日之前的30个交易日内
    * required: Y
    */
    private String p_startdate;

    public String getP_startdate() { return this.p_startdate;}
    public void setP_startdate(String v) { this.p_startdate = v;}

    /**
    * name: end_date
    * type: str
    * desc: end_date=&quot;2020-04-07&quot;; 与 start_date 一致
    * required: Y
    */
    private String p_enddate;

    public String getP_enddate() { return this.p_enddate;}
    public void setP_enddate(String v) { this.p_enddate = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
