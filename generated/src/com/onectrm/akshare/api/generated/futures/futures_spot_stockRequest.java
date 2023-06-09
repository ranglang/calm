
    package com.onectrm.akshare.api.generated.futures;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: futures
    * 接口: futures_spot_stock
    * 目标地址: http://data.eastmoney.com/ifdata/xhgp.html
    * 描述: 东方财富网-数据中心-现货与股票
    * 限量: 单次返回指定 indicator 的所有数据
    */
    public class futures_spot_stockRequest extends AkShareRequestAndResponse {
    public futures_spot_stockRequest(){
    setInterfaceName("futures_spot_stock");
    }

    public static String name() {
        return "futures_spot_stock";
    }
    public String getName() {
    return "futures_spot_stock";
    }

    public static futures_spot_stockRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    futures_spot_stockRequest t = new futures_spot_stockRequest();


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
    * desc: symbol=&quot;能源&quot;; choice of {&#39;能源&#39;, &#39;化工&#39;, &#39;塑料&#39;, &#39;纺织&#39;, &#39;有色&#39;, &#39;钢铁&#39;, &#39;建材&#39;, &#39;农副&#39;}
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
