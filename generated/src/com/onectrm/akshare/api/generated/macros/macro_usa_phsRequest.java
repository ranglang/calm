
    package com.onectrm.akshare.api.generated.macros;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_usa_phs
    * 目标地址: http://data.eastmoney.com/cjsj/foreign_0_5.html
    * 描述: 东方财富-经济数据一览-美国-未决房屋销售月率, 数据区间从 20080201-至今
    * 限量: 单次返回所有历史数据
    */
    public class macro_usa_phsRequest extends AkShareRequestAndResponse {
    public macro_usa_phsRequest(){
    setInterfaceName("macro_usa_phs");
    }

    public static String name() {
        return "macro_usa_phs";
    }
    public String getName() {
    return "macro_usa_phs";
    }

    public static macro_usa_phsRequest of(



    Map.Entry
    <String
    , String>... others){
    macro_usa_phsRequest t = new macro_usa_phsRequest();



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
