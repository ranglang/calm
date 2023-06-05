
    package com.onectrm.akshare.api.generated.others;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: others
    * 接口: stock_js_weibo_report
    * 目标地址: https://datacenter.jin10.com/market
    * 描述: 微博舆情报告中近期受关注的股票
    * 限量: 单次返回指定时间内微博舆情报告中近期受关注的股票
    */
    public class stock_js_weibo_reportRequest extends AkShareRequestAndResponse {
    public stock_js_weibo_reportRequest(){
    setInterfaceName("stock_js_weibo_report");
    }

    public static String name() {
        return "stock_js_weibo_report";
    }
    public String getName() {
    return "stock_js_weibo_report";
    }

    public static stock_js_weibo_reportRequest of(


    String p_timeperiod,


    Map.Entry
    <String
    , String>... others){
    stock_js_weibo_reportRequest t = new stock_js_weibo_reportRequest();


    t.p_timeperiod = p_timeperiod;
    t.other.put("time_period", p_timeperiod.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: time_period
    * type: str
    * desc: time_period=&quot;CNHOUR12&quot;; 详见下表**time_period参数一览表**, 可通过调用 **stock_js_weibo_nlp_time** 获取
    * required: 
    */
    private String p_timeperiod;

    public String getP_timeperiod() { return this.p_timeperiod;}
    public void setP_timeperiod(String v) { this.p_timeperiod = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
