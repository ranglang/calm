
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_us_fundamental
    * 目标地址: https://www.macrotrends.net/stocks/charts/AAPL/apple/pe-ratio
    * 描述: 美股的基本财务数据, 目前提供 PB 和 PE 的数据
    * 限量: 单次返回指定美股和指标的所有数据
    */
    public class stock_us_fundamentalRequest extends AkShareRequestAndResponse {
    public stock_us_fundamentalRequest(){
    setInterfaceName("stock_us_fundamental");
    }

    public static String name() {
        return "stock_us_fundamental";
    }
    public String getName() {
    return "stock_us_fundamental";
    }

    public static stock_us_fundamentalRequest of(


    String p_stock,

    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    stock_us_fundamentalRequest t = new stock_us_fundamentalRequest();


    t.p_stock = p_stock;
    t.other.put("stock", p_stock.toString());

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
    * name: stock
    * type: str
    * desc: stock=&quot;GOOGL&quot;; 美股 ticker, 可以通过调用 **ak.stock_us_fundamental(symbol=&quot;info&quot;)** 获取所有 ticker
    * required: 
    */
    private String p_stock;

    public String getP_stock() { return this.p_stock;}
    public void setP_stock(String v) { this.p_stock = v;}

    /**
    * name: symbol
    * type: str
    * desc: symbol=&quot;info&quot;; info: 返回所有美股列表, PE: 返回 PE 数据, PB: 返回 PB 数据
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
