
    package com.onectrm.akshare.api.generated.macro;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_china_fx_gold
    * 目标地址: http://data.eastmoney.com/cjsj/hjwh.html
    * 描述: 获取中国外汇和黄金储备, 数据区间从 200801 至今, 月度数据
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_fx_goldRequest extends AkShareRequestAndResponse {
    public macro_china_fx_goldRequest(){
    setInterfaceName("macro_china_fx_gold");
    }

    public static String name() {
        return "macro_china_fx_gold";
    }
    public String getName() {
    return "macro_china_fx_gold";
    }

    public static macro_china_fx_goldRequest of(



    Map.Entry
    <String
    , String>... others){
    macro_china_fx_goldRequest t = new macro_china_fx_goldRequest();



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
