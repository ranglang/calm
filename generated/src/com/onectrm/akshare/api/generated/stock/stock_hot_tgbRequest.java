
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_hot_tgb
    * 目标地址: https://www.taoguba.com.cn/stock/moreHotStock
    * 描述: 淘股吧-热门股票
    * 限量: 单次返回排名前 20 股票
    */
    public class stock_hot_tgbRequest extends AkShareRequestAndResponse {
    public stock_hot_tgbRequest(){
    setInterfaceName("stock_hot_tgb");
    }

    public static String name() {
        return "stock_hot_tgb";
    }
    public String getName() {
    return "stock_hot_tgb";
    }

    public static stock_hot_tgbRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_hot_tgbRequest t = new stock_hot_tgbRequest();



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
