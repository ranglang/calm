
    package com.onectrm.akshare.api.generated.macros;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_china_bank_financing
    * 目标地址: https://data.eastmoney.com/cjsj/hyzs_list_EMI01516267.html
    * 描述: 银行理财产品发行数量, 数据区间从 2000 一月-至今
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_bank_financingRequest extends AkShareRequestAndResponse {
    public macro_china_bank_financingRequest(){
    setInterfaceName("macro_china_bank_financing");
    }

    public static String name() {
        return "macro_china_bank_financing";
    }
    public String getName() {
    return "macro_china_bank_financing";
    }

    public static macro_china_bank_financingRequest of(



    Map.Entry
    <String
    , String>... others){
    macro_china_bank_financingRequest t = new macro_china_bank_financingRequest();



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
