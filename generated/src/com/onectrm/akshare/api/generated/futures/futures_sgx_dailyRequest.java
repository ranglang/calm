
    package com.onectrm.akshare.api.generated.futures;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: futures
    * 接口: futures_sgx_daily
    * 目标地址: https://www.sgx.com/zh-hans/research-education/derivatives
    * 描述: 主要提供开盘价、最高价、最低价、收盘价、结算价、成交量及未平仓合约数据, 数据于下个工作日新加坡时间下午 2 点起提供
    * 限量: 单次获取指定交易日前指定交易日天数的数据, 由于国内网络限制, 请使用代理访问
    */
    public class futures_sgx_dailyRequest extends AkShareRequestAndResponse {
    public futures_sgx_dailyRequest(){
    setInterfaceName("futures_sgx_daily");
    }

    public static String name() {
        return "futures_sgx_daily";
    }
    public String getName() {
    return "futures_sgx_daily";
    }

    public static futures_sgx_dailyRequest of(


    String p_tradedate,

    String p_recentday,


    Map.Entry
    <String
    , String>... others){
    futures_sgx_dailyRequest t = new futures_sgx_dailyRequest();


    t.p_tradedate = p_tradedate;
    t.other.put("trade_date", p_tradedate.toString());

    t.p_recentday = p_recentday;
    t.other.put("recent_day", p_recentday.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: trade_date
    * type: str
    * desc: 需要获取数据的指定日期, e.g., trade_date=&quot;20200306&quot;
    * required: 
    */
    private String p_tradedate;

    public String getP_tradedate() { return this.p_tradedate;}
    public void setP_tradedate(String v) { this.p_tradedate = v;}

    /**
    * name: recent_day
    * type: str
    * desc: 需要获取数据的指定日期的前 **recent_day** 的数据, e.g., recent_day=&quot;2&quot;
    * required: 
    */
    private String p_recentday;

    public String getP_recentday() { return this.p_recentday;}
    public void setP_recentday(String v) { this.p_recentday = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
