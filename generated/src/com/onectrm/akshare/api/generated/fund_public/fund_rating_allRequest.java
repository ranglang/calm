
    package com.onectrm.akshare.api.generated.fund_public;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fund_public
    * 接口: fund_rating_all
    * 目标地址: http://fund.eastmoney.com/data/fundrating.html
    * 描述: 获取天天基金网-基金评级-基金评级总汇
    * 限量: 单次返回所有基金评级数据
    */
    public class fund_rating_allRequest extends AkShareRequestAndResponse {
    public fund_rating_allRequest(){
    setInterfaceName("fund_rating_all");
    }

    public static String name() {
        return "fund_rating_all";
    }
    public String getName() {
    return "fund_rating_all";
    }

    public static fund_rating_allRequest of(



    Map.Entry
    <String
    , String>... others){
    fund_rating_allRequest t = new fund_rating_allRequest();



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
