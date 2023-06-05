
    package com.onectrm.akshare.api.generated.dc;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: dc
    * 接口: crypto_hist
    * 目标地址: https://cn.investing.com/crypto/ethereum/historical-data
    * 描述: 加密货币的历史数据主要是日频, 周频和月频的数据; 该接口需要通过代理访问
    * 限量: 单次返回指定加密货币, 频率和时间周期的数据
    */
    public class crypto_histRequest extends AkShareRequestAndResponse {
    public crypto_histRequest(){
    setInterfaceName("crypto_hist");
    }

    public static String name() {
        return "crypto_hist";
    }
    public String getName() {
    return "crypto_hist";
    }

    public static crypto_histRequest of(


    String p_symbol,

    String p_period,

    String p_startdate,

    String p_enddate,


    Map.Entry
    <String
    , String>... others){
    crypto_histRequest t = new crypto_histRequest();


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
    * desc: symbol=&quot;BTC&quot;; 通过调用 **ak.crypto_name_url_table()** 获取所有货币对的名称, 选择其中的 symbol 即可
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: period
    * type: str
    * desc: period=&quot;每日&quot;; choice of {&quot;每日&quot;, &quot;每周&quot;, &quot;每月&quot;}
    * required: 
    */
    private String p_period;

    public String getP_period() { return this.p_period;}
    public void setP_period(String v) { this.p_period = v;}

    /**
    * name: start_date
    * type: str
    * desc: start_date=&quot;20191020&quot;
    * required: 
    */
    private String p_startdate;

    public String getP_startdate() { return this.p_startdate;}
    public void setP_startdate(String v) { this.p_startdate = v;}

    /**
    * name: end_date
    * type: str
    * desc: end_date=&quot;20201020&quot;
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
