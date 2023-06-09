
    package com.onectrm.akshare.api.generated.option;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: option
    * 接口: option_premium_analysis_em
    * 目标地址: https://data.eastmoney.com/other/premium.html
    * 描述: 东方财富网-数据中心-特色数据-期权折溢价
    * 限量: 单次返回所有数据
    */
    public class option_premium_analysis_emRequest extends AkShareRequestAndResponse {
    public option_premium_analysis_emRequest(){
    setInterfaceName("option_premium_analysis_em");
    }

    public static String name() {
        return "option_premium_analysis_em";
    }
    public String getName() {
    return "option_premium_analysis_em";
    }

    public static option_premium_analysis_emRequest of(



    Map.Entry
    <String
    , String>... others){
    option_premium_analysis_emRequest t = new option_premium_analysis_emRequest();



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
