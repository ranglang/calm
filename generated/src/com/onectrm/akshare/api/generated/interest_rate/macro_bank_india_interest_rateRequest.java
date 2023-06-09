
    package com.onectrm.akshare.api.generated.interest_rate;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: interest_rate
    * 接口: macro_bank_india_interest_rate
    * 目标地址: https://datacenter.jin10.com/reportType/dc_india_interest_rate_decision
    * 描述: 印度利率决议报告, 数据区间从 20000801-至今
    * 限量: 单次返回所有历史数据
    */
    public class macro_bank_india_interest_rateRequest extends AkShareRequestAndResponse {
    public macro_bank_india_interest_rateRequest(){
    setInterfaceName("macro_bank_india_interest_rate");
    }

    public static String name() {
        return "macro_bank_india_interest_rate";
    }
    public String getName() {
    return "macro_bank_india_interest_rate";
    }

    public static macro_bank_india_interest_rateRequest of(



    Map.Entry
    <String
    , String>... others){
    macro_bank_india_interest_rateRequest t = new macro_bank_india_interest_rateRequest();



    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }




    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
