
    package com.onectrm.akshare.api.generated.event;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: event
    * 接口: covid_19_dxy
    * 目标地址: https://ncov.dxy.cn/ncovh5/view/pneumonia
    * 描述: 丁香园-新型冠状病毒肺炎-疫情数据
    * 限量: 单次返回指定 **indicator** 数据
    */
    public class covid_19_dxyRequest extends AkShareRequestAndResponse {
    public covid_19_dxyRequest(){
    setInterfaceName("covid_19_dxy");
    }

    public static String name() {
        return "covid_19_dxy";
    }
    public String getName() {
    return "covid_19_dxy";
    }

    public static covid_19_dxyRequest of(


    String p_indicator,


    Map.Entry
    <String
    , String>... others){
    covid_19_dxyRequest t = new covid_19_dxyRequest();


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
    * desc: indicator=&quot;中国疫情分省统计详情&quot;
    * required: Y
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
