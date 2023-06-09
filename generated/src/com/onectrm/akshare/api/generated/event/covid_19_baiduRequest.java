
    package com.onectrm.akshare.api.generated.event;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: event
    * 接口: covid_19_baidu
    * 目标地址: https://voice.baidu.com/act/newpneumonia/newpneumonia/?from=osari_pc_1
    * 描述: 获取百度-新型冠状病毒肺炎-疫情实时大数据报告
    * 限量: 单次返回所有数据
    */
    public class covid_19_baiduRequest extends AkShareRequestAndResponse {
    public covid_19_baiduRequest(){
    setInterfaceName("covid_19_baidu");
    }

    public static String name() {
        return "covid_19_baidu";
    }
    public String getName() {
    return "covid_19_baidu";
    }

    public static covid_19_baiduRequest of(


    String p_indicator,


    Map.Entry
    <String
    , String>... others){
    covid_19_baiduRequest t = new covid_19_baiduRequest();


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
    * desc: indicator=&quot;实时播报&quot;
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
