
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_zh_a_tick_163
    * 目标地址: http://quotes.money.163.com/trade/cjmx_000001.html#01b05(示例)
    * 描述: A 股 Tick 数据是从网易财经获取, 历史数据按日频率更新, 晚上 10 更新数据; 可以调用 **ak.stock_zh_a_tick_163_now(symbol=&quot;000001&quot;)** 接口获取
    * 限量: 单次返回具体某个 A 上市公司的近 5 个交易日的历史分笔行情数据; 该接口目前还不支持北交所的股票; 该接口目前不能返回 上交所 数据
    */
    public class stock_zh_a_tick_163Request extends AkShareRequestAndResponse {
    public stock_zh_a_tick_163Request(){
    setInterfaceName("stock_zh_a_tick_163");
    }

    public static String name() {
        return "stock_zh_a_tick_163";
    }
    public String getName() {
    return "stock_zh_a_tick_163";
    }

    public static stock_zh_a_tick_163Request of(


    String p_symbol,

    String p_tradedate,


    Map.Entry
    <String
    , String>... others){
    stock_zh_a_tick_163Request t = new stock_zh_a_tick_163Request();


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
    * desc: symbol=&quot;sh600000&quot;;
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: trade_date
    * type: datetime
    * desc: trade_date=&quot;20200408&quot;
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
