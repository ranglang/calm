
    package com.onectrm.akshare.api.generated.futures;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: futures
    * 接口: futures_price_index_nh
    * 目标地址: http://www.nanhua.net/nhzc/varietytrend.html
    * 描述: 南华期货-商品指数历史走势-价格指数
    * 限量: 单次返回指定 symbol 的所有历史数据
    */
    public class futures_price_index_nhRequest extends AkShareRequestAndResponse {
    public futures_price_index_nhRequest(){
    setInterfaceName("futures_price_index_nh");
    }

    public static String name() {
        return "futures_price_index_nh";
    }
    public String getName() {
    return "futures_price_index_nh";
    }

    public static futures_price_index_nhRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    futures_price_index_nhRequest t = new futures_price_index_nhRequest();


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
    * desc: symbol=&quot;Y&quot;, 请参考南华指数品种一览表, 可以通过 ak.futures_index_symbol_table_nh() 获取
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
