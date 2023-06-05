
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_zh_a_tick_tx
    * 目标地址: http://gu.qq.com/sz300494/gp/detail(示例)
    * 描述: A 股数据是从腾讯财经获取的数据, 历史数据按日频率更新, 该接口自 20210611 起, 暂时无法获取数据, 等腾讯修复后再使用
    * 限量: 单次返回具体某个 A 上市公司的近 2 年历史分笔行情数据
    */
    public class stock_zh_a_tick_txRequest extends AkShareRequestAndResponse {
    public stock_zh_a_tick_txRequest(){
    setInterfaceName("stock_zh_a_tick_tx");
    }

    public static String name() {
        return "stock_zh_a_tick_tx";
    }
    public String getName() {
    return "stock_zh_a_tick_tx";
    }

    public static stock_zh_a_tick_txRequest of(


    String p_symbol,

    String p_tradedate,


    Map.Entry
    <String
    , String>... others){
    stock_zh_a_tick_txRequest t = new stock_zh_a_tick_txRequest();


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
    * desc: symbol=&quot;sh600000&quot;
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: trade_date
    * type: str
    * desc: trade_date=&quot;20191011&quot;
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
