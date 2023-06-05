
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_zh_index_spot
    * 目标地址: http://vip.stock.finance.sina.com.cn/mkt/#hs_s
    * 描述: 中国股票指数数据, 注意该股票指数指新浪提供的国内股票指数
    * 限量: 单次返回所有指数的实时行情数据
    */
    public class stock_zh_index_spotRequest extends AkShareRequestAndResponse {
    public stock_zh_index_spotRequest(){
    setInterfaceName("stock_zh_index_spot");
    }

    public static String name() {
        return "stock_zh_index_spot";
    }
    public String getName() {
    return "stock_zh_index_spot";
    }

    public static stock_zh_index_spotRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_zh_index_spotRequest t = new stock_zh_index_spotRequest();



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
