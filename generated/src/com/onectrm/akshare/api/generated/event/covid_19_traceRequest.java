
    package com.onectrm.akshare.api.generated.event;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: event
    * 接口: covid_19_trace
    * 目标地址: https://news.qq.com/hdh5/hebeicomeon.htm#/?ADTAG=yqi
    * 描述: 腾讯新闻-疫情-病患轨迹的数据
    * 限量: 单次返回所有省份的数据
    */
    public class covid_19_traceRequest extends AkShareRequestAndResponse {
    public covid_19_traceRequest(){
    setInterfaceName("covid_19_trace");
    }

    public static String name() {
        return "covid_19_trace";
    }
    public String getName() {
    return "covid_19_trace";
    }

    public static covid_19_traceRequest of(



    Map.Entry
    <String
    , String>... others){
    covid_19_traceRequest t = new covid_19_traceRequest();



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
