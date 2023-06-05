
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_hsgt_stock_statistics_em
    * 目标地址: http://data.eastmoney.com/hsgtcg/StockStatistics.aspx
    * 描述: 东方财富网-数据中心-沪深港通-沪深港通持股-每日个股统计
    * 限量: 单次获取指定 market 的 start_date 和 end_date 之间的所有数据, 该接口只能获取近期的数据
    */
    public class stock_hsgt_stock_statistics_emRequest extends AkShareRequestAndResponse {
    public stock_hsgt_stock_statistics_emRequest(){
    setInterfaceName("stock_hsgt_stock_statistics_em");
    }

    public static String name() {
        return "stock_hsgt_stock_statistics_em";
    }
    public String getName() {
    return "stock_hsgt_stock_statistics_em";
    }

    public static stock_hsgt_stock_statistics_emRequest of(


    String p_symbol,

    String p_startdate,

    String p_enddate,


    Map.Entry
    <String
    , String>... others){
    stock_hsgt_stock_statistics_emRequest t = new stock_hsgt_stock_statistics_emRequest();


    t.p_symbol = p_symbol;
    t.other.put("symbol", p_symbol.toString());

    t.p_startdate = p_startdate;
    t.other.put("start_date", p_startdate.toString());

    t.p_enddate = p_enddate;
    t.other.put("end_date", p_enddate.toString());


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
    * desc: symbol=&quot;北向持股&quot;; choice of {&quot;北向持股&quot;, &quot;沪股通持股&quot;, &quot;深股通持股&quot;, &quot;南向持股&quot;}
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: start_date
    * type: str
    * desc: start_date=&quot;20210601&quot;; 此处指定近期交易日
    * required: 
    */
    private String p_startdate;

    public String getP_startdate() { return this.p_startdate;}
    public void setP_startdate(String v) { this.p_startdate = v;}

    /**
    * name: end_date
    * type: str
    * desc: end_date=&quot;20210608&quot;; 此处指定近期交易日
    * required: 
    */
    private String p_enddate;

    public String getP_enddate() { return this.p_enddate;}
    public void setP_enddate(String v) { this.p_enddate = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
