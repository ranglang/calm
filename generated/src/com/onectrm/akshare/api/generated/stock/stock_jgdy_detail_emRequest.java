
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_jgdy_detail_em
    * 目标地址: http://data.eastmoney.com/jgdy/xx.html
    * 描述: 东方财富网-数据中心-特色数据-机构调研-机构调研详细
    * 限量: 单次所有历史数据, 由于数据量比较大需要等待一定时间
    */
    public class stock_jgdy_detail_emRequest extends AkShareRequestAndResponse {
    public stock_jgdy_detail_emRequest(){
    setInterfaceName("stock_jgdy_detail_em");
    }

    public static String name() {
        return "stock_jgdy_detail_em";
    }
    public String getName() {
    return "stock_jgdy_detail_em";
    }

    public static stock_jgdy_detail_emRequest of(


    String p_date,


    Map.Entry
    <String
    , String>... others){
    stock_jgdy_detail_emRequest t = new stock_jgdy_detail_emRequest();


    t.p_date = p_date;
    t.other.put("date", p_date.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: date
    * type: str
    * desc: date=&quot;20180928&quot;; 开始查询的时间
    * required: 
    */
    private String p_date;

    public String getP_date() { return this.p_date;}
    public void setP_date(String v) { this.p_date = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
