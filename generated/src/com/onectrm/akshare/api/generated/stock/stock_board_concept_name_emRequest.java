
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_board_concept_name_em
    * 目标地址: http://quote.eastmoney.com/center/boardlist.html#concept_board
    * 描述: 东方财富-沪深板块-概念板块
    * 限量: 单次返回当前时刻所有概念板块数据
    */
    public class stock_board_concept_name_emRequest extends AkShareRequestAndResponse {
    public stock_board_concept_name_emRequest(){
    setInterfaceName("stock_board_concept_name_em");
    }

    public static String name() {
        return "stock_board_concept_name_em";
    }
    public String getName() {
    return "stock_board_concept_name_em";
    }

    public static stock_board_concept_name_emRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_board_concept_name_emRequest t = new stock_board_concept_name_emRequest();



    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }




    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
