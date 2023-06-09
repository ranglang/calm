
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_info_sh_delist
    * 目标地址: http://www.sse.com.cn/assortment/stock/list/delisting/
    * 描述: 上海证券交易所暂停/终止上市股票
    * 限量: 单次获取上海证券交易所暂停/终止上市股票
    */
    public class stock_info_sh_delistRequest extends AkShareRequestAndResponse {
    public stock_info_sh_delistRequest(){
    setInterfaceName("stock_info_sh_delist");
    }

    public static String name() {
        return "stock_info_sh_delist";
    }
    public String getName() {
    return "stock_info_sh_delist";
    }

    public static stock_info_sh_delistRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_info_sh_delistRequest t = new stock_info_sh_delistRequest();



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
