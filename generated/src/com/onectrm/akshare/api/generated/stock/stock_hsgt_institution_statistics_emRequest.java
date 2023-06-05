
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_hsgt_institution_statistics_em
    * 目标地址: http://data.eastmoney.com/hsgtcg/InstitutionStatistics.aspx
    * 描述: 东方财富网-数据中心-沪深港通-沪深港通持股-机构排行
    * 限量: 单次获取指定 market 的所有数据, 该接口只能获取近期的数据
    */
    public class stock_hsgt_institution_statistics_emRequest extends AkShareRequestAndResponse {
    public stock_hsgt_institution_statistics_emRequest(){
    setInterfaceName("stock_hsgt_institution_statistics_em");
    }

    public static String name() {
        return "stock_hsgt_institution_statistics_em";
    }
    public String getName() {
    return "stock_hsgt_institution_statistics_em";
    }

    public static stock_hsgt_institution_statistics_emRequest of(


    String p_market,

    String p_startdate,

    String p_enddate,


    Map.Entry
    <String
    , String>... others){
    stock_hsgt_institution_statistics_emRequest t = new stock_hsgt_institution_statistics_emRequest();


    t.p_market = p_market;
    t.other.put("market", p_market.toString());

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
    * name: market
    * type: str
    * desc: market=&quot;北向持股&quot;; choice of {&quot;北向持股&quot;, &quot;沪股通持股&quot;, &quot;深股通持股&quot;, &quot;南向持股&quot;}
    * required: 
    */
    private String p_market;

    public String getP_market() { return this.p_market;}
    public void setP_market(String v) { this.p_market = v;}

    /**
    * name: start_date
    * type: str
    * desc: start_date=&quot;20201218&quot;; 此处指定近期交易日
    * required: 
    */
    private String p_startdate;

    public String getP_startdate() { return this.p_startdate;}
    public void setP_startdate(String v) { this.p_startdate = v;}

    /**
    * name: end_date
    * type: str
    * desc: end_date=&quot;20201218&quot;; 此处指定近期交易日
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
