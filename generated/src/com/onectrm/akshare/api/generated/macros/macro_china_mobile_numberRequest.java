
    package com.onectrm.akshare.api.generated.macros;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_china_mobile_number
    * 目标地址: https://data.eastmoney.com/cjsj/hyzs_list_EMI00225823.html
    * 描述: 手机出货量, 数据区间从 201201-至今
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_mobile_numberRequest extends AkShareRequestAndResponse {
    public macro_china_mobile_numberRequest(){
    setInterfaceName("macro_china_mobile_number");
    }

    public static String name() {
        return "macro_china_mobile_number";
    }
    public String getName() {
    return "macro_china_mobile_number";
    }

    public static macro_china_mobile_numberRequest of(



    Map.Entry
    <String
    , String>... others){
    macro_china_mobile_numberRequest t = new macro_china_mobile_numberRequest();



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
