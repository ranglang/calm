
    package com.onectrm.akshare.api.generated.macro;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_china_society_electricity
    * 目标地址: http://finance.sina.com.cn/mac/#industry-6-0-31-1
    * 描述: 国家统计局-全社会用电分类情况表
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_society_electricityRequest extends AkShareRequestAndResponse {
    public macro_china_society_electricityRequest(){
    setInterfaceName("macro_china_society_electricity");
    }

    public static String name() {
        return "macro_china_society_electricity";
    }
    public String getName() {
    return "macro_china_society_electricity";
    }

    public static macro_china_society_electricityRequest of(



    Map.Entry
    <String
    , String>... others){
    macro_china_society_electricityRequest t = new macro_china_society_electricityRequest();



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
