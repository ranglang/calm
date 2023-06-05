
    package com.onectrm.akshare.api.generated.event;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: event
    * 接口: covid_19_csse_daily
    * 目标地址: https://github.com/CSSEGISandData/COVID-19
    * 描述: 获取 **COVID-19** 每个自然日的全球统计数据, 如本地无法读取数据，请参考 **[答疑专栏]** 问题 12 修改本地 host 后获取
    * 限量: 单次返回指定 **date** 的所有历史数据
    */
    public class covid_19_csse_dailyRequest extends AkShareRequestAndResponse {
    public covid_19_csse_dailyRequest(){
    setInterfaceName("covid_19_csse_daily");
    }

    public static String name() {
        return "covid_19_csse_daily";
    }
    public String getName() {
    return "covid_19_csse_daily";
    }

    public static covid_19_csse_dailyRequest of(


    String p_date,


    Map.Entry
    <String
    , String>... others){
    covid_19_csse_dailyRequest t = new covid_19_csse_dailyRequest();


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
    * desc: date=&quot;2020-04-06&quot;; 从 **2020-01-22** 开始至今
    * required: Y
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
