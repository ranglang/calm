
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_dzjy_mrtj
    * 目标地址: http://data.eastmoney.com/dzjy/dzjy_mrtj.aspx
    * 描述: 东方财富网-数据中心-大宗交易-每日统计
    * 限量: 单次返回所有历史数据
    */
    public class stock_dzjy_mrtjRequest extends AkShareRequestAndResponse {
    public stock_dzjy_mrtjRequest(){
    setInterfaceName("stock_dzjy_mrtj");
    }

    public static String name() {
        return "stock_dzjy_mrtj";
    }
    public String getName() {
    return "stock_dzjy_mrtj";
    }

    public static stock_dzjy_mrtjRequest of(


    String p_startdate,

    String p_enddate,


    Map.Entry
    <String
    , String>... others){
    stock_dzjy_mrtjRequest t = new stock_dzjy_mrtjRequest();


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
    * name: start_date
    * type: str
    * desc: start_date=&#39;20220105&#39;; 开始日期
    * required: 
    */
    private String p_startdate;

    public String getP_startdate() { return this.p_startdate;}
    public void setP_startdate(String v) { this.p_startdate = v;}

    /**
    * name: end_date
    * type: sr
    * desc: end_date=&#39;20220105&#39;; 结束日期
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
