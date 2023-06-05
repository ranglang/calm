
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_a_pe
    * 目标地址: https://www.legulegu.com/stockdata/market_pe
    * 描述: 乐咕乐股网站-A股市盈率
    * 限量: 单次获取指定 symbol 的所有数据
    */
    public class stock_a_peRequest extends AkShareRequestAndResponse {
    public stock_a_peRequest(){
    setInterfaceName("stock_a_pe");
    }

    public static String name() {
        return "stock_a_pe";
    }
    public String getName() {
    return "stock_a_pe";
    }

    public static stock_a_peRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    stock_a_peRequest t = new stock_a_peRequest();


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
    * desc: symbol=&quot;000016.XSHG&quot;; 参见 **stock_a_pe** 一览表
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
