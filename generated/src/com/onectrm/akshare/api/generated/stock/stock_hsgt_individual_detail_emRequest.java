
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_hsgt_individual_detail_em
    * 目标地址: http://data.eastmoney.com/hsgtcg/StockHdStatistics/002008.html(示例)
    * 描述: 东方财富网-数据中心-沪深港通-沪深港通持股-具体股票-个股详情
    * 限量: 单次获取指定 symbol 的在 start_date 和 end_date 之间的所有数据; 注意只能返回 90 个交易日内的数据
    */
    public class stock_hsgt_individual_detail_emRequest extends AkShareRequestAndResponse {
    public stock_hsgt_individual_detail_emRequest(){
    setInterfaceName("stock_hsgt_individual_detail_em");
    }

    public static String name() {
        return "stock_hsgt_individual_detail_em";
    }
    public String getName() {
    return "stock_hsgt_individual_detail_em";
    }

    public static stock_hsgt_individual_detail_emRequest of(


    String p_symbol,

    String p_startdate,

    String p_enddate,


    Map.Entry
    <String
    , String>... others){
    stock_hsgt_individual_detail_emRequest t = new stock_hsgt_individual_detail_emRequest();


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
    * desc: symbol=&quot;002008&quot;
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: start_date
    * type: str
    * desc: start_date=&quot;20210830&quot;; 注意只能返回离最近交易日 90 个交易日内的数据
    * required: 
    */
    private String p_startdate;

    public String getP_startdate() { return this.p_startdate;}
    public void setP_startdate(String v) { this.p_startdate = v;}

    /**
    * name: end_date
    * type: str
    * desc: end_date=&quot;20211026&quot;; 注意只能返回离最近交易日 90 个交易日内的数据
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
