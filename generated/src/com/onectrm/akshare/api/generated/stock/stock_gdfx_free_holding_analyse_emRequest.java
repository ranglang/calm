
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_gdfx_free_holding_analyse_em
    * 目标地址: https://data.eastmoney.com/gdfx/HoldingAnalyse.html
    * 描述: 东方财富网-数据中心-股东分析-股东持股分析-十大流通股东
    * 限量: 单次获取返回所有数据
    */
    public class stock_gdfx_free_holding_analyse_emRequest extends AkShareRequestAndResponse {
    public stock_gdfx_free_holding_analyse_emRequest(){
    setInterfaceName("stock_gdfx_free_holding_analyse_em");
    }

    public static String name() {
        return "stock_gdfx_free_holding_analyse_em";
    }
    public String getName() {
    return "stock_gdfx_free_holding_analyse_em";
    }

    public static stock_gdfx_free_holding_analyse_emRequest of(


    String p_date,


    Map.Entry
    <String
    , String>... others){
    stock_gdfx_free_holding_analyse_emRequest t = new stock_gdfx_free_holding_analyse_emRequest();


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
    * desc: date=&quot;20210930&quot;; 财报发布季度最后日
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
