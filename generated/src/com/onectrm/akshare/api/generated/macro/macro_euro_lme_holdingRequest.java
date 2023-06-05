
    package com.onectrm.akshare.api.generated.macro;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_euro_lme_holding
    * 目标地址: https://datacenter.jin10.com/reportType/dc_lme_traders_report
    * 描述: 获取伦敦金属交易所(LME)-持仓报告, 数据区间从 20151022-至今
    * 限量: 单次返回所有历史数据
    */
    public class macro_euro_lme_holdingRequest extends AkShareRequestAndResponse {
    public macro_euro_lme_holdingRequest(){
    setInterfaceName("macro_euro_lme_holding");
    }

    public static String name() {
        return "macro_euro_lme_holding";
    }
    public String getName() {
    return "macro_euro_lme_holding";
    }

    public static macro_euro_lme_holdingRequest of(


    String p_wu2,


    Map.Entry
    <String
    , String>... others){
    macro_euro_lme_holdingRequest t = new macro_euro_lme_holdingRequest();


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
