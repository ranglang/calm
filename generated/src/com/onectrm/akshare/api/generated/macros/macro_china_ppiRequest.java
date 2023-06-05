
    package com.onectrm.akshare.api.generated.macros;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_china_ppi
    * 目标地址: http://data.eastmoney.com/cjsj/ppi.html
    * 描述: 工业品出厂价格指数, 数据区间从 200601 至今, 月度数据
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_ppiRequest extends AkShareRequestAndResponse {
    public macro_china_ppiRequest(){
    setInterfaceName("macro_china_ppi");
    }

    public static String name() {
        return "macro_china_ppi";
    }
    public String getName() {
    return "macro_china_ppi";
    }

    public static macro_china_ppiRequest of(



    Map.Entry
    <String
    , String>... others){
    macro_china_ppiRequest t = new macro_china_ppiRequest();



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
