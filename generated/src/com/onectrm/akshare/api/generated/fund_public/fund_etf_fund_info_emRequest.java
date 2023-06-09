
    package com.onectrm.akshare.api.generated.fund_public;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fund_public
    * 接口: fund_etf_fund_info_em
    * 目标地址: http://fundf10.eastmoney.com/jjjz_004186.html
    * 描述: 东方财富网站-天天基金网-基金数据-场内交易基金-历史净值数据
    * 限量: 单次返回当前时刻所有历史数据
    */
    public class fund_etf_fund_info_emRequest extends AkShareRequestAndResponse {
    public fund_etf_fund_info_emRequest(){
    setInterfaceName("fund_etf_fund_info_em");
    }

    public static String name() {
        return "fund_etf_fund_info_em";
    }
    public String getName() {
    return "fund_etf_fund_info_em";
    }

    public static fund_etf_fund_info_emRequest of(


    String p_fund,

    String p_startdate,

    String p_enddate,


    Map.Entry
    <String
    , String>... others){
    fund_etf_fund_info_emRequest t = new fund_etf_fund_info_emRequest();


    t.p_fund = p_fund;
    t.other.put("fund", p_fund.toString());

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
    * name: fund
    * type: str
    * desc: fund=&quot;511280&quot;; 基金代码, 可以通过调用 **fund_etf_fund_daily_em** 获取
    * required: 
    */
    private String p_fund;

    public String getP_fund() { return this.p_fund;}
    public void setP_fund(String v) { this.p_fund = v;}

    /**
    * name: start_date
    * type: str
    * desc: start_date=&quot;20000101&quot;; 开始时间
    * required: 
    */
    private String p_startdate;

    public String getP_startdate() { return this.p_startdate;}
    public void setP_startdate(String v) { this.p_startdate = v;}

    /**
    * name: end_date
    * type: str
    * desc: end_date=&quot;20500101&quot;; 结束时间
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
