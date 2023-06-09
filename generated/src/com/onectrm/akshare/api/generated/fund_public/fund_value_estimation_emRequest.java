
    package com.onectrm.akshare.api.generated.fund_public;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fund_public
    * 接口: fund_value_estimation_em
    * 目标地址: http://fund.eastmoney.com/fundguzhi.html
    * 描述: 东方财富网-数据中心-净值估算
    * 限量: 单次返回当前交易日指定 symbol 的所有数据
    */
    public class fund_value_estimation_emRequest extends AkShareRequestAndResponse {
    public fund_value_estimation_emRequest(){
    setInterfaceName("fund_value_estimation_em");
    }

    public static String name() {
        return "fund_value_estimation_em";
    }
    public String getName() {
    return "fund_value_estimation_em";
    }

    public static fund_value_estimation_emRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    fund_value_estimation_emRequest t = new fund_value_estimation_emRequest();


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
    * desc: symbol=&#39;全部&#39;; 默认返回所有数据; choice of {&#39;全部&#39;, &#39;股票型&#39;, &#39;混合型&#39;, &#39;债券型&#39;, &#39;指数型&#39;, &#39;QDII&#39;, &#39;ETF联接&#39;, &#39;LOF&#39;, &#39;场内交易基金&#39;}
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
