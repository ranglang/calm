
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_ggcg_em
    * 目标地址: http://data.eastmoney.com/executive/gdzjc.html
    * 描述: 东方财富网-数据中心-特色数据-高管持股
    * 限量: 单次获取所有高管持股数据数据
    */
    public class stock_ggcg_emRequest extends AkShareRequestAndResponse {
    public stock_ggcg_emRequest(){
    setInterfaceName("stock_ggcg_em");
    }

    public static String name() {
        return "stock_ggcg_em";
    }
    public String getName() {
    return "stock_ggcg_em";
    }

    public static stock_ggcg_emRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_ggcg_emRequest t = new stock_ggcg_emRequest();



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
