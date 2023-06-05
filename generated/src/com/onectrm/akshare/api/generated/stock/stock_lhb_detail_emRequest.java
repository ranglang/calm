
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_lhb_detail_em
    * 目标地址: https://data.eastmoney.com/stock/tradedetail.html
    * 描述: 东方财富网-数据中心-龙虎榜单-龙虎榜详情
    * 限量: 单次返回所有历史数据
    */
    public class stock_lhb_detail_emRequest extends AkShareRequestAndResponse {
    public stock_lhb_detail_emRequest(){
    setInterfaceName("stock_lhb_detail_em");
    }

    public static String name() {
        return "stock_lhb_detail_em";
    }
    public String getName() {
    return "stock_lhb_detail_em";
    }

    public static stock_lhb_detail_emRequest of(


    String p_startdate,

    String p_enddate,


    Map.Entry
    <String
    , String>... others){
    stock_lhb_detail_emRequest t = new stock_lhb_detail_emRequest();


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
    * desc: start_date=&quot;20220314&quot;
    * required: 
    */
    private String p_startdate;

    public String getP_startdate() { return this.p_startdate;}
    public void setP_startdate(String v) { this.p_startdate = v;}

    /**
    * name: end_date
    * type: str
    * desc: end_date=&quot;20220315&quot;
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
