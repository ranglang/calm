
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_a_below_net_asset_statistics
    * 目标地址: https://www.legulegu.com/stockdata/below-net-asset-statistics
    * 描述: 乐咕乐股-A 股破净股统计数据
    * 限量: 单次获取所有历史数据
    */
    public class stock_a_below_net_asset_statisticsRequest extends AkShareRequestAndResponse {
    public stock_a_below_net_asset_statisticsRequest(){
    setInterfaceName("stock_a_below_net_asset_statistics");
    }

    public static String name() {
        return "stock_a_below_net_asset_statistics";
    }
    public String getName() {
    return "stock_a_below_net_asset_statistics";
    }

    public static stock_a_below_net_asset_statisticsRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    stock_a_below_net_asset_statisticsRequest t = new stock_a_below_net_asset_statisticsRequest();


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
    * desc: symbol=&quot;全部A股&quot;; choice of {&quot;全部A股&quot;, &quot;沪深300&quot;}
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
