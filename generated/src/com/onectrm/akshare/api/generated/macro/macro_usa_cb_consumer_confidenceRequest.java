
    package com.onectrm.akshare.api.generated.macro;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_usa_cb_consumer_confidence
    * 目标地址: https://cdn.jin10.com/dc/reports/dc_usa_cb_consumer_confidence_all.js?v=1578576859
    * 描述: 美国谘商会消费者信心指数报告, 数据区间从 19700101-至今
    * 限量: 单次返回所有历史数据
    */
    public class macro_usa_cb_consumer_confidenceRequest extends AkShareRequestAndResponse {
    public macro_usa_cb_consumer_confidenceRequest(){
    setInterfaceName("macro_usa_cb_consumer_confidence");
    }

    public static String name() {
        return "macro_usa_cb_consumer_confidence";
    }
    public String getName() {
    return "macro_usa_cb_consumer_confidence";
    }

    public static macro_usa_cb_consumer_confidenceRequest of(



    Map.Entry
    <String
    , String>... others){
    macro_usa_cb_consumer_confidenceRequest t = new macro_usa_cb_consumer_confidenceRequest();



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
