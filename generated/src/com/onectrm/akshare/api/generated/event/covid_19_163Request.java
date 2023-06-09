
    package com.onectrm.akshare.api.generated.event;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: event
    * 接口: covid_19_163
    * 目标地址: https://news.163.com/special/epidemic/
    * 描述: 网易-新型冠状病毒肺炎-疫情数据
    * 限量: 单次返回指定 **indicator** 的数据
    */
    public class covid_19_163Request extends AkShareRequestAndResponse {
    public covid_19_163Request(){
    setInterfaceName("covid_19_163");
    }

    public static String name() {
        return "covid_19_163";
    }
    public String getName() {
    return "covid_19_163";
    }

    public static covid_19_163Request of(


    String p_indicator,


    Map.Entry
    <String
    , String>... others){
    covid_19_163Request t = new covid_19_163Request();


    t.p_indicator = p_indicator;
    t.other.put("indicator", p_indicator.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: indicator
    * type: str
    * desc: indicator=&quot;数据说明&quot;; 返回网易对相关字段的数据说明
    * required: 
    */
    private String p_indicator;

    public String getP_indicator() { return this.p_indicator;}
    public void setP_indicator(String v) { this.p_indicator = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
