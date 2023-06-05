
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_fhps_em
    * 目标地址: http://data.eastmoney.com/yjfp/
    * 描述: 东方财富-数据中心-年报季报-分红配送
    * 限量: 单次获取指定日期的分红配送数据
    */
    public class stock_fhps_emRequest extends AkShareRequestAndResponse {
    public stock_fhps_emRequest(){
    setInterfaceName("stock_fhps_em");
    }

    public static String name() {
        return "stock_fhps_em";
    }
    public String getName() {
    return "stock_fhps_em";
    }

    public static stock_fhps_emRequest of(


    String p_date,


    Map.Entry
    <String
    , String>... others){
    stock_fhps_emRequest t = new stock_fhps_emRequest();


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
    * desc: date=&quot;20201231&quot;; choice of {&quot;XXXX0630&quot;, &quot;XXXX1231&quot;}; 从 19901231 开始
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
