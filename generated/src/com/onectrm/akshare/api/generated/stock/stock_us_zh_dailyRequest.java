
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_us_zh_daily
    * 目标地址: http://stockdata.stock.hexun.com/us/NTES.shtml
    * 描述: 中国概念股日频率的历史数据
    * 限量: 单次获取指定中概股公司的历史日频率数据, 返回最近 1000 个交易日数据, 此处建议使用新浪财经数据接口获取复权后数据使用
    */
    public class stock_us_zh_dailyRequest extends AkShareRequestAndResponse {
    public stock_us_zh_dailyRequest(){
    setInterfaceName("stock_us_zh_daily");
    }

    public static String name() {
        return "stock_us_zh_daily";
    }
    public String getName() {
    return "stock_us_zh_daily";
    }

    public static stock_us_zh_dailyRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    stock_us_zh_dailyRequest t = new stock_us_zh_dailyRequest();


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
    * desc: symbol=&quot;BABA&quot;; 此处 symbol 可以通过调用 **ak.stock_us_zh_spot()** 接口获取
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
