
    package com.onectrm.akshare.api.generated.macro;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_china_money_supply
    * 目标地址: http://data.eastmoney.com/cjsj/hbgyl.html
    * 描述: 东方财富-经济数据-中国宏观-中国货币供应量; 数据区间从 200801 至今, 月度数据
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_money_supplyRequest extends AkShareRequestAndResponse {
    public macro_china_money_supplyRequest(){
    setInterfaceName("macro_china_money_supply");
    }

    public static String name() {
        return "macro_china_money_supply";
    }
    public String getName() {
    return "macro_china_money_supply";
    }

    public static macro_china_money_supplyRequest of(



    Map.Entry
    <String
    , String>... others){
    macro_china_money_supplyRequest t = new macro_china_money_supplyRequest();



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
