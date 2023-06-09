
    package com.onectrm.akshare.api.generated.event;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: event
    * 接口: covid_19_hist_city
    * 目标地址: https://github.com/norratek/Ncov2020HistoryData
    * 描述: 获取 **COVID-19** 数据, 统计数据细化到地市, 该接口需要通过代理访问
    * 限量: 单次返回指定 **city** 的所有数据
    */
    public class covid_19_hist_cityRequest extends AkShareRequestAndResponse {
    public covid_19_hist_cityRequest(){
    setInterfaceName("covid_19_hist_city");
    }

    public static String name() {
        return "covid_19_hist_city";
    }
    public String getName() {
    return "covid_19_hist_city";
    }

    public static covid_19_hist_cityRequest of(


    String p_city,


    Map.Entry
    <String
    , String>... others){
    covid_19_hist_cityRequest t = new covid_19_hist_cityRequest();


    t.p_city = p_city;
    t.other.put("city", p_city.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: city
    * type: str
    * desc: city=&quot;武汉市&quot;
    * required: 
    */
    private String p_city;

    public String getP_city() { return this.p_city;}
    public void setP_city(String v) { this.p_city = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
