
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_zh_a_gdhs
    * 目标地址: http://data.eastmoney.com/gdhs/
    * 描述: 东方财富网-数据中心-特色数据-股东户数数据
    * 限量: 单次获取返回所有数据
    */
    public class stock_zh_a_gdhsRequest extends AkShareRequestAndResponse {
    public stock_zh_a_gdhsRequest(){
    setInterfaceName("stock_zh_a_gdhs");
    }

    public static String name() {
        return "stock_zh_a_gdhs";
    }
    public String getName() {
    return "stock_zh_a_gdhs";
    }

    public static stock_zh_a_gdhsRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    stock_zh_a_gdhsRequest t = new stock_zh_a_gdhsRequest();


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
    * desc: symbol=&quot;20210331&quot;; choice of {&quot;最新&quot;, 每个季度末}
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
