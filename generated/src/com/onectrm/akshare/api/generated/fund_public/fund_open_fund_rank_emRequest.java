
    package com.onectrm.akshare.api.generated.fund_public;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fund_public
    * 接口: fund_open_fund_rank_em
    * 目标地址: http://fund.eastmoney.com/data/fundranking.html
    * 描述: 东方财富网-数据中心-开放式基金排行
    * 限量: 单次返回当前时刻所有数据
    */
    public class fund_open_fund_rank_emRequest extends AkShareRequestAndResponse {
    public fund_open_fund_rank_emRequest(){
    setInterfaceName("fund_open_fund_rank_em");
    }

    public static String name() {
        return "fund_open_fund_rank_em";
    }
    public String getName() {
    return "fund_open_fund_rank_em";
    }

    public static fund_open_fund_rank_emRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    fund_open_fund_rank_emRequest t = new fund_open_fund_rank_emRequest();


    t.p_symbol = p_symbol;
    t.other.put("symbol", p_symbol.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: symbol
    * type: str
    * desc: symbol=&quot;全部&quot;; choice of {&quot;全部&quot;, &quot;股票型&quot;, &quot;混合型&quot;, &quot;债券型&quot;, &quot;指数型&quot;, &quot;QDII&quot;, &quot;LOF&quot;, &quot;FOF&quot;}
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
