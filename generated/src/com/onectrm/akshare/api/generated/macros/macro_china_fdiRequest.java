
    package com.onectrm.akshare.api.generated.macros;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_china_fdi
    * 目标地址: http://data.eastmoney.com/cjsj/qyspjg.html
    * 描述: 东方财富-经济数据一览-中国-外商直接投资数据, 数据区间从 200801-202012
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_fdiRequest extends AkShareRequestAndResponse {
    public macro_china_fdiRequest(){
    setInterfaceName("macro_china_fdi");
    }

    public static String name() {
        return "macro_china_fdi";
    }
    public String getName() {
    return "macro_china_fdi";
    }

    public static macro_china_fdiRequest of(



    Map.Entry
    <String
    , String>... others){
    macro_china_fdiRequest t = new macro_china_fdiRequest();



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
