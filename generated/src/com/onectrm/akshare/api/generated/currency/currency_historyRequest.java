
    package com.onectrm.akshare.api.generated.currency;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: currency
    * 接口: currency_history
    * 目标地址: https://currencyscoop.com/
    * 描述: 获取货币报价历史数据
    * 限量: 单次返回指定货币在指定交易日的报价历史数据-免费账号每月限量访问 5000 次
    */
    public class currency_historyRequest extends AkShareRequestAndResponse {
    public currency_historyRequest(){
    setInterfaceName("currency_history");
    }

    public static String name() {
        return "currency_history";
    }
    public String getName() {
    return "currency_history";
    }

    public static currency_historyRequest of(


    String p_base,

    String p_date,

    String p_apikey,


    Map.Entry
    <String
    , String>... others){
    currency_historyRequest t = new currency_historyRequest();


    t.p_base = p_base;
    t.other.put("base", p_base.toString());

    t.p_date = p_date;
    t.other.put("date", p_date.toString());

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
    * name: date
    * type: str
    * desc: date=&quot;2020-02-03&quot;
    * required: Y
    */
    private String p_date;

    public String getP_date() { return this.p_date;}
    public void setP_date(String v) { this.p_date = v;}

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
