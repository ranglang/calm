
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_a_pe_and_pb
    * 目标地址: https://legulegu.com/stockdata/hs300-ttm-lyr https://legulegu.com/stockdata/hs300-pb
    * 描述: 乐咕乐股-指定市场的A股的市盈率和市净率，包括等权和加权。目标的两个网页分别展示市盈率和市净率，但实际上是来自同一个API的数据
    * 限量: 单次获取指定 market 的所有数据
    */
    public class stock_a_pe_and_pbRequest extends AkShareRequestAndResponse {
    public stock_a_pe_and_pbRequest(){
    setInterfaceName("stock_a_pe_and_pb");
    }

    public static String name() {
        return "stock_a_pe_and_pb";
    }
    public String getName() {
    return "stock_a_pe_and_pb";
    }

    public static stock_a_pe_and_pbRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    stock_a_pe_and_pbRequest t = new stock_a_pe_and_pbRequest();


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
    * desc: symbol=&quot;000300.SH&quot;; 参见 **stock_a_pe_and_pb** 一览表
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
