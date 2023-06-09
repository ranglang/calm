
    package com.onectrm.akshare.api.generated.fund_public;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fund_public
    * 接口: fund_name_em
    * 目标地址: http://fund.eastmoney.com/fund.html
    * 描述: 东方财富网-天天基金网-基金数据-所有基金的基本信息数据
    * 限量: 单次返回当前时刻所有历史数据
    */
    public class fund_name_emRequest extends AkShareRequestAndResponse {
    public fund_name_emRequest(){
    setInterfaceName("fund_name_em");
    }

    public static String name() {
        return "fund_name_em";
    }
    public String getName() {
    return "fund_name_em";
    }

    public static fund_name_emRequest of(



    Map.Entry
    <String
    , String>... others){
    fund_name_emRequest t = new fund_name_emRequest();



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
