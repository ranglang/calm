
    package com.onectrm.akshare.api.generated.macro;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_china_vegetable_basket
    * 目标地址: https://data.eastmoney.com/cjsj/hyzs_list_EMI00009275.html
    * 描述: 菜篮子产品批发价格指数, 数据区间从 20050927-至今
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_vegetable_basketRequest extends AkShareRequestAndResponse {
    public macro_china_vegetable_basketRequest(){
    setInterfaceName("macro_china_vegetable_basket");
    }

    public static String name() {
        return "macro_china_vegetable_basket";
    }
    public String getName() {
    return "macro_china_vegetable_basket";
    }

    public static macro_china_vegetable_basketRequest of(



    Map.Entry
    <String
    , String>... others){
    macro_china_vegetable_basketRequest t = new macro_china_vegetable_basketRequest();



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
