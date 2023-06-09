
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_board_cons_ths
    * 目标地址: http://q.10jqka.com.cn/thshy/detail/code/881121/
    * 描述: 同花顺-板块-行业板块-成份股数据
    * 限量: 单次返回当前时刻所有成份股, 调用 **ak.stock_board_industry_info_ths()** 返回该板块信息
    */
    public class stock_board_cons_thsRequest extends AkShareRequestAndResponse {
    public stock_board_cons_thsRequest(){
    setInterfaceName("stock_board_cons_ths");
    }

    public static String name() {
        return "stock_board_cons_ths";
    }
    public String getName() {
    return "stock_board_cons_ths";
    }

    public static stock_board_cons_thsRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    stock_board_cons_thsRequest t = new stock_board_cons_thsRequest();


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
    * desc: symbol=&quot;881121&quot;; 输入行业代码
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
