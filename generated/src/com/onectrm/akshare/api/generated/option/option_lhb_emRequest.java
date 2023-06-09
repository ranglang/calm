
    package com.onectrm.akshare.api.generated.option;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: option
    * 接口: option_lhb_em
    * 目标地址: https://data.eastmoney.com/other/qqlhb.html
    * 描述: 东方财富网-数据中心-特色数据-期权龙虎榜单-金融期权
    * 限量: 单次返回指定 symbol, indicator 和 trade_date 的所有数据
    */
    public class option_lhb_emRequest extends AkShareRequestAndResponse {
    public option_lhb_emRequest(){
    setInterfaceName("option_lhb_em");
    }

    public static String name() {
        return "option_lhb_em";
    }
    public String getName() {
    return "option_lhb_em";
    }

    public static option_lhb_emRequest of(


    String p_symbol,

    String p_indicator,

    String p_tradedate,


    Map.Entry
    <String
    , String>... others){
    option_lhb_emRequest t = new option_lhb_emRequest();


    t.p_symbol = p_symbol;
    t.other.put("symbol", p_symbol.toString());

    t.p_indicator = p_indicator;
    t.other.put("indicator", p_indicator.toString());

    t.p_tradedate = p_tradedate;
    t.other.put("trade_date", p_tradedate.toString());


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
    * desc: symbol=&quot;510050&quot;; choice of {&quot;510050&quot;, &quot;510300&quot;, &quot;159919&quot;}
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: indicator
    * type: str
    * desc: indicator=&quot;期权交易情况-认沽交易量&quot;; choice of {&quot;期权交易情况-认沽交易量&quot;,&quot;期权持仓情况-认沽持仓量&quot;, &quot;期权交易情况-认购交易量&quot;, &quot;期权持仓情况-认购持仓量&quot;}
    * required: 
    */
    private String p_indicator;

    public String getP_indicator() { return this.p_indicator;}
    public void setP_indicator(String v) { this.p_indicator = v;}

    /**
    * name: trade_date
    * type: str
    * desc: trade_date=&quot;20220121&quot;
    * required: 
    */
    private String p_tradedate;

    public String getP_tradedate() { return this.p_tradedate;}
    public void setP_tradedate(String v) { this.p_tradedate = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
