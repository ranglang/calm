
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_zh_index_daily
    * 目标地址: https://finance.sina.com.cn/realstock/company/sz399552/nc.shtml(示例)
    * 描述: 股票指数数据是从新浪财经获取的数据, 历史数据按日频率更新
    * 限量: 单次返回具体某个指数的所有历史行情数据
    */
    public class stock_zh_index_dailyRequest extends AkShareRequestAndResponse {
    public stock_zh_index_dailyRequest(){
    setInterfaceName("stock_zh_index_daily");
    }

    public static String name() {
        return "stock_zh_index_daily";
    }
    public String getName() {
    return "stock_zh_index_daily";
    }

    public static stock_zh_index_dailyRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    stock_zh_index_dailyRequest t = new stock_zh_index_dailyRequest();


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
    * desc: symbol=&quot;sz399552&quot;
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
