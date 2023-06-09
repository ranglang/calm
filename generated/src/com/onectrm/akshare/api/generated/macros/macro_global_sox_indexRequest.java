
    package com.onectrm.akshare.api.generated.macros;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_global_sox_index
    * 目标地址: https://data.eastmoney.com/cjsj/hyzs_list_EMI00055562.html
    * 描述: 费城半导体指数数据, 数据区间从 19940504-至今
    * 限量: 单次返回所有历史数据
    */
    public class macro_global_sox_indexRequest extends AkShareRequestAndResponse {
    public macro_global_sox_indexRequest(){
    setInterfaceName("macro_global_sox_index");
    }

    public static String name() {
        return "macro_global_sox_index";
    }
    public String getName() {
    return "macro_global_sox_index";
    }

    public static macro_global_sox_indexRequest of(



    Map.Entry
    <String
    , String>... others){
    macro_global_sox_indexRequest t = new macro_global_sox_indexRequest();



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
