
    package com.onectrm.akshare.api.generated.macro;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_china_ppi_yearly
    * 目标地址: https://datacenter.jin10.com/reportType/dc_chinese_ppi_yoy
    * 描述: 获取中国年度PPI数据, 数据区间从19950801-至今
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_ppi_yearlyRequest extends AkShareRequestAndResponse {
    public macro_china_ppi_yearlyRequest(){
    setInterfaceName("macro_china_ppi_yearly");
    }

    public static String name() {
        return "macro_china_ppi_yearly";
    }
    public String getName() {
    return "macro_china_ppi_yearly";
    }

    public static macro_china_ppi_yearlyRequest of(



    Map.Entry
    <String
    , String>... others){
    macro_china_ppi_yearlyRequest t = new macro_china_ppi_yearlyRequest();



    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }




    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
