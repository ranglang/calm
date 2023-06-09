
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_lhb_stock_statistic_em
    * 目标地址: https://data.eastmoney.com/stock/tradedetail.html
    * 描述: 东方财富网-数据中心-龙虎榜单-个股上榜统计
    * 限量: 单次返回所有历史数据
    */
    public class stock_lhb_stock_statistic_emRequest extends AkShareRequestAndResponse {
    public stock_lhb_stock_statistic_emRequest(){
    setInterfaceName("stock_lhb_stock_statistic_em");
    }

    public static String name() {
        return "stock_lhb_stock_statistic_em";
    }
    public String getName() {
    return "stock_lhb_stock_statistic_em";
    }

    public static stock_lhb_stock_statistic_emRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    stock_lhb_stock_statistic_emRequest t = new stock_lhb_stock_statistic_emRequest();


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
    * desc: symbol=&quot;近一月&quot;; choice of {&quot;近一月&quot;, &quot;近三月&quot;, &quot;近六月&quot;, &quot;近一年&quot;}
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
