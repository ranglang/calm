
    package com.onectrm.akshare.api.generated.others;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: others
    * 接口: air_quality_rank
    * 目标地址: https://www.zq12369.com/environment.php
    * 描述: 获取指定 date 时间点上所有城市(168个)的空气质量数据
    * 限量: 单次返回所有的数据
    */
    public class air_quality_rankRequest extends AkShareRequestAndResponse {
    public air_quality_rankRequest(){
    setInterfaceName("air_quality_rank");
    }

    public static String name() {
        return "air_quality_rank";
    }
    public String getName() {
    return "air_quality_rank";
    }

    public static air_quality_rankRequest of(


    String p_date,


    Map.Entry
    <String
    , String>... others){
    air_quality_rankRequest t = new air_quality_rankRequest();


    t.p_date = p_date;
    t.other.put("date", p_date.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: date
    * type: str
    * desc: date=&quot;&quot;; &quot;&quot;: 当前时刻空气质量排名, 默认; &quot;20200312&quot;: 当日空气质量排名; &quot;202003&quot;: 当月空气质量排名; &quot;2019&quot;: 当年空气质量排名;
    * required: 
    */
    private String p_date;

    public String getP_date() { return this.p_date;}
    public void setP_date(String v) { this.p_date = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
