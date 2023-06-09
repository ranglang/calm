
    package com.onectrm.akshare.api.generated.event;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: event
    * 接口: covid_19_risk_area
    * 目标地址: http://bmfw.www.gov.cn/yqfxdjcx/risk.html
    * 描述: 卫生健康委-疫情风险等级查询
    * 限量: 单次返回当前时刻所有数据
    */
    public class covid_19_risk_areaRequest extends AkShareRequestAndResponse {
    public covid_19_risk_areaRequest(){
    setInterfaceName("covid_19_risk_area");
    }

    public static String name() {
        return "covid_19_risk_area";
    }
    public String getName() {
    return "covid_19_risk_area";
    }

    public static covid_19_risk_areaRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    covid_19_risk_areaRequest t = new covid_19_risk_areaRequest();


    t.p_symbol = p_symbol;
    t.other.put("symbol", p_symbol.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: symbol
    * type: str
    * desc: symbol=&quot;高风险等级地区&quot;; choice of {&quot;高风险等级地区&quot;, &quot;中风险等级地区&quot;}
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
