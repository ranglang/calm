
    package com.onectrm.akshare.api.generated.futures;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: futures
    * 接口: futures_hq_subscribe_exchange_symbol
    * 目标地址: https://finance.sina.com.cn/money/future/hf.html
    * 描述: 新浪财经-外盘商品期货品种代码表数据
    * 限量: 单次返回当前交易日的订阅的所有期货品种的品种代码表数据
    */
    public class futures_hq_subscribe_exchange_symbolRequest extends AkShareRequestAndResponse {
    public futures_hq_subscribe_exchange_symbolRequest(){
    setInterfaceName("futures_hq_subscribe_exchange_symbol");
    }

    public static String name() {
        return "futures_hq_subscribe_exchange_symbol";
    }
    public String getName() {
    return "futures_hq_subscribe_exchange_symbol";
    }

    public static futures_hq_subscribe_exchange_symbolRequest of(



    Map.Entry
    <String
    , String>... others){
    futures_hq_subscribe_exchange_symbolRequest t = new futures_hq_subscribe_exchange_symbolRequest();



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
