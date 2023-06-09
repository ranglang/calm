
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_rank_xstp_ths
    * 目标地址: http://data.10jqka.com.cn/rank/xstp/
    * 描述: 同花顺-数据中心-技术选股-向上突破
    * 限量: 单次返回所有数据
    */
    public class stock_rank_xstp_thsRequest extends AkShareRequestAndResponse {
    public stock_rank_xstp_thsRequest(){
    setInterfaceName("stock_rank_xstp_ths");
    }

    public static String name() {
        return "stock_rank_xstp_ths";
    }
    public String getName() {
    return "stock_rank_xstp_ths";
    }

    public static stock_rank_xstp_thsRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    stock_rank_xstp_thsRequest t = new stock_rank_xstp_thsRequest();


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
    * desc: symbol=&quot;500日均线&quot;; choice of {&quot;5日均线&quot;, &quot;10日均线&quot;, &quot;20日均线&quot;, &quot;30日均线&quot;, &quot;60日均线&quot;, &quot;90日均线&quot;, &quot;250日均线&quot;, &quot;500日均线&quot;}
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
