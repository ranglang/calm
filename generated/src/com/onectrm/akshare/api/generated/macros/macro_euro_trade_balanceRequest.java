
    package com.onectrm.akshare.api.generated.macros;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_euro_trade_balance
    * 目标地址: https://datacenter.jin10.com/reportType/dc_eurozone_trade_balance_mom
    * 描述: 获取欧元区未季调贸易帐报告, 数据区间从19990201-至今
    * 限量: 单次返回所有历史数据
    */
    public class macro_euro_trade_balanceRequest extends AkShareRequestAndResponse {
    public macro_euro_trade_balanceRequest(){
    setInterfaceName("macro_euro_trade_balance");
    }

    public static String name() {
        return "macro_euro_trade_balance";
    }
    public String getName() {
    return "macro_euro_trade_balance";
    }

    public static macro_euro_trade_balanceRequest of(


    String p_wu2,


    Map.Entry
    <String
    , String>... others){
    macro_euro_trade_balanceRequest t = new macro_euro_trade_balanceRequest();


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
