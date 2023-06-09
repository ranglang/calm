
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_price_js
    * 目标地址: https://www.ushknews.com/report.html
    * 描述: 美港电讯-美港目标价数据
    * 限量: 单次获取所有数据, 数据从 2019-至今
    */
    public class stock_price_jsRequest extends AkShareRequestAndResponse {
    public stock_price_jsRequest(){
    setInterfaceName("stock_price_js");
    }

    public static String name() {
        return "stock_price_js";
    }
    public String getName() {
    return "stock_price_js";
    }

    public static stock_price_jsRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    stock_price_jsRequest t = new stock_price_jsRequest();


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
    * desc: symbol=&quot;us&quot;; choice of {&quot;us&quot;, &quot;hk&quot;}
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
