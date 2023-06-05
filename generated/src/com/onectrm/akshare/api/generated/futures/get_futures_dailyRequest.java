
    package com.onectrm.akshare.api.generated.futures;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: futures
    * 接口: get_futures_daily
    * 目标地址: 各交易所网站
    * 描述: 提供各交易所各品种的网站的历史行情数据, 其中 20040625, 20070604, 20081226, 20090119 原网页数据缺失
    * 限量: 单次返回指定时间段指定交易所的所有期货品种历史数据
    */
    public class get_futures_dailyRequest extends AkShareRequestAndResponse {
    public get_futures_dailyRequest(){
    setInterfaceName("get_futures_daily");
    }

    public static String name() {
        return "get_futures_daily";
    }
    public String getName() {
    return "get_futures_daily";
    }

    public static get_futures_dailyRequest of(


    String p_startdate,

    String p_enddate,

    String p_market,

    String p_indexbar,


    Map.Entry
    <String
    , String>... others){
    get_futures_dailyRequest t = new get_futures_dailyRequest();


    t.p_startdate = p_startdate;
    t.other.put("start_date", p_startdate.toString());

    t.p_enddate = p_enddate;
    t.other.put("end_date", p_enddate.toString());

    t.p_market = p_market;
    t.other.put("market", p_market.toString());

    t.p_indexbar = p_indexbar;
    t.other.put("index_bar", p_indexbar.toString());


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
    * desc: start_date=&quot;20200701&quot;
    * required: 
    */
    private String p_startdate;

    public String getP_startdate() { return this.p_startdate;}
    public void setP_startdate(String v) { this.p_startdate = v;}

    /**
    * name: end_date
    * type: str
    * desc: end_date=&quot;20200716&quot;
    * required: 
    */
    private String p_enddate;

    public String getP_enddate() { return this.p_enddate;}
    public void setP_enddate(String v) { this.p_enddate = v;}

    /**
    * name: market
    * type: str
    * desc: market=&quot;DCE&quot;; choice of {&quot;CFFEX&quot;, &quot;INE&quot;, &quot;CZCE&quot;, &quot;DCE&quot;, &quot;SHFE&quot;}
    * required: 
    */
    private String p_market;

    public String getP_market() { return this.p_market;}
    public void setP_market(String v) { this.p_market = v;}

    /**
    * name: index_bar
    * type: str
    * desc: index_bar=False; 是否合成指数
    * required: 
    */
    private String p_indexbar;

    public String getP_indexbar() { return this.p_indexbar;}
    public void setP_indexbar(String v) { this.p_indexbar = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
