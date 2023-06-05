
    package com.onectrm.akshare.api.generated.fund_public;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fund_public
    * 接口: reits_info_jsl
    * 目标地址: https://www.jisilu.cn/data/cnreits/#CnReits
    * 描述: 集思录-实时数据-REITs-A股 REITs
    * 限量: 单次返回所有 REITs 的基本信息数据
    */
    public class reits_info_jslRequest extends AkShareRequestAndResponse {
    public reits_info_jslRequest(){
    setInterfaceName("reits_info_jsl");
    }

    public static String name() {
        return "reits_info_jsl";
    }
    public String getName() {
    return "reits_info_jsl";
    }

    public static reits_info_jslRequest of(



    Map.Entry
    <String
    , String>... others){
    reits_info_jslRequest t = new reits_info_jslRequest();



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
