
    package com.onectrm.akshare.api.generated.others;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: others
    * 接口: air_quality_watch_point
    * 目标地址: https://www.zq12369.com/environment.php
    * 描述: 获取每个城市的所有空气质量监测点的数据
    * 限量: 单次返回指定城市指定日期区间的所有监测点的空气质量数据
    */
    public class air_quality_watch_pointRequest extends AkShareRequestAndResponse {
    public air_quality_watch_pointRequest(){
    setInterfaceName("air_quality_watch_point");
    }

    public static String name() {
        return "air_quality_watch_point";
    }
    public String getName() {
    return "air_quality_watch_point";
    }

    public static air_quality_watch_pointRequest of(


    String p_city,

    String p_startdate,

    String p_enddate,


    Map.Entry
    <String
    , String>... others){
    air_quality_watch_pointRequest t = new air_quality_watch_pointRequest();


    t.p_city = p_city;
    t.other.put("city", p_city.toString());

    t.p_startdate = p_startdate;
    t.other.put("start_date", p_startdate.toString());

    t.p_enddate = p_enddate;
    t.other.put("end_date", p_enddate.toString());


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
    * desc: city=&quot;杭州&quot;; 调用 air_city_table 接口获取所有城市列表
    * required: Y
    */
    private String p_city;

    public String getP_city() { return this.p_city;}
    public void setP_city(String v) { this.p_city = v;}

    /**
    * name: start_date
    * type: str
    * desc: start_date=&quot;2018-01-01&quot;
    * required: Y
    */
    private String p_startdate;

    public String getP_startdate() { return this.p_startdate;}
    public void setP_startdate(String v) { this.p_startdate = v;}

    /**
    * name: end_date
    * type: str
    * desc: end_date=&quot;2020-04-27&quot;
    * required: Y
    */
    private String p_enddate;

    public String getP_enddate() { return this.p_enddate;}
    public void setP_enddate(String v) { this.p_enddate = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
