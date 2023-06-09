
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_changes_em
    * 目标地址: http://quote.eastmoney.com/changes/
    * 描述: 东方财富-行情中心-盘口异动数据
    * 限量: 单次指定 symbol 的最近交易日的盘口异动数据
    */
    public class stock_changes_emRequest extends AkShareRequestAndResponse {
    public stock_changes_emRequest(){
    setInterfaceName("stock_changes_em");
    }

    public static String name() {
        return "stock_changes_em";
    }
    public String getName() {
    return "stock_changes_em";
    }

    public static stock_changes_emRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    stock_changes_emRequest t = new stock_changes_emRequest();


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
    * desc: symbol=&quot;大笔买入&quot;; choice of {&#39;火箭发射&#39;, &#39;快速反弹&#39;, &#39;大笔买入&#39;, &#39;封涨停板&#39;, &#39;打开跌停板&#39;, &#39;有大买盘&#39;, &#39;竞价上涨&#39;, &#39;高开5日线&#39;, &#39;向上缺口&#39;, &#39;60日新高&#39;, &#39;60日大幅上涨&#39;, &#39;加速下跌&#39;, &#39;高台跳水&#39;, &#39;大笔卖出&#39;, &#39;封跌停板&#39;, &#39;打开涨停板&#39;, &#39;有大卖盘&#39;, &#39;竞价下跌&#39;, &#39;低开5日线&#39;, &#39;向下缺口&#39;, &#39;60日新低&#39;, &#39;60日大幅下跌&#39;}
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
