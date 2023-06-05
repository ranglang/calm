
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_hk_hist
    * 目标地址: http://quote.eastmoney.com/hk/08367.html
    * 描述: 港股-历史行情数据, 可以选择返回复权后数据, 更新频率为日频
    * 限量: 单次返回指定上市公司的历史行情数据
    */
    public class stock_hk_histRequest extends AkShareRequestAndResponse {
    public stock_hk_histRequest(){
    setInterfaceName("stock_hk_hist");
    }

    public static String name() {
        return "stock_hk_hist";
    }
    public String getName() {
    return "stock_hk_hist";
    }

    public static stock_hk_histRequest of(


    String p_symbol,

    String p_period,

    String p_startdate,

    String p_enddate,

    String p_adjust,


    Map.Entry
    <String
    , String>... others){
    stock_hk_histRequest t = new stock_hk_histRequest();


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
    * desc: symbol=&quot;00593&quot;; 港股代码,可以通过 **ak.stock_hk_spot_em()** 函数返回所有港股代码
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
    * desc: start_date=&quot;19700101&quot;; 开始日期
    * required: 
    */
    private String p_startdate;

    public String getP_startdate() { return this.p_startdate;}
    public void setP_startdate(String v) { this.p_startdate = v;}

    /**
    * name: end_date
    * type: str
    * desc: end_date=&quot;22220101&quot;; 结束日期
    * required: 
    */
    private String p_enddate;

    public String getP_enddate() { return this.p_enddate;}
    public void setP_enddate(String v) { this.p_enddate = v;}

    /**
    * name: adjust
    * type: str
    * desc: adjust=&quot;&quot;: 返回未复权的数据, 默认; qfq: 返回前复权数据; hfq: 返回后复权数据;
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
