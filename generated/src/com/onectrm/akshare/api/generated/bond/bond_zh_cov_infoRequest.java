
    package com.onectrm.akshare.api.generated.bond;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: bond
    * 接口: bond_zh_cov_info
    * 目标地址: https://data.eastmoney.com/kzz/detail/123121.html
    * 描述: 东方财富网-数据中心-新股数据-可转债详情
    * 限量: 单次返回指定 symbol 的可转债详情数据
    */
    public class bond_zh_cov_infoRequest extends AkShareRequestAndResponse {
    public bond_zh_cov_infoRequest(){
    setInterfaceName("bond_zh_cov_info");
    }

    public static String name() {
        return "bond_zh_cov_info";
    }
    public String getName() {
    return "bond_zh_cov_info";
    }

    public static bond_zh_cov_infoRequest of(



    Map.Entry
    <String
    , String>... others){
    bond_zh_cov_infoRequest t = new bond_zh_cov_infoRequest();



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
