
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_hsgt_individual_em
    * 目标地址: http://data.eastmoney.com/hsgtcg/StockHdStatistics/002008.html(示例)
    * 描述: 东方财富网-数据中心-沪深港通-沪深港通持股-具体股票
    * 限量: 单次获取指定 stock 的近期数据
    */
    public class stock_hsgt_individual_emRequest extends AkShareRequestAndResponse {
    public stock_hsgt_individual_emRequest(){
    setInterfaceName("stock_hsgt_individual_em");
    }

    public static String name() {
        return "stock_hsgt_individual_em";
    }
    public String getName() {
    return "stock_hsgt_individual_em";
    }

    public static stock_hsgt_individual_emRequest of(


    String p_stock,


    Map.Entry
    <String
    , String>... others){
    stock_hsgt_individual_emRequest t = new stock_hsgt_individual_emRequest();


    t.p_stock = p_stock;
    t.other.put("stock", p_stock.toString());


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
    * desc: stock=&quot;002008&quot;
    * required: 
    */
    private String p_stock;

    public String getP_stock() { return this.p_stock;}
    public void setP_stock(String v) { this.p_stock = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
