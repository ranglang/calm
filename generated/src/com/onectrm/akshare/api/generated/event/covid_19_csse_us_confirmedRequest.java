
    package com.onectrm.akshare.api.generated.event;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: event
    * 接口: covid_19_csse_us_confirmed
    * 目标地址: https://github.com/CSSEGISandData/COVID-19
    * 描述: 获取美国确诊数据所有历史数据, 如本地无法读取数据，请参考 **[答疑专栏]** 问题 12 修改本地 host 后获取
    * 限量: 单次返回所有历史数据，每日更新
    */
    public class covid_19_csse_us_confirmedRequest extends AkShareRequestAndResponse {
    public covid_19_csse_us_confirmedRequest(){
    setInterfaceName("covid_19_csse_us_confirmed");
    }

    public static String name() {
        return "covid_19_csse_us_confirmed";
    }
    public String getName() {
    return "covid_19_csse_us_confirmed";
    }

    public static covid_19_csse_us_confirmedRequest of(



    Map.Entry
    <String
    , String>... others){
    covid_19_csse_us_confirmedRequest t = new covid_19_csse_us_confirmedRequest();



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
