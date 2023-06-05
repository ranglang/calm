
    package com.onectrm.akshare.api.generated.macros;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_euro_sentix_investor_confidence
    * 目标地址: https://datacenter.jin10.com/reportType/dc_eurozone_sentix_investor_confidence
    * 描述: 获取欧元区Sentix投资者信心指数报告, 数据区间从20020801-至今
    * 限量: 单次返回所有历史数据
    */
    public class macro_euro_sentix_investor_confidenceRequest extends AkShareRequestAndResponse {
    public macro_euro_sentix_investor_confidenceRequest(){
    setInterfaceName("macro_euro_sentix_investor_confidence");
    }

    public static String name() {
        return "macro_euro_sentix_investor_confidence";
    }
    public String getName() {
    return "macro_euro_sentix_investor_confidence";
    }

    public static macro_euro_sentix_investor_confidenceRequest of(


    String p_wu2,


    Map.Entry
    <String
    , String>... others){
    macro_euro_sentix_investor_confidenceRequest t = new macro_euro_sentix_investor_confidenceRequest();


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
    * required: 无
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
