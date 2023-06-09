
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_comment_detail_scrd_cost_em
    * 目标地址: https://data.eastmoney.com/stockcomment/stock/600000.html
    * 描述: 东方财富网-数据中心-特色数据-千股千评-市场热度-市场成本
    * 限量: 单次获取所有数据
    */
    public class stock_comment_detail_scrd_cost_emRequest extends AkShareRequestAndResponse {
    public stock_comment_detail_scrd_cost_emRequest(){
    setInterfaceName("stock_comment_detail_scrd_cost_em");
    }

    public static String name() {
        return "stock_comment_detail_scrd_cost_em";
    }
    public String getName() {
    return "stock_comment_detail_scrd_cost_em";
    }

    public static stock_comment_detail_scrd_cost_emRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    stock_comment_detail_scrd_cost_emRequest t = new stock_comment_detail_scrd_cost_emRequest();


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
    * desc: symbol=&quot;600000&quot;
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
