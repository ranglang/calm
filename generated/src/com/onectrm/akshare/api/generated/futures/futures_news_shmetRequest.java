
    package com.onectrm.akshare.api.generated.futures;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: futures
    * 接口: futures_news_shmet
    * 目标地址: https://www.shmet.com/newsFlash/newsFlash.html?searchKeyword=
    * 描述: 上海金属网-快讯
    * 限量: 指定 symbol 的数据
    */
    public class futures_news_shmetRequest extends AkShareRequestAndResponse {
    public futures_news_shmetRequest(){
    setInterfaceName("futures_news_shmet");
    }

    public static String name() {
        return "futures_news_shmet";
    }
    public String getName() {
    return "futures_news_shmet";
    }

    public static futures_news_shmetRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    futures_news_shmetRequest t = new futures_news_shmetRequest();


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
    * desc: symbol=&quot;全部&quot;; choice of {&quot;全部&quot;, &quot;要闻&quot;, &quot;VIP&quot;, &quot;财经&quot;, &quot;铜&quot;, &quot;铝&quot;, &quot;铅&quot;, &quot;锌&quot;, &quot;镍&quot;, &quot;锡&quot;, &quot;贵金属&quot;, &quot;小金属&quot;}
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
