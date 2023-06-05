
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_zh_a_hist
    * 目标地址: http://quote.eastmoney.com/concept/sh603777.html?from=classic(示例)
    * 描述: 东方财富-沪深京 A 股日频率数据; 历史数据按日频率更新, 当日收盘价请在收盘后获取
    * 限量: 单次返回指定沪深京 A 股上市公司、指定周期和指定日期间的历史行情日频率数据
    */
    public class stock_zh_a_histRequest extends AkShareRequestAndResponse {
    public stock_zh_a_histRequest(){
    setInterfaceName("stock_zh_a_hist");
    }

    public static String name() {
        return "stock_zh_a_hist";
    }
    public String getName() {
    return "stock_zh_a_hist";
    }

    public static stock_zh_a_histRequest of(


    String p_symbol,

    String p_period,

    String p_startdate,

    String p_enddate,

    String p_adjust,


    Map.Entry
    <String
    , String>... others){
    stock_zh_a_histRequest t = new stock_zh_a_histRequest();


    t.p_symbol = p_symbol;
    t.other.put("symbol", p_symbol.toString());

    t.p_period = p_period;
    t.other.put("period", p_period.toString());

    t.p_startdate = p_startdate;
    t.other.put("start_date", p_startdate.toString());

    t.p_enddate = p_enddate;
    t.other.put("end_date", p_enddate.toString());

    t.p_adjust = p_adjust;
    t.other.put("adjust", p_adjust.toString());


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
    * desc: symbol=&#39;603777&#39;; 股票代码可以在 **ak.stock_zh_a_spot_em()** 中获取
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: period
    * type: str
    * desc: period=&#39;daily&#39;; choice of {&#39;daily&#39;, &#39;weekly&#39;, &#39;monthly&#39;}
    * required: 
    */
    private String p_period;

    public String getP_period() { return this.p_period;}
    public void setP_period(String v) { this.p_period = v;}

    /**
    * name: start_date
    * type: str
    * desc: start_date=&#39;20210301&#39;; 开始查询的日期
    * required: 
    */
    private String p_startdate;

    public String getP_startdate() { return this.p_startdate;}
    public void setP_startdate(String v) { this.p_startdate = v;}

    /**
    * name: end_date
    * type: str
    * desc: end_date=&#39;20210616&#39;; 结束查询的日期
    * required: 
    */
    private String p_enddate;

    public String getP_enddate() { return this.p_enddate;}
    public void setP_enddate(String v) { this.p_enddate = v;}

    /**
    * name: adjust
    * type: str
    * desc: 默认返回不复权的数据; qfq: 返回前复权后的数据; hfq: 返回后复权后的数据
    * required: 
    */
    private String p_adjust;

    public String getP_adjust() { return this.p_adjust;}
    public void setP_adjust(String v) { this.p_adjust = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
