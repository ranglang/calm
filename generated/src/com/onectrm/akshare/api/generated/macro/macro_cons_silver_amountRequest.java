
    package com.onectrm.akshare.api.generated.macro;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_cons_silver_amount
    * 目标地址: https://datacenter.jin10.com/reportType/dc_eurozone_sentix_investor_confidence
    * 描述: 获取全球最大白银ETF--iShares Silver Trust持仓报告-总价值(美元), 数据区间从20060429-至今
    * 限量: 单次返回所有历史数据
    */
    public class macro_cons_silver_amountRequest extends AkShareRequestAndResponse {
    public macro_cons_silver_amountRequest(){
    setInterfaceName("macro_cons_silver_amount");
    }

    public static String name() {
        return "macro_cons_silver_amount";
    }
    public String getName() {
    return "macro_cons_silver_amount";
    }

    public static macro_cons_silver_amountRequest of(


    String p_wu2,


    Map.Entry
    <String
    , String>... others){
    macro_cons_silver_amountRequest t = new macro_cons_silver_amountRequest();


    t.p_wu2 = p_wu2;


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