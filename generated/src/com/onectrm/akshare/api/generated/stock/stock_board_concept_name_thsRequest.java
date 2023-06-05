
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_board_concept_name_ths
    * 目标地址: http://q.10jqka.com.cn/gn/detail/code/301558/
    * 描述: 同花顺-板块-概念板块-概念
    * 限量: 单次返回当前所有概念时间表数据
    */
    public class stock_board_concept_name_thsRequest extends AkShareRequestAndResponse {
    public stock_board_concept_name_thsRequest(){
    setInterfaceName("stock_board_concept_name_ths");
    }

    public static String name() {
        return "stock_board_concept_name_ths";
    }
    public String getName() {
    return "stock_board_concept_name_ths";
    }

    public static stock_board_concept_name_thsRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_board_concept_name_thsRequest t = new stock_board_concept_name_thsRequest();



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
