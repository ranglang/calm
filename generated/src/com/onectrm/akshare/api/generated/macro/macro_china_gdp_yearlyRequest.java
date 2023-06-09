
    package com.onectrm.akshare.api.generated.macro;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_china_gdp_yearly
    * 目标地址: https://datacenter.jin10.com/reportType/dc_chinese_gdp_yoy
    * 描述: 金十数据中心-中国GDP年率报告, 数据区间从 20110120-至今
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_gdp_yearlyRequest extends AkShareRequestAndResponse {
    public macro_china_gdp_yearlyRequest(){
    setInterfaceName("macro_china_gdp_yearly");
    }

    public static String name() {
        return "macro_china_gdp_yearly";
    }
    public String getName() {
    return "macro_china_gdp_yearly";
    }

    public static macro_china_gdp_yearlyRequest of(



    Map.Entry
    <String
    , String>... others){
    macro_china_gdp_yearlyRequest t = new macro_china_gdp_yearlyRequest();



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
