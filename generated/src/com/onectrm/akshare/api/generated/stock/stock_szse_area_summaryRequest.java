
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_szse_area_summary
    * 目标地址: http://www.szse.cn/market/overview/index.html
    * 描述: 深圳证券交易所-市场总貌-地区交易排序
    * 限量: 单次返回指定 date 的市场总貌数据-地区交易排序数据
    */
    public class stock_szse_area_summaryRequest extends AkShareRequestAndResponse {
    public stock_szse_area_summaryRequest(){
    setInterfaceName("stock_szse_area_summary");
    }

    public static String name() {
        return "stock_szse_area_summary";
    }
    public String getName() {
    return "stock_szse_area_summary";
    }

    public static stock_szse_area_summaryRequest of(


    String p_date,


    Map.Entry
    <String
    , String>... others){
    stock_szse_area_summaryRequest t = new stock_szse_area_summaryRequest();


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
    * desc: date=&quot;202203&quot;; 年月
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
