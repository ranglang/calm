
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_us_zh_spot
    * 目标地址: http://quote.hexun.com/default.html#ustock_0
    * 描述: 获取中国概念股实时行情数据
    * 限量: 单次获取所有中概股公司的实时行情数据
    */
    public class stock_us_zh_spotRequest extends AkShareRequestAndResponse {
    public stock_us_zh_spotRequest(){
    setInterfaceName("stock_us_zh_spot");
    }

    public static String name() {
        return "stock_us_zh_spot";
    }
    public String getName() {
    return "stock_us_zh_spot";
    }

    public static stock_us_zh_spotRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_us_zh_spotRequest t = new stock_us_zh_spotRequest();



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
