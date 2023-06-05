
    package com.onectrm.akshare.api.generated.dc;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: dc
    * 接口: crypto_bitcoin_cme
    * 目标地址: https://datacenter.jin10.com/reportType/dc_cme_btc_report
    * 描述: 获取芝加哥商业交易所-比特币成交量报告
    * 限量: 单次返回指定交易日的比特币成交量报告数据
    */
    public class crypto_bitcoin_cmeRequest extends AkShareRequestAndResponse {
    public crypto_bitcoin_cmeRequest(){
    setInterfaceName("crypto_bitcoin_cme");
    }

    public static String name() {
        return "crypto_bitcoin_cme";
    }
    public String getName() {
    return "crypto_bitcoin_cme";
    }

    public static crypto_bitcoin_cmeRequest of(


    String p_date,


    Map.Entry
    <String
    , String>... others){
    crypto_bitcoin_cmeRequest t = new crypto_bitcoin_cmeRequest();


    t.p_date = p_date;
    t.other.put("date", p_date.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: date
    * type: str
    * desc: date=&quot;20210621&quot;
    * required: Y
    */
    private String p_date;

    public String getP_date() { return this.p_date;}
    public void setP_date(String v) { this.p_date = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
