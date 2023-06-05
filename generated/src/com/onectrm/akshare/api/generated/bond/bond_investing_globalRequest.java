
    package com.onectrm.akshare.api.generated.bond;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: bond
    * 接口: bond_investing_global
    * 目标地址: https://cn.investing.com/rates-bonds
    * 描述: 获取全球政府债券行情与收益率; 该接口需要通过代理访问, 由于涉及国家和债券多(**近1000**个债券)具体参见[国家-债券目录](https://cn.investing.com/rates-bonds/world-government-bonds?maturity_from=10&amp;maturity_to=310)
    * 限量: 单次返回某一个国家的具体某一个指数, 建议用 for 循环获取多个国家的多个指数, 注意不要大量获取, 以免给对方服务器造成压力!
    */
    public class bond_investing_globalRequest extends AkShareRequestAndResponse {
    public bond_investing_globalRequest(){
    setInterfaceName("bond_investing_global");
    }

    public static String name() {
        return "bond_investing_global";
    }
    public String getName() {
    return "bond_investing_global";
    }

    public static bond_investing_globalRequest of(


    String p_country,

    String p_indexname,

    String p_period,

    String p_startdate,

    String p_enddate,


    Map.Entry
    <String
    , String>... others){
    bond_investing_globalRequest t = new bond_investing_globalRequest();


    t.p_country = p_country;
    t.other.put("country", p_country.toString());

    t.p_indexname = p_indexname;
    t.other.put("index_name", p_indexname.toString());

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
    * name: country
    * type: str
    * desc: country=&quot;中国&quot;
    * required: 
    */
    private String p_country;

    public String getP_country() { return this.p_country;}
    public void setP_country(String v) { this.p_country = v;}

    /**
    * name: index_name
    * type: str
    * desc: index_name=&quot;中国1年期国债&quot;; 可以通过 ak.bond_investing_global_country_name_url(country=&quot;美国&quot;) 获取
    * required: 
    */
    private String p_indexname;

    public String getP_indexname() { return this.p_indexname;}
    public void setP_indexname(String v) { this.p_indexname = v;}

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
