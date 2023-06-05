
    package com.onectrm.akshare.api.generated.macro;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_australia_trade
    * 目标地址: http://data.eastmoney.com/cjsj/foreign_5_1.html
    * 描述: 东方财富-经济数据-澳大利亚-贸易帐
    * 限量: 单次返回所有历史数据
    */
    public class macro_australia_tradeRequest extends AkShareRequestAndResponse {
    public macro_australia_tradeRequest(){
    setInterfaceName("macro_australia_trade");
    }

    public static String name() {
        return "macro_australia_trade";
    }
    public String getName() {
    return "macro_australia_trade";
    }

    public static macro_australia_tradeRequest of(



    Map.Entry
    <String
    , String>... others){
    macro_australia_tradeRequest t = new macro_australia_tradeRequest();



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
