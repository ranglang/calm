
    package com.onectrm.akshare.api.generated.fund_public;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fund_public
    * 接口: reits_realtime_em
    * 目标地址: http://quote.eastmoney.com/center/gridlist.html#fund_reits_all
    * 描述: 东方财富网-行情中心-REITs-沪深 REITs
    * 限量: 单次返回所有 REITs 的实时行情数据
    */
    public class reits_realtime_emRequest extends AkShareRequestAndResponse {
    public reits_realtime_emRequest(){
    setInterfaceName("reits_realtime_em");
    }

    public static String name() {
        return "reits_realtime_em";
    }
    public String getName() {
    return "reits_realtime_em";
    }

    public static reits_realtime_emRequest of(



    Map.Entry
    <String
    , String>... others){
    reits_realtime_emRequest t = new reits_realtime_emRequest();



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
