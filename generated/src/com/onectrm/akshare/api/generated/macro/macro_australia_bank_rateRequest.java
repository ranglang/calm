
    package com.onectrm.akshare.api.generated.macro;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_australia_bank_rate
    * 目标地址: http://data.eastmoney.com/cjsj/foreign_5_6.html
    * 描述: 东方财富-经济数据-澳大利亚-央行公布利率决议
    * 限量: 单次返回所有历史数据
    */
    public class macro_australia_bank_rateRequest extends AkShareRequestAndResponse {
    public macro_australia_bank_rateRequest(){
    setInterfaceName("macro_australia_bank_rate");
    }

    public static String name() {
        return "macro_australia_bank_rate";
    }
    public String getName() {
    return "macro_australia_bank_rate";
    }

    public static macro_australia_bank_rateRequest of(



    Map.Entry
    <String
    , String>... others){
    macro_australia_bank_rateRequest t = new macro_australia_bank_rateRequest();



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
