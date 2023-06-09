
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_hk_spot
    * 目标地址: http://vip.stock.finance.sina.com.cn/mkt/#qbgg_hk
    * 描述: 获取所有港股的实时行情数据 15 分钟延时
    * 限量: 单次返回当前时间戳的所有港股的数据
    */
    public class stock_hk_spotRequest extends AkShareRequestAndResponse {
    public stock_hk_spotRequest(){
    setInterfaceName("stock_hk_spot");
    }

    public static String name() {
        return "stock_hk_spot";
    }
    public String getName() {
    return "stock_hk_spot";
    }

    public static stock_hk_spotRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_hk_spotRequest t = new stock_hk_spotRequest();



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
