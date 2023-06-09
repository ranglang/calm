
    package com.onectrm.akshare.api.generated.dc;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: dc
    * 接口: crypto_bitcoin_hold_report
    * 目标地址: https://datacenter.jin10.com/dc_report?name=bitcoint
    * 描述: 获取比特币持仓报告
    * 限量: 单次返回当前时点的比特币持仓报告数据
    */
    public class crypto_bitcoin_hold_reportRequest extends AkShareRequestAndResponse {
    public crypto_bitcoin_hold_reportRequest(){
    setInterfaceName("crypto_bitcoin_hold_report");
    }

    public static String name() {
        return "crypto_bitcoin_hold_report";
    }
    public String getName() {
    return "crypto_bitcoin_hold_report";
    }

    public static crypto_bitcoin_hold_reportRequest of(


    String p_wu2,


    Map.Entry
    <String
    , String>... others){
    crypto_bitcoin_hold_reportRequest t = new crypto_bitcoin_hold_reportRequest();


    t.p_wu2 = p_wu2;
    t.other.put("无", p_wu2.toString());


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
