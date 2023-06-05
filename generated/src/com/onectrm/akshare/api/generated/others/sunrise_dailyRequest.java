
    package com.onectrm.akshare.api.generated.others;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: others
    * 接口: sunrise_daily
    * 目标地址: https://www.timeanddate.com/sun/china/
    * 描述: 获取中国各大城市-日出和日落时间, 数据区间从19990101-至今, 推荐使用代理访问
    * 限量: 单次返回指定日期和指定城市的数据
    */
    public class sunrise_dailyRequest extends AkShareRequestAndResponse {
    public sunrise_dailyRequest(){
    setInterfaceName("sunrise_daily");
    }

    public static String name() {
        return "sunrise_daily";
    }
    public String getName() {
    return "sunrise_daily";
    }

    public static sunrise_dailyRequest of(


    String p_date,

    String p_city,


    Map.Entry
    <String
    , String>... others){
    sunrise_dailyRequest t = new sunrise_dailyRequest();


    t.p_date = p_date;
    t.other.put("date", p_date.toString());

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
    * name: date
    * type: str
    * desc: date=&quot;20190801&quot;
    * required: Y
    */
    private String p_date;

    public String getP_date() { return this.p_date;}
    public void setP_date(String v) { this.p_date = v;}

    /**
    * name: city
    * type: str
    * desc: city=&quot;北京&quot;; 注意输入的格式, e.g., &quot;北京&quot;, &quot;上海&quot;
    * required: Y
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
