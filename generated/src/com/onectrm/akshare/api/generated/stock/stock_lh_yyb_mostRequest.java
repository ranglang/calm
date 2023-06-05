
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_lh_yyb_most
    * 目标地址: http://data.10jqka.com.cn/market/longhu/
    * 描述: 龙虎榜-营业部排行-上榜次数最多
    * 限量: 单次返回所有历史数据
    */
    public class stock_lh_yyb_mostRequest extends AkShareRequestAndResponse {
    public stock_lh_yyb_mostRequest(){
    setInterfaceName("stock_lh_yyb_most");
    }

    public static String name() {
        return "stock_lh_yyb_most";
    }
    public String getName() {
    return "stock_lh_yyb_most";
    }

    public static stock_lh_yyb_mostRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_lh_yyb_mostRequest t = new stock_lh_yyb_mostRequest();



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
