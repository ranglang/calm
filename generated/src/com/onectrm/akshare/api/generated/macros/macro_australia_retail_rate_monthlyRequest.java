
    package com.onectrm.akshare.api.generated.macros;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_australia_retail_rate_monthly
    * 目标地址: http://data.eastmoney.com/cjsj/foreign_5_0.html
    * 描述: 东方财富-经济数据-澳大利亚-零售销售月率
    * 限量: 单次返回所有历史数据
    */
    public class macro_australia_retail_rate_monthlyRequest extends AkShareRequestAndResponse {
    public macro_australia_retail_rate_monthlyRequest(){
    setInterfaceName("macro_australia_retail_rate_monthly");
    }

    public static String name() {
        return "macro_australia_retail_rate_monthly";
    }
    public String getName() {
    return "macro_australia_retail_rate_monthly";
    }

    public static macro_australia_retail_rate_monthlyRequest of(



    Map.Entry
    <String
    , String>... others){
    macro_australia_retail_rate_monthlyRequest t = new macro_australia_retail_rate_monthlyRequest();



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
