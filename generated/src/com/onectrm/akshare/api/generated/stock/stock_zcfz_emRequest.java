
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_zcfz_em
    * 目标地址: http://data.eastmoney.com/bbsj/202003/zcfz.html
    * 描述: 东方财富-数据中心-年报季报-业绩快报-资产负债表
    * 限量: 单次获取指定 date 的资产负债表数据
    */
    public class stock_zcfz_emRequest extends AkShareRequestAndResponse {
    public stock_zcfz_emRequest(){
    setInterfaceName("stock_zcfz_em");
    }

    public static String name() {
        return "stock_zcfz_em";
    }
    public String getName() {
    return "stock_zcfz_em";
    }

    public static stock_zcfz_emRequest of(


    String p_date,


    Map.Entry
    <String
    , String>... others){
    stock_zcfz_emRequest t = new stock_zcfz_emRequest();


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
    * desc: date=&quot;20200331&quot;; choice of {&quot;XXXX0331&quot;, &quot;XXXX0630&quot;, &quot;XXXX0930&quot;, &quot;XXXX1231&quot;}; 从 20081231 开始
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
