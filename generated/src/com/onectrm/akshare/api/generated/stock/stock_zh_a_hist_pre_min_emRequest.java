
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_zh_a_hist_pre_min_em
    * 目标地址: http://quote.eastmoney.com/concept/sh603777.html?from=classic
    * 描述: 东方财富-股票行情-盘前数据
    * 限量: 单次返回指定当前交易日的股票分钟数据, 包含盘前分钟数据
    */
    public class stock_zh_a_hist_pre_min_emRequest extends AkShareRequestAndResponse {
    public stock_zh_a_hist_pre_min_emRequest(){
    setInterfaceName("stock_zh_a_hist_pre_min_em");
    }

    public static String name() {
        return "stock_zh_a_hist_pre_min_em";
    }
    public String getName() {
    return "stock_zh_a_hist_pre_min_em";
    }

    public static stock_zh_a_hist_pre_min_emRequest of(


    String p_symbol,

    String p_startdate,

    String p_enddate,


    Map.Entry
    <String
    , String>... others){
    stock_zh_a_hist_pre_min_emRequest t = new stock_zh_a_hist_pre_min_emRequest();


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
    * desc: symbol=&quot;000001&quot;; 股票代码
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: start_date
    * type: str
    * desc: start_date=&quot;09:00:00&quot;; 时间; 默认返回所有数据
    * required: 
    */
    private String p_startdate;

    public String getP_startdate() { return this.p_startdate;}
    public void setP_startdate(String v) { this.p_startdate = v;}

    /**
    * name: end_date
    * type: str
    * desc: end_date=&quot;15:40:00&quot;; 时间; 默认返回所有数据
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
