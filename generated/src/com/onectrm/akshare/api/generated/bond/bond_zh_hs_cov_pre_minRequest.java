
    package com.onectrm.akshare.api.generated.bond;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: bond
    * 接口: bond_zh_hs_cov_pre_min
    * 目标地址: https://quote.eastmoney.com/concept/sz128039.html
    * 描述: 东方财富网-可转债-分时行情-盘前分时
    * 限量: 单次返回指定可转债在最近交易日的盘前分时数据
    */
    public class bond_zh_hs_cov_pre_minRequest extends AkShareRequestAndResponse {
    public bond_zh_hs_cov_pre_minRequest(){
    setInterfaceName("bond_zh_hs_cov_pre_min");
    }

    public static String name() {
        return "bond_zh_hs_cov_pre_min";
    }
    public String getName() {
    return "bond_zh_hs_cov_pre_min";
    }

    public static bond_zh_hs_cov_pre_minRequest of(



    Map.Entry
    <String
    , String>... others){
    bond_zh_hs_cov_pre_minRequest t = new bond_zh_hs_cov_pre_minRequest();



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
