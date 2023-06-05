
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_register_cyb
    * 目标地址: http://data.eastmoney.com/xg/cyb/
    * 描述: 获取东方财富网-数据中心-新股数据-注册制审核-创业板
    * 限量: 单次返回所有历史数据
    */
    public class stock_register_cybRequest extends AkShareRequestAndResponse {
    public stock_register_cybRequest(){
    setInterfaceName("stock_register_cyb");
    }

    public static String name() {
        return "stock_register_cyb";
    }
    public String getName() {
    return "stock_register_cyb";
    }

    public static stock_register_cybRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_register_cybRequest t = new stock_register_cybRequest();



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
