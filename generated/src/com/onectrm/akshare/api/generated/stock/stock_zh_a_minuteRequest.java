
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_zh_a_minute
    * 目标地址: http://finance.sina.com.cn/realstock/company/sh600519/nc.shtml
    * 描述: 新浪财经-沪深京 A 股股票或者指数的分时数据，目前可以获取 1, 5, 15, 30, 60 分钟的数据频率, 可以指定是否复权
    * 限量: 单次返回指定股票或指数的指定频率的最近交易日的历史分时行情数据
    */
    public class stock_zh_a_minuteRequest extends AkShareRequestAndResponse {
    public stock_zh_a_minuteRequest(){
    setInterfaceName("stock_zh_a_minute");
    }

    public static String name() {
        return "stock_zh_a_minute";
    }
    public String getName() {
    return "stock_zh_a_minute";
    }

    public static stock_zh_a_minuteRequest of(


    String p_symbol,

    String p_period,

    String p_adjust,


    Map.Entry
    <String
    , String>... others){
    stock_zh_a_minuteRequest t = new stock_zh_a_minuteRequest();


    t.p_symbol = p_symbol;
    t.other.put("symbol", p_symbol.toString());

    t.p_period = p_period;
    t.other.put("period", p_period.toString());

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
    * desc: symbol=&#39;sh000300&#39;; 同日频率数据接口
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: period
    * type: str
    * desc: period=&#39;1&#39;; 获取 1, 5, 15, 30, 60 分钟的数据频率
    * required: 
    */
    private String p_period;

    public String getP_period() { return this.p_period;}
    public void setP_period(String v) { this.p_period = v;}

    /**
    * name: adjust
    * type: str
    * desc: adjust=&quot;&quot;; 默认为空: 返回不复权的数据; qfq: 返回前复权后的数据; hfq: 返回后复权后的数据;
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
