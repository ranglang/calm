
    package com.onectrm.akshare.api.generated.event;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: event
    * 接口: covid_19_trip
    * 目标地址: https://rl.inews.qq.com/h5/trip?from=newsapp&amp;ADTAG=tgi.wx.share.message
    * 描述: 新型肺炎确诊患者-相同行程查询工具中所有行程数据
    * 限量: 单次返回新型肺炎确诊患者-相同行程查询工具中所有行程数据
    */
    public class covid_19_tripRequest extends AkShareRequestAndResponse {
    public covid_19_tripRequest(){
    setInterfaceName("covid_19_trip");
    }

    public static String name() {
        return "covid_19_trip";
    }
    public String getName() {
    return "covid_19_trip";
    }

    public static covid_19_tripRequest of(



    Map.Entry
    <String
    , String>... others){
    covid_19_tripRequest t = new covid_19_tripRequest();



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
