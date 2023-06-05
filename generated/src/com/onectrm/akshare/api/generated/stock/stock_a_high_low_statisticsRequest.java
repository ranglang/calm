
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_a_high_low_statistics
    * 目标地址: https://www.legulegu.com/stockdata/high-low-statistics
    * 描述: 不同市场的创新高和新低的股票数量
    * 限量: 单次获取指定 market 的所有历史数据
    */
    public class stock_a_high_low_statisticsRequest extends AkShareRequestAndResponse {
    public stock_a_high_low_statisticsRequest(){
    setInterfaceName("stock_a_high_low_statistics");
    }

    public static String name() {
        return "stock_a_high_low_statistics";
    }
    public String getName() {
    return "stock_a_high_low_statistics";
    }

    public static stock_a_high_low_statisticsRequest of(


    String p_market,


    Map.Entry
    <String
    , String>... others){
    stock_a_high_low_statisticsRequest t = new stock_a_high_low_statisticsRequest();


    t.p_market = p_market;
    t.other.put("market", p_market.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: market
    * type: str
    * desc: market=&quot;all&quot;; {&quot;all&quot;: &quot;全部A股&quot;, &quot;sz50&quot;: &quot;上证50&quot;, &quot;hs300&quot;: &quot;沪深300&quot;, &quot;zz500&quot;: &quot;中证500&quot;}
    * required: 
    */
    private String p_market;

    public String getP_market() { return this.p_market;}
    public void setP_market(String v) { this.p_market = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
