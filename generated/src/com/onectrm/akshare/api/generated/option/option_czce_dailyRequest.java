
    package com.onectrm.akshare.api.generated.option;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: option
    * 接口: option_czce_daily
    * 目标地址: http://www.czce.com.cn/cn/jysj/mrhq/H770301index_1.htm
    * 描述: 郑州商品交易所-商品期权数据
    * 限量: 单次返回指定 symbol 和 trade_date 的期权行情数据
    */
    public class option_czce_dailyRequest extends AkShareRequestAndResponse {
    public option_czce_dailyRequest(){
    setInterfaceName("option_czce_daily");
    }

    public static String name() {
        return "option_czce_daily";
    }
    public String getName() {
    return "option_czce_daily";
    }

    public static option_czce_dailyRequest of(


    String p_symbol,

    String p_tradedate,


    Map.Entry
    <String
    , String>... others){
    option_czce_dailyRequest t = new option_czce_dailyRequest();


    t.p_symbol = p_symbol;
    t.other.put("symbol", p_symbol.toString());

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
    * desc: symbol=&quot;白糖期权&quot;
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: trade_date
    * type: str
    * desc: trade_date=&quot;20191017&quot;
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
