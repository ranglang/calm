
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_comment_em
    * 目标地址: http://data.eastmoney.com/stockcomment/
    * 描述: 东方财富网-数据中心-特色数据-千股千评
    * 限量: 单次获取所有数据
    */
    public class stock_comment_emRequest extends AkShareRequestAndResponse {
    public stock_comment_emRequest(){
    setInterfaceName("stock_comment_em");
    }

    public static String name() {
        return "stock_comment_em";
    }
    public String getName() {
    return "stock_comment_em";
    }

    public static stock_comment_emRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_comment_emRequest t = new stock_comment_emRequest();



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
