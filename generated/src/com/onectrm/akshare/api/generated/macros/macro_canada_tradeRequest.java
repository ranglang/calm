
    package com.onectrm.akshare.api.generated.macros;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_canada_trade
    * 目标地址: http://data.eastmoney.com/cjsj/foreign_7_2.html
    * 描述: 东方财富-经济数据-加拿大-贸易帐
    * 限量: 单次返回所有历史数据
    */
    public class macro_canada_tradeRequest extends AkShareRequestAndResponse {
    public macro_canada_tradeRequest(){
    setInterfaceName("macro_canada_trade");
    }

    public static String name() {
        return "macro_canada_trade";
    }
    public String getName() {
    return "macro_canada_trade";
    }

    public static macro_canada_tradeRequest of(


    String p_wu2,


    Map.Entry
    <String
    , String>... others){
    macro_canada_tradeRequest t = new macro_canada_tradeRequest();


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
    * required: 
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
