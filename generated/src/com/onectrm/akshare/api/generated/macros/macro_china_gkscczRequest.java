
    package com.onectrm.akshare.api.generated.macros;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_china_gksccz
    * 目标地址: http://www.chinamoney.com.cn/chinese/yhgkscczh/
    * 描述: 央行公开市场操作; 数据区间从 20040116 至今
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_gkscczRequest extends AkShareRequestAndResponse {
    public macro_china_gkscczRequest(){
    setInterfaceName("macro_china_gksccz");
    }

    public static String name() {
        return "macro_china_gksccz";
    }
    public String getName() {
    return "macro_china_gksccz";
    }

    public static macro_china_gkscczRequest of(



    Map.Entry
    <String
    , String>... others){
    macro_china_gkscczRequest t = new macro_china_gkscczRequest();



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
