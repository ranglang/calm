
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_ipo_declare
    * 目标地址: https://data.eastmoney.com/xg/xg/sbqy.html
    * 描述: 东方财富网-数据中心-新股申购-首发申报信息-首发申报企业信息
    * 限量: 单次返回所有历史数据
    */
    public class stock_ipo_declareRequest extends AkShareRequestAndResponse {
    public stock_ipo_declareRequest(){
    setInterfaceName("stock_ipo_declare");
    }

    public static String name() {
        return "stock_ipo_declare";
    }
    public String getName() {
    return "stock_ipo_declare";
    }

    public static stock_ipo_declareRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_ipo_declareRequest t = new stock_ipo_declareRequest();



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
