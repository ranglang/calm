
    package com.onectrm.akshare.api.generated.others;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: others
    * 接口: air_quality_hist
    * 目标地址: https://www.zq12369.com/
    * 描述: 指定城市和数据频率下并且在指定时间段内的空气质量数据
    * 限量: 单次返回所有的数据, 在提取一小时频率数据时请注意时间跨度不宜过长, 提取日频率数据的早年数据请分段提取
    */
    public class air_quality_histRequest extends AkShareRequestAndResponse {
    public air_quality_histRequest(){
    setInterfaceName("air_quality_hist");
    }

    public static String name() {
        return "air_quality_hist";
    }
    public String getName() {
    return "air_quality_hist";
    }

    public static air_quality_histRequest of(


    String p_city,

    String p_period,

    String p_startdate,

    String p_enddate,


    Map.Entry
    <String
    , String>... others){
    air_quality_histRequest t = new air_quality_histRequest();


    t.p_city = p_city;
    t.other.put("city", p_city.toString());

    t.p_period = p_period;
    t.other.put("period", p_period.toString());

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
    * desc: city=&quot;北京&quot;; 调用 ak.air_city_table() 接口获取所有城市列表
    * required: 
    */
    private String p_city;

    public String getP_city() { return this.p_city;}
    public void setP_city(String v) { this.p_city = v;}

    /**
    * name: period
    * type: str
    * desc: period=&quot;day&quot;; &quot;hour&quot;: 每小时一个数据, 由于数据量比较大, 下载较慢; &quot;day&quot;: 每天一个数据; &quot;month&quot;: 每个月一个数据
    * required: 
    */
    private String p_period;

    public String getP_period() { return this.p_period;}
    public void setP_period(String v) { this.p_period = v;}

    /**
    * name: start_date
    * type: str
    * desc: start_date=&quot;20200320&quot;; 注意 **start_date** 和 **end_date** 跨度不宜过长
    * required: 
    */
    private String p_startdate;

    public String getP_startdate() { return this.p_startdate;}
    public void setP_startdate(String v) { this.p_startdate = v;}

    /**
    * name: end_date
    * type: str
    * desc: end_date=&quot;20200427&quot;; 注意 **start_date** 和 **end_date** 跨度不宜过长
    * required: 
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
