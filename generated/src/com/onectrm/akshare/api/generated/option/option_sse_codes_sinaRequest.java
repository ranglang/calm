
    package com.onectrm.akshare.api.generated.option;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: option
    * 接口: option_sse_codes_sina
    * 目标地址: https://stock.finance.sina.com.cn/futures/view/optionsCffexDP.php
    * 描述: 新浪期权-看涨看跌合约合约的代码
    * 限量: 单次返回指定 symbol 合约的代码
    */
    public class option_sse_codes_sinaRequest extends AkShareRequestAndResponse {
    public option_sse_codes_sinaRequest(){
    setInterfaceName("option_sse_codes_sina");
    }

    public static String name() {
        return "option_sse_codes_sina";
    }
    public String getName() {
    return "option_sse_codes_sina";
    }

    public static option_sse_codes_sinaRequest of(


    String p_symbol,

    String p_tradedate,

    String p_underlying,


    Map.Entry
    <String
    , String>... others){
    option_sse_codes_sinaRequest t = new option_sse_codes_sinaRequest();


    t.p_symbol = p_symbol;
    t.other.put("symbol", p_symbol.toString());

    t.p_tradedate = p_tradedate;
    t.other.put("trade_date", p_tradedate.toString());

    t.p_underlying = p_underlying;
    t.other.put("underlying", p_underlying.toString());


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
    * desc: symbol=&quot;看涨期权&quot;; choice of {&quot;看涨期权&quot;, &quot;看跌期权&quot;}
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: trade_date
    * type: str
    * desc: trade_date=&quot;202002&quot;;
    * required: 
    */
    private String p_tradedate;

    public String getP_tradedate() { return this.p_tradedate;}
    public void setP_tradedate(String v) { this.p_tradedate = v;}

    /**
    * name: underlying
    * type: str
    * desc: underlying=&quot;510300&quot;
    * required: 
    */
    private String p_underlying;

    public String getP_underlying() { return this.p_underlying;}
    public void setP_underlying(String v) { this.p_underlying = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
