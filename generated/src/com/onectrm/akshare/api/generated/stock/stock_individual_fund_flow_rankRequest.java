
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_individual_fund_flow_rank
    * 目标地址: http://data.eastmoney.com/zjlx/detail.html
    * 描述: 获取东方财富网-数据中心-资金流向-排名
    * 限量: 单次获取指定类型的个股资金流排名数据
    */
    public class stock_individual_fund_flow_rankRequest extends AkShareRequestAndResponse {
    public stock_individual_fund_flow_rankRequest(){
    setInterfaceName("stock_individual_fund_flow_rank");
    }

    public static String name() {
        return "stock_individual_fund_flow_rank";
    }
    public String getName() {
    return "stock_individual_fund_flow_rank";
    }

    public static stock_individual_fund_flow_rankRequest of(


    String p_indicator,


    Map.Entry
    <String
    , String>... others){
    stock_individual_fund_flow_rankRequest t = new stock_individual_fund_flow_rankRequest();


    t.p_indicator = p_indicator;
    t.other.put("indicator", p_indicator.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: indicator
    * type: str
    * desc: indicator=&quot;今日&quot;; choice {&quot;今日&quot;, &quot;3日&quot;, &quot;5日&quot;, &quot;10日&quot;}
    * required: Y
    */
    private String p_indicator;

    public String getP_indicator() { return this.p_indicator;}
    public void setP_indicator(String v) { this.p_indicator = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
