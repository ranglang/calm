
    package com.onectrm.akshare.api.generated.fund_public;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fund_public
    * 接口: fund_em_hk_rank
    * 目标地址: http://overseas.1234567.com.cn/FundList
    * 描述: 获取东方财富网-数据中心-基金排行-香港基金排行
    * 限量: 单次返回当前时刻所有数据
    */
    public class fund_em_hk_rankRequest extends AkShareRequestAndResponse {
    public fund_em_hk_rankRequest(){
    setInterfaceName("fund_em_hk_rank");
    }

    public static String name() {
        return "fund_em_hk_rank";
    }
    public String getName() {
    return "fund_em_hk_rank";
    }

    public static fund_em_hk_rankRequest of(



    Map.Entry
    <String
    , String>... others){
    fund_em_hk_rankRequest t = new fund_em_hk_rankRequest();



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
