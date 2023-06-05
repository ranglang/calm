
    package com.onectrm.akshare.api.generated.currency;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: currency
    * 接口: currency_currencies
    * 目标地址: https://currencyscoop.com/
    * 描述: 获取所有货币的基础信息
    * 限量: 单次返回指定所有货币基础信息-免费账号每月限量访问 5000 次
    */
    public class currency_currenciesRequest extends AkShareRequestAndResponse {
    public currency_currenciesRequest(){
    setInterfaceName("currency_currencies");
    }

    public static String name() {
        return "currency_currencies";
    }
    public String getName() {
    return "currency_currencies";
    }

    public static currency_currenciesRequest of(


    String p_ctype,

    String p_apikey,


    Map.Entry
    <String
    , String>... others){
    currency_currenciesRequest t = new currency_currenciesRequest();


    t.p_ctype = p_ctype;
    t.other.put("c_type", p_ctype.toString());

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
    * name: c_type
    * type: str
    * desc: c_type=&quot;fiat&quot;
    * required: Y
    */
    private String p_ctype;

    public String getP_ctype() { return this.p_ctype;}
    public void setP_ctype(String v) { this.p_ctype = v;}

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
