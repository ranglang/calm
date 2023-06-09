
    package com.onectrm.akshare.api.generated.futures;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: futures
    * 接口: futures_nh_volatility_index
    * 目标地址: http://www.nanhua.net/nhzc/varietytrend.html
    * 描述: 南华期货-商品指数历史走势-波动率指数
    * 限量: 单次返回指定 symbol 和 period 的所有历史数据
    */
    public class futures_nh_volatility_indexRequest extends AkShareRequestAndResponse {
    public futures_nh_volatility_indexRequest(){
    setInterfaceName("futures_nh_volatility_index");
    }

    public static String name() {
        return "futures_nh_volatility_index";
    }
    public String getName() {
    return "futures_nh_volatility_index";
    }

    public static futures_nh_volatility_indexRequest of(


    String p_symbol,

    String p_period,


    Map.Entry
    <String
    , String>... others){
    futures_nh_volatility_indexRequest t = new futures_nh_volatility_indexRequest();


    t.p_symbol = p_symbol;
    t.other.put("symbol", p_symbol.toString());

    t.p_period = p_period;
    t.other.put("period", p_period.toString());


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
    * desc: symbol=&quot;Y&quot;; 注意是具体品种(不包含指数); 请参考南华指数品种一览表, 可以通过调用 **ak.futures_index_symbol_table_nh()** 获取
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: period
    * type: str
    * desc: period=&#39;20&#39;; 波动周期; choice of {&#39;5&#39;, &#39;20&#39;, &#39;60&#39;, &#39;120&#39;}
    * required: 
    */
    private String p_period;

    public String getP_period() { return this.p_period;}
    public void setP_period(String v) { this.p_period = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
