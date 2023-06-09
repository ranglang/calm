
    package com.onectrm.akshare.api.generated.futures;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: futures
    * 接口: futures_inventory_em
    * 目标地址: http://data.eastmoney.com/ifdata/kcsj.html
    * 描述: 东方财富网-期货数据-库存数据; 近 20 个交易日的期货库存日频率数据
    * 限量: 返回指定交易所指定品种的期货库存数据, 仓单日报数据
    */
    public class futures_inventory_emRequest extends AkShareRequestAndResponse {
    public futures_inventory_emRequest(){
    setInterfaceName("futures_inventory_em");
    }

    public static String name() {
        return "futures_inventory_em";
    }
    public String getName() {
    return "futures_inventory_em";
    }

    public static futures_inventory_emRequest of(


    String p_exchange,

    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    futures_inventory_emRequest t = new futures_inventory_emRequest();


    t.p_exchange = p_exchange;
    t.other.put("exchange", p_exchange.toString());

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
    * name: exchange
    * type: str
    * desc: exchange=&quot;大连商品交易所&quot;; choice of {&quot;上海期货交易所&quot;, &quot;郑州商品交易所&quot;, &quot;大连商品交易所&quot;}
    * required: 
    */
    private String p_exchange;

    public String getP_exchange() { return this.p_exchange;}
    public void setP_exchange(String v) { this.p_exchange = v;}

    /**
    * name: symbol
    * type: str
    * desc: symbol=&quot;豆一&quot;; http://data.eastmoney.com/ifdata/kcsj.html 对应的中文名称, 如: 沪铝
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
