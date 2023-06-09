
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_hsgt_board_rank_em
    * 目标地址: http://data.eastmoney.com/hsgtcg/hy.html
    * 描述: 东方财富网-数据中心-沪深港通持股-板块排行
    * 限量: 单次获取指定 symbol 和 indicator 的所有数据
    */
    public class stock_hsgt_board_rank_emRequest extends AkShareRequestAndResponse {
    public stock_hsgt_board_rank_emRequest(){
    setInterfaceName("stock_hsgt_board_rank_em");
    }

    public static String name() {
        return "stock_hsgt_board_rank_em";
    }
    public String getName() {
    return "stock_hsgt_board_rank_em";
    }

    public static stock_hsgt_board_rank_emRequest of(


    String p_symbol,

    String p_indicator,


    Map.Entry
    <String
    , String>... others){
    stock_hsgt_board_rank_emRequest t = new stock_hsgt_board_rank_emRequest();


    t.p_symbol = p_symbol;
    t.other.put("symbol", p_symbol.toString());

    t.p_indicator = p_indicator;
    t.other.put("indicator", p_indicator.toString());


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
    * desc: symbol=&quot;北向资金增持行业板块排行&quot;; choice of {&quot;北向资金增持行业板块排行&quot;, &quot;北向资金增持概念板块排行&quot;, &quot;北向资金增持地域板块排行&quot;}
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: indicator
    * type: str
    * desc: indicator=&quot;今日&quot;; choice of {&quot;今日&quot;, &quot;3日&quot;, &quot;5日&quot;, &quot;10日&quot;, &quot;1月&quot;, &quot;1季&quot;, &quot;1年&quot;}
    * required: 
    */
    private String p_indicator;

    public String getP_indicator() { return this.p_indicator;}
    public void setP_indicator(String v) { this.p_indicator = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
