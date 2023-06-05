
    package com.onectrm.akshare.api.generated.index;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: index
    * 接口: index_zh_a_hist
    * 目标地址: http://quote.eastmoney.com/center/hszs.html
    * 描述: 东方财富网-中国股票指数-行情数据
    * 限量: 单次返回具体指数指定 period 从 start_date 到 end_date 的之间的近期数据
    */
    public class index_zh_a_histRequest extends AkShareRequestAndResponse {
    public index_zh_a_histRequest(){
    setInterfaceName("index_zh_a_hist");
    }

    public static String name() {
        return "index_zh_a_hist";
    }
    public String getName() {
    return "index_zh_a_hist";
    }

    public static index_zh_a_histRequest of(


    String p_symbol,

    String p_period,

    String p_startdate,

    String p_enddate,


    Map.Entry
    <String
    , String>... others){
    index_zh_a_histRequest t = new index_zh_a_histRequest();


    t.p_symbol = p_symbol;
    t.other.put("symbol", p_symbol.toString());

    t.p_period = p_period;
    t.other.put("period", p_period.toString());

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
    * desc: symbol=&quot;399282&quot;; 指数代码，此处不用市场标识
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: period
    * type: str
    * desc: period=&quot;daily&quot;; choice of {&#39;daily&#39;, &#39;weekly&#39;, &#39;monthly&#39;}
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
    * desc: end_date=&quot;22220101&quot;; 结束时间
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
