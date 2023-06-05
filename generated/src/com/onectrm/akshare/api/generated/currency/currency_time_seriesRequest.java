
    package com.onectrm.akshare.api.generated.currency;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: currency
    * 接口: currency_time_series
    * 目标地址: https://currencyscoop.com/
    * 描述: 获取货币报价时间序列数据
    * 限量: 单次返回指定货币在指定交易日到另一指定交易日的报价数据-免费账号每月限量访问 5000 次
    */
    public class currency_time_seriesRequest extends AkShareRequestAndResponse {
    public currency_time_seriesRequest(){
    setInterfaceName("currency_time_series");
    }

    public static String name() {
        return "currency_time_series";
    }
    public String getName() {
    return "currency_time_series";
    }

    public static currency_time_seriesRequest of(


    String p_base,

    String p_startdate,

    String p_enddate,

    String p_apikey,


    Map.Entry
    <String
    , String>... others){
    currency_time_seriesRequest t = new currency_time_seriesRequest();


    t.p_base = p_base;
    t.other.put("base", p_base.toString());

    t.p_startdate = p_startdate;
    t.other.put("start_date", p_startdate.toString());

    t.p_enddate = p_enddate;
    t.other.put("end_date", p_enddate.toString());

    t.p_apikey = p_apikey;
    t.other.put("api_key", p_apikey.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: base
    * type: str
    * desc: base=&quot;USD&quot;
    * required: Y
    */
    private String p_base;

    public String getP_base() { return this.p_base;}
    public void setP_base(String v) { this.p_base = v;}

    /**
    * name: start_date
    * type: str
    * desc: start_date=&quot;2020-02-03&quot;
    * required: Y
    */
    private String p_startdate;

    public String getP_startdate() { return this.p_startdate;}
    public void setP_startdate(String v) { this.p_startdate = v;}

    /**
    * name: end_date
    * type: str
    * desc: end_date=&quot;2020-03-04&quot;
    * required: Y
    */
    private String p_enddate;

    public String getP_enddate() { return this.p_enddate;}
    public void setP_enddate(String v) { this.p_enddate = v;}

    /**
    * name: api_key
    * type: str
    * desc: api_key=&quot;Please put your api key here&quot;; you can register [currencyscoop](https://currencyscoop.com/), [Gmail](http://mail.google.com/) well be better
    * required: Y
    */
    private String p_apikey;

    public String getP_apikey() { return this.p_apikey;}
    public void setP_apikey(String v) { this.p_apikey = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
