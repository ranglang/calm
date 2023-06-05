
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_board_concept_hist_ths
    * 目标地址: http://q.10jqka.com.cn/gn/detail/code/301558/
    * 描述: 同花顺-板块-概念板块-指数日频率数据
    * 限量: 单次返回所有日频指数数据
    */
    public class stock_board_concept_hist_thsRequest extends AkShareRequestAndResponse {
    public stock_board_concept_hist_thsRequest(){
    setInterfaceName("stock_board_concept_hist_ths");
    }

    public static String name() {
        return "stock_board_concept_hist_ths";
    }
    public String getName() {
    return "stock_board_concept_hist_ths";
    }

    public static stock_board_concept_hist_thsRequest of(


    String p_startyear,

    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    stock_board_concept_hist_thsRequest t = new stock_board_concept_hist_thsRequest();


    t.p_startyear = p_startyear;
    t.other.put("start_year", p_startyear.toString());

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
    * name: start_year
    * type: str
    * desc: start_year=&#39;2000&#39;; 指定开始年份
    * required: 
    */
    private String p_startyear;

    public String getP_startyear() { return this.p_startyear;}
    public void setP_startyear(String v) { this.p_startyear = v;}

    /**
    * name: symbol
    * type: str
    * desc: symbol=&quot;阿里巴巴概念&quot;; 可以通过调用 **ak.stock_board_concept_name_ths()** 查看同花顺的所有概念名称
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
