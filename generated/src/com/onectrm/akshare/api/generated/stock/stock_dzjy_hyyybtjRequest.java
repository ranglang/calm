
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_dzjy_hyyybtj
    * 目标地址: http://data.eastmoney.com/dzjy/dzjy_hyyybtj.aspx
    * 描述: 东方财富网-数据中心-大宗交易-活跃营业部统计
    * 限量: 单次返回所有历史数据
    */
    public class stock_dzjy_hyyybtjRequest extends AkShareRequestAndResponse {
    public stock_dzjy_hyyybtjRequest(){
    setInterfaceName("stock_dzjy_hyyybtj");
    }

    public static String name() {
        return "stock_dzjy_hyyybtj";
    }
    public String getName() {
    return "stock_dzjy_hyyybtj";
    }

    public static stock_dzjy_hyyybtjRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    stock_dzjy_hyyybtjRequest t = new stock_dzjy_hyyybtjRequest();


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
    * desc: symbol=&#39;近3日&#39;; choice of {&#39;当前交易日&#39;, &#39;近3日&#39;, &#39;近5日&#39;, &#39;近10日&#39;, &#39;近30日&#39;}
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
