
    package com.onectrm.akshare.api.generated.macros;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_china_reserve_requirement_ratio
    * 目标地址: https://data.eastmoney.com/cjsj/ckzbj.html
    * 描述: 国家统计局-存款准备金率
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_reserve_requirement_ratioRequest extends AkShareRequestAndResponse {
    public macro_china_reserve_requirement_ratioRequest(){
    setInterfaceName("macro_china_reserve_requirement_ratio");
    }

    public static String name() {
        return "macro_china_reserve_requirement_ratio";
    }
    public String getName() {
    return "macro_china_reserve_requirement_ratio";
    }

    public static macro_china_reserve_requirement_ratioRequest of(



    Map.Entry
    <String
    , String>... others){
    macro_china_reserve_requirement_ratioRequest t = new macro_china_reserve_requirement_ratioRequest();



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
