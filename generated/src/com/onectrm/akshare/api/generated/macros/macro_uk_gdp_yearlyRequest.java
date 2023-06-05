
    package com.onectrm.akshare.api.generated.macros;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_uk_gdp_yearly
    * 目标地址: http://data.eastmoney.com/cjsj/foreign_4_13.html
    * 描述: 东方财富-经济数据-英国-GDP 年率初值
    * 限量: 单次返回所有历史数据
    */
    public class macro_uk_gdp_yearlyRequest extends AkShareRequestAndResponse {
    public macro_uk_gdp_yearlyRequest(){
    setInterfaceName("macro_uk_gdp_yearly");
    }

    public static String name() {
        return "macro_uk_gdp_yearly";
    }
    public String getName() {
    return "macro_uk_gdp_yearly";
    }

    public static macro_uk_gdp_yearlyRequest of(


    String p_wu2,


    Map.Entry
    <String
    , String>... others){
    macro_uk_gdp_yearlyRequest t = new macro_uk_gdp_yearlyRequest();


    t.p_wu2 = p_wu2;
    t.other.put("无", p_wu2.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 无
    * type: 无
    * desc: 无
    * required: 
    */
    private String p_wu2;

    public String getP_wu2() { return this.p_wu2;}
    public void setP_wu2(String v) { this.p_wu2 = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
