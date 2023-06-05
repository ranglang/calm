
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_xgsglb_em
    * 目标地址: http://data.eastmoney.com/xg/xg/default_2.html
    * 描述: 东方财富网-数据中心-新股数据-新股申购-新股申购与中签查询
    * 限量: 单次获取指定 market 的新股申购与中签查询数据
    */
    public class stock_xgsglb_emRequest extends AkShareRequestAndResponse {
    public stock_xgsglb_emRequest(){
    setInterfaceName("stock_xgsglb_em");
    }

    public static String name() {
        return "stock_xgsglb_em";
    }
    public String getName() {
    return "stock_xgsglb_em";
    }

    public static stock_xgsglb_emRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    stock_xgsglb_emRequest t = new stock_xgsglb_emRequest();


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
    * desc: symbol=&quot;全部股票&quot;; choice of {&quot;全部股票&quot;, &quot;沪市A股&quot;, &quot;科创板&quot;, &quot;深市A股&quot;, &quot;创业板&quot;, &quot;京市A股&quot;}
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
