
    package com.onectrm.akshare.api.generated.macros;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_china_consumer_goods_retail
    * 目标地址: http://data.eastmoney.com/cjsj/xfp.html
    * 描述: 东方财富-经济数据-社会消费品零售总额
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_consumer_goods_retailRequest extends AkShareRequestAndResponse {
    public macro_china_consumer_goods_retailRequest(){
    setInterfaceName("macro_china_consumer_goods_retail");
    }

    public static String name() {
        return "macro_china_consumer_goods_retail";
    }
    public String getName() {
    return "macro_china_consumer_goods_retail";
    }

    public static macro_china_consumer_goods_retailRequest of(



    Map.Entry
    <String
    , String>... others){
    macro_china_consumer_goods_retailRequest t = new macro_china_consumer_goods_retailRequest();



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
