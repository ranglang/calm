
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_board_concept_hist_em
    * 目标地址: http://quote.eastmoney.com/bk/90.BK0715.html(示例)
    * 描述: 东方财富-沪深板块-概念板块-历史行情数据
    * 限量: 单次返回指定 symbol 和 adjust 的历史数据
    */
    public class stock_board_concept_hist_emRequest extends AkShareRequestAndResponse {
    public stock_board_concept_hist_emRequest(){
    setInterfaceName("stock_board_concept_hist_em");
    }

    public static String name() {
        return "stock_board_concept_hist_em";
    }
    public String getName() {
    return "stock_board_concept_hist_em";
    }

    public static stock_board_concept_hist_emRequest of(


    String p_symbol,

    String p_adjust,


    Map.Entry
    <String
    , String>... others){
    stock_board_concept_hist_emRequest t = new stock_board_concept_hist_emRequest();


    t.p_symbol = p_symbol;
    t.other.put("symbol", p_symbol.toString());

    t.p_adjust = p_adjust;
    t.other.put("adjust", p_adjust.toString());


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
    * desc: symbol=&quot;网络安全&quot;; 可以通过调用 **ak.stock_board_concept_name_em()** 查看东方财富-概念板块的所有概念代码
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: adjust
    * type: str
    * desc: adjust=&quot;&quot;; choice of {&#39;&#39;: 不复权, 默认; &quot;qfq&quot;: 前复权, &quot;hfq&quot;: 后复权}
    * required: 
    */
    private String p_adjust;

    public String getP_adjust() { return this.p_adjust;}
    public void setP_adjust(String v) { this.p_adjust = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
