
    package com.onectrm.akshare.api.generated.macros;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_cons_opec_month
    * 目标地址: https://datacenter.jin10.com/reportType/dc_eurozone_sentix_investor_confidence
    * 描述: 获取欧佩克报告, 数据区间从20170118-至今
    * 限量: 单次返回所有历史数据, 以网页数据为准.
    */
    public class macro_cons_opec_monthRequest extends AkShareRequestAndResponse {
    public macro_cons_opec_monthRequest(){
    setInterfaceName("macro_cons_opec_month");
    }

    public static String name() {
        return "macro_cons_opec_month";
    }
    public String getName() {
    return "macro_cons_opec_month";
    }

    public static macro_cons_opec_monthRequest of(



    Map.Entry
    <String
    , String>... others){
    macro_cons_opec_monthRequest t = new macro_cons_opec_monthRequest();



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
