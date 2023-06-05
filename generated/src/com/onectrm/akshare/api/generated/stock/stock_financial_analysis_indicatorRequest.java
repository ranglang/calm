
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_financial_analysis_indicator
    * 目标地址: https://money.finance.sina.com.cn/corp/go.php/vFD_FinancialGuideLine/stockid/600004/ctrl/2019/displaytype/4.phtml
    * 描述: 新浪财经-财务分析-财务指标
    * 限量: 单次获取指定 symbol 财务指标所有历史数据
    */
    public class stock_financial_analysis_indicatorRequest extends AkShareRequestAndResponse {
    public stock_financial_analysis_indicatorRequest(){
    setInterfaceName("stock_financial_analysis_indicator");
    }

    public static String name() {
        return "stock_financial_analysis_indicator";
    }
    public String getName() {
    return "stock_financial_analysis_indicator";
    }

    public static stock_financial_analysis_indicatorRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    stock_financial_analysis_indicatorRequest t = new stock_financial_analysis_indicatorRequest();


    t.p_symbol = p_symbol;
    t.other.put("symbol", p_symbol.toString());


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
    * desc: symbol=&quot;600004&quot;; 股票代码
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
