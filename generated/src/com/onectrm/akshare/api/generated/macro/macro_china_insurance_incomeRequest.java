
    package com.onectrm.akshare.api.generated.macro;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_china_insurance_income
    * 目标地址: https://data.eastmoney.com/cjsj/hyzs_list_EMM00088870.html
    * 描述: 原保险保费收入, 数据区间从 200407-至今
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_insurance_incomeRequest extends AkShareRequestAndResponse {
    public macro_china_insurance_incomeRequest(){
    setInterfaceName("macro_china_insurance_income");
    }

    public static String name() {
        return "macro_china_insurance_income";
    }
    public String getName() {
    return "macro_china_insurance_income";
    }

    public static macro_china_insurance_incomeRequest of(



    Map.Entry
    <String
    , String>... others){
    macro_china_insurance_incomeRequest t = new macro_china_insurance_incomeRequest();



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
