
    package com.onectrm.akshare.api.generated.fund_public;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fund_public
    * 接口: fund_graded_fund_daily_em
    * 目标地址: http://fund.eastmoney.com/fjjj.html#1_1__0__zdf,desc_1
    * 描述: 东方财富网-天天基金网-基金数据-分级基金-实时数据, 此接口数据每个交易日 **16:00～23:00**
    * 限量: 单次返回当前时刻所有历史数据
    */
    public class fund_graded_fund_daily_emRequest extends AkShareRequestAndResponse {
    public fund_graded_fund_daily_emRequest(){
    setInterfaceName("fund_graded_fund_daily_em");
    }

    public static String name() {
        return "fund_graded_fund_daily_em";
    }
    public String getName() {
    return "fund_graded_fund_daily_em";
    }

    public static fund_graded_fund_daily_emRequest of(



    Map.Entry
    <String
    , String>... others){
    fund_graded_fund_daily_emRequest t = new fund_graded_fund_daily_emRequest();



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
