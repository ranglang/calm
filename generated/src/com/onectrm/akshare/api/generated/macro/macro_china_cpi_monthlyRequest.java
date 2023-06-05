
    package com.onectrm.akshare.api.generated.macro;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_china_cpi_monthly
    * 目标地址: https://datacenter.jin10.com/reportType/dc_chinese_cpi_mom
    * 描述: 中国月度 CPI 数据, 数据区间从 19960201-至今
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_cpi_monthlyRequest extends AkShareRequestAndResponse {
    public macro_china_cpi_monthlyRequest(){
    setInterfaceName("macro_china_cpi_monthly");
    }

    public static String name() {
        return "macro_china_cpi_monthly";
    }
    public String getName() {
    return "macro_china_cpi_monthly";
    }

    public static macro_china_cpi_monthlyRequest of(


    String p_wu2,


    Map.Entry
    <String
    , String>... others){
    macro_china_cpi_monthlyRequest t = new macro_china_cpi_monthlyRequest();


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
