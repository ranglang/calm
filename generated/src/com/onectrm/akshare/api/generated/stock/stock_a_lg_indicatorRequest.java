
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_a_lg_indicator
    * 目标地址: https://www.legulegu.com/stocklist
    * 描述: 乐咕乐股-A 股个股指标: 市盈率, 市净率, 股息率
    * 限量: 单次获取指定 symbol 的所有历史数据
    */
    public class stock_a_lg_indicatorRequest extends AkShareRequestAndResponse {
    public stock_a_lg_indicatorRequest(){
    setInterfaceName("stock_a_lg_indicator");
    }

    public static String name() {
        return "stock_a_lg_indicator";
    }
    public String getName() {
    return "stock_a_lg_indicator";
    }

    public static stock_a_lg_indicatorRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    stock_a_lg_indicatorRequest t = new stock_a_lg_indicatorRequest();


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
    * desc: symbol=&quot;000001&quot;; 参见 **ak.stock_a_lg_indicator(stock=&quot;all&quot;)** 获取股票代码
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
