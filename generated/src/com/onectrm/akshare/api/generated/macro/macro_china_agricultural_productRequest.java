
    package com.onectrm.akshare.api.generated.macro;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_china_agricultural_product
    * 目标地址: https://data.eastmoney.com/cjsj/hyzs_list_EMI00009274.html
    * 描述: 农产品批发价格总指数, 数据区间从 20050927-至今
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_agricultural_productRequest extends AkShareRequestAndResponse {
    public macro_china_agricultural_productRequest(){
    setInterfaceName("macro_china_agricultural_product");
    }

    public static String name() {
        return "macro_china_agricultural_product";
    }
    public String getName() {
    return "macro_china_agricultural_product";
    }

    public static macro_china_agricultural_productRequest of(



    Map.Entry
    <String
    , String>... others){
    macro_china_agricultural_productRequest t = new macro_china_agricultural_productRequest();



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
