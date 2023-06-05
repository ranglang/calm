
    package com.onectrm.akshare.api.generated.macros;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_china_central_bank_balance
    * 目标地址: http://finance.sina.com.cn/mac/#fininfo-8-0-31-2
    * 描述: 国家统计局-央行货币当局资产负债
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_central_bank_balanceRequest extends AkShareRequestAndResponse {
    public macro_china_central_bank_balanceRequest(){
    setInterfaceName("macro_china_central_bank_balance");
    }

    public static String name() {
        return "macro_china_central_bank_balance";
    }
    public String getName() {
    return "macro_china_central_bank_balance";
    }

    public static macro_china_central_bank_balanceRequest of(


    String p_wu2,


    Map.Entry
    <String
    , String>... others){
    macro_china_central_bank_balanceRequest t = new macro_china_central_bank_balanceRequest();


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
