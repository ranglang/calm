
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_hk_eniu_indicator
    * 目标地址: https://eniu.com/gu/hk01093/roe
    * 描述: 亿牛网-港股个股指标: 市盈率, 市净率, 股息率, ROE, 市值
    * 限量: 单次获取指定 symbol 和 indicator 的所有历史数据
    */
    public class stock_hk_eniu_indicatorRequest extends AkShareRequestAndResponse {
    public stock_hk_eniu_indicatorRequest(){
    setInterfaceName("stock_hk_eniu_indicator");
    }

    public static String name() {
        return "stock_hk_eniu_indicator";
    }
    public String getName() {
    return "stock_hk_eniu_indicator";
    }

    public static stock_hk_eniu_indicatorRequest of(


    String p_symbol,

    String p_indicator,


    Map.Entry
    <String
    , String>... others){
    stock_hk_eniu_indicatorRequest t = new stock_hk_eniu_indicatorRequest();


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
    * desc: symbol=&quot;hk01093&quot;; 可通过调用 **ak.stock_hk_eniu_indicator(symbol=&quot;hk01093&quot;, indicator=&quot;港股&quot;)** 获取股票代码
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: indicator
    * type: str
    * desc: indicator=&quot;港股&quot;; choice of {&quot;港股&quot;, &quot;市盈率&quot;, &quot;市净率&quot;, &quot;股息率&quot;, &quot;ROE&quot;, &quot;市值&quot;}
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
