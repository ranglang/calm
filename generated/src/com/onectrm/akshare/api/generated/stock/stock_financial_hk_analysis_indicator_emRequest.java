
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_financial_hk_analysis_indicator_em
    * 目标地址: https://emweb.securities.eastmoney.com/PC_HKF10/NewFinancialAnalysis/index?type=web&amp;code=00700
    * 描述: 东方财富-港股-财务分析-主要指标
    * 限量: 单次获取财务指标所有历史数据
    */
    public class stock_financial_hk_analysis_indicator_emRequest extends AkShareRequestAndResponse {
    public stock_financial_hk_analysis_indicator_emRequest(){
    setInterfaceName("stock_financial_hk_analysis_indicator_em");
    }

    public static String name() {
        return "stock_financial_hk_analysis_indicator_em";
    }
    public String getName() {
    return "stock_financial_hk_analysis_indicator_em";
    }

    public static stock_financial_hk_analysis_indicator_emRequest of(


    String p_symbol,

    String p_indicator,


    Map.Entry
    <String
    , String>... others){
    stock_financial_hk_analysis_indicator_emRequest t = new stock_financial_hk_analysis_indicator_emRequest();


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
    * name: symbol
    * type: str
    * desc: symbol=&quot;00700&quot;; 股票代码
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: indicator
    * type: str
    * desc: indicator=&quot;年度&quot;; choice of {&quot;年度&quot;, &quot;报告期&quot;}
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
