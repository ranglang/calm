
    package com.onectrm.akshare.api.generated.bond;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: bond
    * 接口: bond_cov_comparison
    * 目标地址: http://quote.eastmoney.com/center/fullscreenlist.html#convertible_comparison
    * 描述: 东方财富网-行情中心-债券市场-可转债比价表
    * 限量: 单次返回当前交易时刻的所有可转债比价数据
    */
    public class bond_cov_comparisonRequest extends AkShareRequestAndResponse {
    public bond_cov_comparisonRequest(){
    setInterfaceName("bond_cov_comparison");
    }

    public static String name() {
        return "bond_cov_comparison";
    }
    public String getName() {
    return "bond_cov_comparison";
    }

    public static bond_cov_comparisonRequest of(



    Map.Entry
    <String
    , String>... others){
    bond_cov_comparisonRequest t = new bond_cov_comparisonRequest();



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
