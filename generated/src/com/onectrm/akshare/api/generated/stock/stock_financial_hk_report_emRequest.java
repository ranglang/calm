
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_financial_hk_report_em
    * 目标地址: https://emweb.securities.eastmoney.com/PC_HKF10/FinancialAnalysis/index?type=web&amp;code=00700
    * 描述: 东方财富-港股-财务报表-三大报表
    * 限量: 单次获取指定报表的所有年份数据
    */
    public class stock_financial_hk_report_emRequest extends AkShareRequestAndResponse {
    public stock_financial_hk_report_emRequest(){
    setInterfaceName("stock_financial_hk_report_em");
    }

    public static String name() {
        return "stock_financial_hk_report_em";
    }
    public String getName() {
    return "stock_financial_hk_report_em";
    }

    public static stock_financial_hk_report_emRequest of(


    String p_stock,

    String p_symbol,

    String p_indicator,


    Map.Entry
    <String
    , String>... others){
    stock_financial_hk_report_emRequest t = new stock_financial_hk_report_emRequest();


    t.p_stock = p_stock;
    t.other.put("stock", p_stock.toString());

    t.p_symbol = p_symbol;
    t.other.put("symbol", p_symbol.toString());

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
    * name: stock
    * type: str
    * desc: stock=&quot;00700&quot;; 股票代码
    * required: 
    */
    private String p_stock;

    public String getP_stock() { return this.p_stock;}
    public void setP_stock(String v) { this.p_stock = v;}

    /**
    * name: symbol
    * type: str
    * desc: symbol=&quot;现金流量表&quot;; choice of {&quot;资产负债表&quot;, &quot;利润表&quot;, &quot;现金流量表&quot;}
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: indicator
    * type: str
    * desc: symbol=&quot;年度&quot;; choice of {&quot;年度&quot;, &quot;报告期&quot;}
    * required: 
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
