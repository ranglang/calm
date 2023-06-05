
    package com.onectrm.akshare.api.generated.futures;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: futures
    * 接口: futures_correlation_nh
    * 目标地址: http://www.nanhua.net/nhzc/correltable.html
    * 描述: 南华期货-统计监控-相关系数走势
    * 限量: 单次返回指定 date 和 period 的所有历史数据
    */
    public class futures_correlation_nhRequest extends AkShareRequestAndResponse {
    public futures_correlation_nhRequest(){
    setInterfaceName("futures_correlation_nh");
    }

    public static String name() {
        return "futures_correlation_nh";
    }
    public String getName() {
    return "futures_correlation_nh";
    }

    public static futures_correlation_nhRequest of(


    String p_date,

    String p_period,


    Map.Entry
    <String
    , String>... others){
    futures_correlation_nhRequest t = new futures_correlation_nhRequest();


    t.p_date = p_date;
    t.other.put("date", p_date.toString());

    t.p_period = p_period;
    t.other.put("period", p_period.toString());


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
    * desc: date=&quot;20220104&quot;;
    * required: 
    */
    private String p_date;

    public String getP_date() { return this.p_date;}
    public void setP_date(String v) { this.p_date = v;}

    /**
    * name: period
    * type: str
    * desc: period=&quot;20&quot;; choice of {&quot;5&quot;, &quot;20&quot;, &quot;60&quot;, &quot;120&quot;}
    * required: 
    */
    private String p_period;

    public String getP_period() { return this.p_period;}
    public void setP_period(String v) { this.p_period = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
