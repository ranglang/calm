
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_individual_fund_flow
    * 目标地址: http://data.eastmoney.com/zjlx/detail.html
    * 描述: 东方财富网-数据中心-个股资金流向
    * 限量: 单次获取指定市场和股票的近 100 个交易日的资金流数据
    */
    public class stock_individual_fund_flowRequest extends AkShareRequestAndResponse {
    public stock_individual_fund_flowRequest(){
    setInterfaceName("stock_individual_fund_flow");
    }

    public static String name() {
        return "stock_individual_fund_flow";
    }
    public String getName() {
    return "stock_individual_fund_flow";
    }

    public static stock_individual_fund_flowRequest of(


    String p_stock,

    String p_market,


    Map.Entry
    <String
    , String>... others){
    stock_individual_fund_flowRequest t = new stock_individual_fund_flowRequest();


    t.p_stock = p_stock;
    t.other.put("stock", p_stock.toString());

    t.p_market = p_market;
    t.other.put("market", p_market.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: stock
    * type: str
    * desc: stock=&quot;000425&quot;; 股票代码
    * required: 
    */
    private String p_stock;

    public String getP_stock() { return this.p_stock;}
    public void setP_stock(String v) { this.p_stock = v;}

    /**
    * name: market
    * type: str
    * desc: market=&quot;sh&quot;; 上海证券交易所: sh, 深证证券交易所: sz
    * required: 
    */
    private String p_market;

    public String getP_market() { return this.p_market;}
    public void setP_market(String v) { this.p_market = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
