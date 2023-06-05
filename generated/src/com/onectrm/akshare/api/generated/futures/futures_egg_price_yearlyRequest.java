
    package com.onectrm.akshare.api.generated.futures;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: futures
    * 接口: futures_egg_price_yearly
    * 目标地址: https://www.jidan7.com/trend/
    * 描述: 鸡蛋信息网-各年度产区鸡蛋价格走势
    * 限量: 全部历史数据
    */
    public class futures_egg_price_yearlyRequest extends AkShareRequestAndResponse {
    public futures_egg_price_yearlyRequest(){
    setInterfaceName("futures_egg_price_yearly");
    }

    public static String name() {
        return "futures_egg_price_yearly";
    }
    public String getName() {
    return "futures_egg_price_yearly";
    }

    public static futures_egg_price_yearlyRequest of(



    Map.Entry
    <String
    , String>... others){
    futures_egg_price_yearlyRequest t = new futures_egg_price_yearlyRequest();



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
