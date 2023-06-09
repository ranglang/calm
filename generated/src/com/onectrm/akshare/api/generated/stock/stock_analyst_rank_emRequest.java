
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_analyst_rank_em
    * 目标地址: http://data.eastmoney.com/invest/invest/list.html
    * 描述: 东方财富网-数据中心-研究报告-东方财富分析师指数-东方财富分析师指数最新排行
    * 限量: 单次获取指定年份的所有数据
    */
    public class stock_analyst_rank_emRequest extends AkShareRequestAndResponse {
    public stock_analyst_rank_emRequest(){
    setInterfaceName("stock_analyst_rank_em");
    }

    public static String name() {
        return "stock_analyst_rank_em";
    }
    public String getName() {
    return "stock_analyst_rank_em";
    }

    public static stock_analyst_rank_emRequest of(


    String p_year,


    Map.Entry
    <String
    , String>... others){
    stock_analyst_rank_emRequest t = new stock_analyst_rank_emRequest();


    t.p_year = p_year;
    t.other.put("year", p_year.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: year
    * type: str
    * desc: year=&#39;2020&#39;; 从 2015 年至今
    * required: 
    */
    private String p_year;

    public String getP_year() { return this.p_year;}
    public void setP_year(String v) { this.p_year = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
