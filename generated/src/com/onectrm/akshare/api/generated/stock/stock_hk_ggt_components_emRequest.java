
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_hk_ggt_components_em
    * 目标地址: https://quote.eastmoney.com/center/gridlist.html#hk_components
    * 描述: 东方财富网-行情中心-港股市场-港股通成份股
    * 限量: 单次获取所有港股通成份股数据
    */
    public class stock_hk_ggt_components_emRequest extends AkShareRequestAndResponse {
    public stock_hk_ggt_components_emRequest(){
    setInterfaceName("stock_hk_ggt_components_em");
    }

    public static String name() {
        return "stock_hk_ggt_components_em";
    }
    public String getName() {
    return "stock_hk_ggt_components_em";
    }

    public static stock_hk_ggt_components_emRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_hk_ggt_components_emRequest t = new stock_hk_ggt_components_emRequest();



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
