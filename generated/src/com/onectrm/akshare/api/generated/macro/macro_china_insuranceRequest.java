
    package com.onectrm.akshare.api.generated.macro;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_china_insurance
    * 目标地址: http://finance.sina.com.cn/mac/#fininfo-19-0-31-3
    * 描述: 国家统计局-保险业经营情况
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_insuranceRequest extends AkShareRequestAndResponse {
    public macro_china_insuranceRequest(){
    setInterfaceName("macro_china_insurance");
    }

    public static String name() {
        return "macro_china_insurance";
    }
    public String getName() {
    return "macro_china_insurance";
    }

    public static macro_china_insuranceRequest of(


    String p_wu2,


    Map.Entry
    <String
    , String>... others){
    macro_china_insuranceRequest t = new macro_china_insuranceRequest();


    t.p_wu2 = p_wu2;


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
