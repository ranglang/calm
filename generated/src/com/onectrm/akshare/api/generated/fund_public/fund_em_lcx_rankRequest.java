
    package com.onectrm.akshare.api.generated.fund_public;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fund_public
    * 接口: fund_em_lcx_rank
    * 目标地址: http://fund.eastmoney.com/data/lcxfundranking.html#t;c0;r;sSYL_Z;ddesc;pn50;f;os1;
    * 描述: 东方财富网-数据中心-理财基金排行, 每个交易日17点后更新, 货币基金的单位净值均为 1.0000 元，最新一年期定存利率: 1.50%
    * 限量: 由于目标网站没有数据，该接口暂时未能返回数据
    */
    public class fund_em_lcx_rankRequest extends AkShareRequestAndResponse {
    public fund_em_lcx_rankRequest(){
    setInterfaceName("fund_em_lcx_rank");
    }

    public static String name() {
        return "fund_em_lcx_rank";
    }
    public String getName() {
    return "fund_em_lcx_rank";
    }

    public static fund_em_lcx_rankRequest of(



    Map.Entry
    <String
    , String>... others){
    fund_em_lcx_rankRequest t = new fund_em_lcx_rankRequest();



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
