
    package com.onectrm.akshare.api.generated.bond;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: bond
    * 接口: bond_zh_cov
    * 目标地址: http://data.eastmoney.com/kzz/default.html
    * 描述: 东方财富网-数据中心-新股数据-可转债数据一览表
    * 限量: 单次返回当前交易时刻的所有可转债数据
    */
    public class bond_zh_covRequest extends AkShareRequestAndResponse {
    public bond_zh_covRequest(){
    setInterfaceName("bond_zh_cov");
    }

    public static String name() {
        return "bond_zh_cov";
    }
    public String getName() {
    return "bond_zh_cov";
    }

    public static bond_zh_covRequest of(



    Map.Entry
    <String
    , String>... others){
    bond_zh_covRequest t = new bond_zh_covRequest();



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
