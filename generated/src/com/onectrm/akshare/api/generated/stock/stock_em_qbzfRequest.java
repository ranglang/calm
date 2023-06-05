
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_em_qbzf
    * 目标地址: http://data.eastmoney.com/other/gkzf.html
    * 描述: 东方财富网-数据中心-新股数据-增发-全部增发
    * 限量: 单次返回所有历史数据
    */
    public class stock_em_qbzfRequest extends AkShareRequestAndResponse {
    public stock_em_qbzfRequest(){
    setInterfaceName("stock_em_qbzf");
    }

    public static String name() {
        return "stock_em_qbzf";
    }
    public String getName() {
    return "stock_em_qbzf";
    }

    public static stock_em_qbzfRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_em_qbzfRequest t = new stock_em_qbzfRequest();



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
