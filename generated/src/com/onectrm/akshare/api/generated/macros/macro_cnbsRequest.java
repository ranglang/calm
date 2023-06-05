
    package com.onectrm.akshare.api.generated.macros;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_cnbs
    * 目标地址: http://114.115.232.154:8080/
    * 描述: 中国国家金融与发展实验室-中国宏观杠杆率数据
    * 限量: 单次返回所有历史数据
    */
    public class macro_cnbsRequest extends AkShareRequestAndResponse {
    public macro_cnbsRequest(){
    setInterfaceName("macro_cnbs");
    }

    public static String name() {
        return "macro_cnbs";
    }
    public String getName() {
    return "macro_cnbs";
    }

    public static macro_cnbsRequest of(



    Map.Entry
    <String
    , String>... others){
    macro_cnbsRequest t = new macro_cnbsRequest();



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
