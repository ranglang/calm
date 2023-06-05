
    package com.onectrm.akshare.api.generated.index;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: index
    * 接口: stock_zh_index_daily_tx
    * 目标地址: http://gu.qq.com/sh000919/zs
    * 描述: 股票指数(或者股票)历史行情数据
    * 限量: 单次返回具体某个股票指数(或者股票)的所有历史行情数据
    */
    public class stock_zh_index_daily_txRequest extends AkShareRequestAndResponse {
    public stock_zh_index_daily_txRequest(){
    setInterfaceName("stock_zh_index_daily_tx");
    }

    public static String name() {
        return "stock_zh_index_daily_tx";
    }
    public String getName() {
    return "stock_zh_index_daily_tx";
    }

    public static stock_zh_index_daily_txRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    stock_zh_index_daily_txRequest t = new stock_zh_index_daily_txRequest();


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
    * desc: symbol=&quot;sh000919&quot;
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
