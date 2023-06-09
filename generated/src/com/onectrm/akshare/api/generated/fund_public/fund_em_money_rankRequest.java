
    package com.onectrm.akshare.api.generated.fund_public;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fund_public
    * 接口: fund_em_money_rank
    * 目标地址: http://fund.eastmoney.com/data/hbxfundranking.html
    * 描述: 东方财富网-数据中心-货币型基金排行
    * 限量: 单次返回当前时刻所有数据, 每个交易日 17 点后更新, 货币基金的单位净值均为 1.0000 元，最新一年期定存利率: 1.50%
    */
    public class fund_em_money_rankRequest extends AkShareRequestAndResponse {
    public fund_em_money_rankRequest(){
    setInterfaceName("fund_em_money_rank");
    }

    public static String name() {
        return "fund_em_money_rank";
    }
    public String getName() {
    return "fund_em_money_rank";
    }

    public static fund_em_money_rankRequest of(



    Map.Entry
    <String
    , String>... others){
    fund_em_money_rankRequest t = new fund_em_money_rankRequest();



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
