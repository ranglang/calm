
    package com.onectrm.akshare.api.generated.macros;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_china_society_traffic_volume
    * 目标地址: http://finance.sina.com.cn/mac/#industry-10-0-31-1
    * 描述: 国家统计局-全社会客货运输量-非累计
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_society_traffic_volumeRequest extends AkShareRequestAndResponse {
    public macro_china_society_traffic_volumeRequest(){
    setInterfaceName("macro_china_society_traffic_volume");
    }

    public static String name() {
        return "macro_china_society_traffic_volume";
    }
    public String getName() {
    return "macro_china_society_traffic_volume";
    }

    public static macro_china_society_traffic_volumeRequest of(



    Map.Entry
    <String
    , String>... others){
    macro_china_society_traffic_volumeRequest t = new macro_china_society_traffic_volumeRequest();



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
