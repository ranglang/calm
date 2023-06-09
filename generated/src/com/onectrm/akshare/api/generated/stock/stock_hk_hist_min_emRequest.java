
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_hk_hist_min_em
    * 目标地址: http://quote.eastmoney.com/hk/00948.html
    * 描述: 东方财富网-行情首页-港股-每日分时行情
    * 限量: 单次返回指定上市公司最近 5 个交易日分钟数据, 注意港股有延时
    */
    public class stock_hk_hist_min_emRequest extends AkShareRequestAndResponse {
    public stock_hk_hist_min_emRequest(){
    setInterfaceName("stock_hk_hist_min_em");
    }

    public static String name() {
        return "stock_hk_hist_min_em";
    }
    public String getName() {
    return "stock_hk_hist_min_em";
    }

    public static stock_hk_hist_min_emRequest of(


    String p_symbol,

    String p_period,

    String p_adjust,

    String p_startdate,

    String p_enddate,


    Map.Entry
    <String
    , String>... others){
    stock_hk_hist_min_emRequest t = new stock_hk_hist_min_emRequest();


    t.p_symbol = p_symbol;
    t.other.put("symbol", p_symbol.toString());

    t.p_period = p_period;
    t.other.put("period", p_period.toString());

    t.p_adjust = p_adjust;
    t.other.put("adjust", p_adjust.toString());

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
    * desc: symbol=&quot;01611&quot;; 港股代码可以通过 **ak.stock_hk_spot_em** 函数返回所有的 pandas.DataFrame 里面的 `代码` 字段获取
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: period
    * type: str
    * desc: period=&#39;5&#39;; choice of {&#39;1&#39;, &#39;5&#39;, &#39;15&#39;, &#39;30&#39;, &#39;60&#39;}; 其中 1 分钟数据返回近 5 个交易日数据且不复权
    * required: 
    */
    private String p_period;

    public String getP_period() { return this.p_period;}
    public void setP_period(String v) { this.p_period = v;}

    /**
    * name: adjust
    * type: str
    * desc: adjust=&#39;&#39;; choice of {&#39;&#39;, &#39;qfq&#39;, &#39;hfq&#39;}; &#39;&#39;: 不复权, &#39;qfq&#39;: 前复权, &#39;hfq&#39;: 后复权, 其中 1 分钟数据返回近 5 个交易日数据且不复权
    * required: 
    */
    private String p_adjust;

    public String getP_adjust() { return this.p_adjust;}
    public void setP_adjust(String v) { this.p_adjust = v;}

    /**
    * name: start_date
    * type: str
    * desc: start_date=&quot;1979-09-01 09:32:00&quot;; 日期时间; 默认返回所有数据
    * required: 
    */
    private String p_startdate;

    public String getP_startdate() { return this.p_startdate;}
    public void setP_startdate(String v) { this.p_startdate = v;}

    /**
    * name: end_date
    * type: str
    * desc: end_date=&quot;2222-01-01 09:32:00&quot;; 日期时间; 默认返回所有数据
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
