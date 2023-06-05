
    package com.onectrm.akshare.api.generated.index;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: index
    * 接口: index_investing_global_from_url
    * 目标地址: https://www.investing.com/indices/ftse-epra-nareit-eurozone
    * 描述: 世界主要国家的各种指数, 该接口需要通过代理访问; 该接口只需要输入相应指数的 URL 地址
    * 限量: 单次返回某一个国家的具体某一个指数, 建议用 for 循环获取多个国家的多个指数, 注意不要大量获取, 以免给对方服务器造成压力!
    */
    public class index_investing_global_from_urlRequest extends AkShareRequestAndResponse {
    public index_investing_global_from_urlRequest(){
    setInterfaceName("index_investing_global_from_url");
    }

    public static String name() {
        return "index_investing_global_from_url";
    }
    public String getName() {
    return "index_investing_global_from_url";
    }

    public static index_investing_global_from_urlRequest of(


    String p_url,

    String p_period,

    String p_startdate,

    String p_enddate,


    Map.Entry
    <String
    , String>... others){
    index_investing_global_from_urlRequest t = new index_investing_global_from_urlRequest();


    t.p_url = p_url;
    t.other.put("url", p_url.toString());

    t.p_period = p_period;
    t.other.put("period", p_period.toString());

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
    * name: url
    * type: str
    * desc: url=&quot;https://www.investing.com/indices/ftse-epra-nareit-eurozone&quot;; 具体指数的页面 URL 地址
    * required: 
    */
    private String p_url;

    public String getP_url() { return this.p_url;}
    public void setP_url(String v) { this.p_url = v;}

    /**
    * name: period
    * type: str
    * desc: period=&quot;每月&quot;; choice of {&quot;每日&quot;, &quot;每周&quot;, &quot;每月&quot;}
    * required: 
    */
    private String p_period;

    public String getP_period() { return this.p_period;}
    public void setP_period(String v) { this.p_period = v;}

    /**
    * name: start_date
    * type: str
    * desc: start_date=&#39;20000101&#39;
    * required: 
    */
    private String p_startdate;

    public String getP_startdate() { return this.p_startdate;}
    public void setP_startdate(String v) { this.p_startdate = v;}

    /**
    * name: end_date
    * type: str
    * desc: end_date=&#39;20191017&#39;
    * required: 
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
