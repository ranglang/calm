
    package com.onectrm.akshare.api.generated.fx;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fx
    * 接口: currency_hist
    * 目标地址: https://cn.investing.com/currencies/
    * 描述: 获取指定外币对指定时间的历史数据, 此接口需要使用代理访问
    * 限量: 单次返回指定时间的所有历史数据
    */
    public class currency_histRequest extends AkShareRequestAndResponse {
    public currency_histRequest(){
    setInterfaceName("currency_hist");
    }

    public static String name() {
        return "currency_hist";
    }
    public String getName() {
    return "currency_hist";
    }

    public static currency_histRequest of(


    String p_symbol,

    String p_startdate,

    String p_enddate,


    Map.Entry
    <String
    , String>... others){
    currency_histRequest t = new currency_histRequest();


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
    * desc: symbol=&quot;usd-jpy&quot;; 可以通过 **currency_name_code** 查询该两种货币可以获取的所有货币对或通过 **currency_pair_map** 获取指定币种的所有货币对
    * required: Y
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: start_date
    * type: str
    * desc: start_date=&quot;20050101&quot;
    * required: Y
    */
    private String p_startdate;

    public String getP_startdate() { return this.p_startdate;}
    public void setP_startdate(String v) { this.p_startdate = v;}

    /**
    * name: end_date
    * type: str
    * desc: end_date=&quot;20200117&quot;
    * required: Y
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
