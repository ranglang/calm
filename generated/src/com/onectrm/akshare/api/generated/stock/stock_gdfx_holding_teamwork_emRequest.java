
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_gdfx_holding_teamwork_em
    * 目标地址: https://data.eastmoney.com/gdfx/HoldingAnalyse.html
    * 描述: 东方财富网-数据中心-股东分析-股东协同-十大股东
    * 限量: 单次返回所有数据
    */
    public class stock_gdfx_holding_teamwork_emRequest extends AkShareRequestAndResponse {
    public stock_gdfx_holding_teamwork_emRequest(){
    setInterfaceName("stock_gdfx_holding_teamwork_em");
    }

    public static String name() {
        return "stock_gdfx_holding_teamwork_em";
    }
    public String getName() {
    return "stock_gdfx_holding_teamwork_em";
    }

    public static stock_gdfx_holding_teamwork_emRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_gdfx_holding_teamwork_emRequest t = new stock_gdfx_holding_teamwork_emRequest();



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
