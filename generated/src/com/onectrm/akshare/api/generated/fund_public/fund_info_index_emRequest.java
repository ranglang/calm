
    package com.onectrm.akshare.api.generated.fund_public;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fund_public
    * 接口: fund_info_index_em
    * 目标地址: http://fund.eastmoney.com/trade/zs.html
    * 描述: 东方财富网-天天基金网-基金数据-基金基本信息-指数型
    * 限量: 单次返回当前时刻所有历史数据
    */
    public class fund_info_index_emRequest extends AkShareRequestAndResponse {
    public fund_info_index_emRequest(){
    setInterfaceName("fund_info_index_em");
    }

    public static String name() {
        return "fund_info_index_em";
    }
    public String getName() {
    return "fund_info_index_em";
    }

    public static fund_info_index_emRequest of(


    String p_symbol,

    String p_indicator,


    Map.Entry
    <String
    , String>... others){
    fund_info_index_emRequest t = new fund_info_index_emRequest();


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
    * desc: symbol=&quot;全部&quot;; choice of {&quot;全部&quot;, &quot;沪深指数&quot;, &quot;行业主题&quot;, &quot;大盘指数&quot;, &quot;中盘指数&quot;, &quot;小盘指数&quot;, &quot;股票指数&quot;, &quot;债券指数&quot;}
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: indicator
    * type: str
    * desc: indicator=&quot;全部&quot;; choice of {&quot;全部&quot;, &quot;被动指数型&quot;, &quot;增强指数型&quot;}
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
