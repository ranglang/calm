
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_zh_a_gdhs_detail_em
    * 目标地址: https://data.eastmoney.com/gdhs/detail/000002.html
    * 描述: 东方财富网-数据中心-特色数据-股东户数详情
    * 限量: 单次获取指定 symbol 的所有数据
    */
    public class stock_zh_a_gdhs_detail_emRequest extends AkShareRequestAndResponse {
    public stock_zh_a_gdhs_detail_emRequest(){
    setInterfaceName("stock_zh_a_gdhs_detail_em");
    }

    public static String name() {
        return "stock_zh_a_gdhs_detail_em";
    }
    public String getName() {
    return "stock_zh_a_gdhs_detail_em";
    }

    public static stock_zh_a_gdhs_detail_emRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    stock_zh_a_gdhs_detail_emRequest t = new stock_zh_a_gdhs_detail_emRequest();


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
    * desc: symbol=&quot;000002&quot;; 股票代码
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
