
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_board_concept_cons_em
    * 目标地址: http://quote.eastmoney.com/center/boardlist.html#boards-BK06551(示例)
    * 描述: 东方财富-沪深板块-概念板块-板块成份
    * 限量: 单次返回当前时刻所有成份股
    */
    public class stock_board_concept_cons_emRequest extends AkShareRequestAndResponse {
    public stock_board_concept_cons_emRequest(){
    setInterfaceName("stock_board_concept_cons_em");
    }

    public static String name() {
        return "stock_board_concept_cons_em";
    }
    public String getName() {
    return "stock_board_concept_cons_em";
    }

    public static stock_board_concept_cons_emRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    stock_board_concept_cons_emRequest t = new stock_board_concept_cons_emRequest();


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
    * desc: symbol=&quot;车联网&quot;; 可以通过调用 **ak.stock_board_concept_name_em()** 查看东方财富-概念板块的所有行业名称
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
