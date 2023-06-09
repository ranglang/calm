
    package com.onectrm.akshare.api.generated.macro;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_china_xfzxx
    * 目标地址: https://data.eastmoney.com/cjsj/xfzxx.html
    * 描述: 东方财富网-消费者信心指数
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_xfzxxRequest extends AkShareRequestAndResponse {
    public macro_china_xfzxxRequest(){
    setInterfaceName("macro_china_xfzxx");
    }

    public static String name() {
        return "macro_china_xfzxx";
    }
    public String getName() {
    return "macro_china_xfzxx";
    }

    public static macro_china_xfzxxRequest of(



    Map.Entry
    <String
    , String>... others){
    macro_china_xfzxxRequest t = new macro_china_xfzxxRequest();



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
