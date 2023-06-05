
    package com.onectrm.akshare.api.generated.futures;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: futures
    * 接口: futures_comex_inventory
    * 目标地址: http://data.eastmoney.com/pmetal/comex/by.html
    * 描述: 东方财富网-数据中心-COMEX 库存的日数据
    * 限量: 单次返回指定 symbol 的所有历史数据
    */
    public class futures_comex_inventoryRequest extends AkShareRequestAndResponse {
    public futures_comex_inventoryRequest(){
    setInterfaceName("futures_comex_inventory");
    }

    public static String name() {
        return "futures_comex_inventory";
    }
    public String getName() {
    return "futures_comex_inventory";
    }

    public static futures_comex_inventoryRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    futures_comex_inventoryRequest t = new futures_comex_inventoryRequest();


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
    * desc: symbol=&quot;黄金&quot;; choice of {&quot;黄金&quot;, &quot;白银&quot;}
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
