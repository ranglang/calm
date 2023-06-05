
    package com.onectrm.akshare.api.generated.macro;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_china_agricultural_index
    * 目标地址: https://data.eastmoney.com/cjsj/hyzs_list_EMI00662543.html
    * 描述: 农副指数数据, 数据区间从 20111205-至今
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_agricultural_indexRequest extends AkShareRequestAndResponse {
    public macro_china_agricultural_indexRequest(){
    setInterfaceName("macro_china_agricultural_index");
    }

    public static String name() {
        return "macro_china_agricultural_index";
    }
    public String getName() {
    return "macro_china_agricultural_index";
    }

    public static macro_china_agricultural_indexRequest of(



    Map.Entry
    <String
    , String>... others){
    macro_china_agricultural_indexRequest t = new macro_china_agricultural_indexRequest();



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
