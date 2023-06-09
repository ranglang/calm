
    package com.onectrm.akshare.api.generated.macros;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_usa_cftc_merchant_goods_holding
    * 目标地址: https://datacenter.jin10.com/reportType/dc_cftc_merchant_goods
    * 描述: 美国商品期货交易委员会 CFTC 商品类商业持仓报告, 数据区间从 19860115-至今
    * 限量: 单次返回所有历史数据
    */
    public class macro_usa_cftc_merchant_goods_holdingRequest extends AkShareRequestAndResponse {
    public macro_usa_cftc_merchant_goods_holdingRequest(){
    setInterfaceName("macro_usa_cftc_merchant_goods_holding");
    }

    public static String name() {
        return "macro_usa_cftc_merchant_goods_holding";
    }
    public String getName() {
    return "macro_usa_cftc_merchant_goods_holding";
    }

    public static macro_usa_cftc_merchant_goods_holdingRequest of(



    Map.Entry
    <String
    , String>... others){
    macro_usa_cftc_merchant_goods_holdingRequest t = new macro_usa_cftc_merchant_goods_holdingRequest();



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
