
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_a_all_pb
    * 目标地址: https://www.legulegu.com/stockdata/all-pb
    * 描述: 乐咕乐股-A 股等权重与中位数市净率
    * 限量: 单次返回所有数据
    */
    public class stock_a_all_pbRequest extends AkShareRequestAndResponse {
    public stock_a_all_pbRequest(){
    setInterfaceName("stock_a_all_pb");
    }

    public static String name() {
        return "stock_a_all_pb";
    }
    public String getName() {
    return "stock_a_all_pb";
    }

    public static stock_a_all_pbRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_a_all_pbRequest t = new stock_a_all_pbRequest();



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
