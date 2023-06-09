
    package com.onectrm.akshare.api.generated.futures;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: futures
    * 接口: futures_index_cscidx
    * 目标地址: http://www.cscidx.com/index.html
    * 描述: 中证商品指数-指数分时数据
    * 限量: 单次返回指定 symbol 的指数分时数据
    */
    public class futures_index_cscidxRequest extends AkShareRequestAndResponse {
    public futures_index_cscidxRequest(){
    setInterfaceName("futures_index_cscidx");
    }

    public static String name() {
        return "futures_index_cscidx";
    }
    public String getName() {
    return "futures_index_cscidx";
    }

    public static futures_index_cscidxRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    futures_index_cscidxRequest t = new futures_index_cscidxRequest();


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
    * desc: symbol=&quot;中证监控油脂油料期货指数&quot;; choice of {&quot;中证监控软商品期货指数&quot;, &quot;中证监控油脂油料期货指数&quot;, &quot;中证监控饲料期货指数&quot;, &quot;中证监控能化期货指数&quot;, &quot;中证监控钢铁期货指数&quot;, &quot;中证监控建材期货指数&quot;}
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
