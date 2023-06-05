
    package com.onectrm.akshare.api.generated.option;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: option
    * 接口: option_sse_expire_day_sina
    * 目标地址: https://stock.finance.sina.com.cn/futures/view/optionsCffexDP.php
    * 描述: 获取指定到期月份指定品种的剩余到期时间
    * 限量: 单次返回指定品种的品种的剩余到期时间
    */
    public class option_sse_expire_day_sinaRequest extends AkShareRequestAndResponse {
    public option_sse_expire_day_sinaRequest(){
    setInterfaceName("option_sse_expire_day_sina");
    }

    public static String name() {
        return "option_sse_expire_day_sina";
    }
    public String getName() {
    return "option_sse_expire_day_sina";
    }

    public static option_sse_expire_day_sinaRequest of(


    String p_tradedate,

    String p_symbol,

    String p_exchange,


    Map.Entry
    <String
    , String>... others){
    option_sse_expire_day_sinaRequest t = new option_sse_expire_day_sinaRequest();


    t.p_tradedate = p_tradedate;
    t.other.put("trade_date", p_tradedate.toString());

    t.p_symbol = p_symbol;
    t.other.put("symbol", p_symbol.toString());

    t.p_exchange = p_exchange;
    t.other.put("exchange", p_exchange.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



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
    * name: symbol
    * type: str
    * desc: symbol=&quot;50ETF&quot;; &quot;50ETF&quot; or &quot;300ETF&quot;
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: exchange
    * type: str
    * desc: exchange=&quot;null&quot;
    * required: 
    */
    private String p_exchange;

    public String getP_exchange() { return this.p_exchange;}
    public void setP_exchange(String v) { this.p_exchange = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
