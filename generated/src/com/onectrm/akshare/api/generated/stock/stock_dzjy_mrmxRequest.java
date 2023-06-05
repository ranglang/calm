
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_dzjy_mrmx
    * 目标地址: http://data.eastmoney.com/dzjy/dzjy_mrmxa.aspx
    * 描述: 东方财富网-数据中心-大宗交易-每日明细
    * 限量: 单次返回所有历史数据
    */
    public class stock_dzjy_mrmxRequest extends AkShareRequestAndResponse {
    public stock_dzjy_mrmxRequest(){
    setInterfaceName("stock_dzjy_mrmx");
    }

    public static String name() {
        return "stock_dzjy_mrmx";
    }
    public String getName() {
    return "stock_dzjy_mrmx";
    }

    public static stock_dzjy_mrmxRequest of(


    String p_symbol,

    String p_startdate,

    String p_enddate,


    Map.Entry
    <String
    , String>... others){
    stock_dzjy_mrmxRequest t = new stock_dzjy_mrmxRequest();


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
    * desc: symbol=&#39;债券&#39;; choice of {&#39;A股&#39;, &#39;B股&#39;, &#39;基金&#39;, &#39;债券&#39;}
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: start_date
    * type: str
    * desc: start_date=&#39;20201123&#39;; 开始日期
    * required: 
    */
    private String p_startdate;

    public String getP_startdate() { return this.p_startdate;}
    public void setP_startdate(String v) { this.p_startdate = v;}

    /**
    * name: end_date
    * type: sr
    * desc: end_date=&#39;20201204&#39;; 结束日期
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
