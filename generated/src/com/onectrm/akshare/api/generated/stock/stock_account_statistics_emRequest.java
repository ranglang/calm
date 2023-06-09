
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_account_statistics_em
    * 目标地址: http://data.eastmoney.com/cjsj/gpkhsj.html
    * 描述: 东方财富网-数据中心-特色数据-股票账户统计
    * 限量: 单次获取从 201504 开始至今的所有历史数据
    */
    public class stock_account_statistics_emRequest extends AkShareRequestAndResponse {
    public stock_account_statistics_emRequest(){
    setInterfaceName("stock_account_statistics_em");
    }

    public static String name() {
        return "stock_account_statistics_em";
    }
    public String getName() {
    return "stock_account_statistics_em";
    }

    public static stock_account_statistics_emRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_account_statistics_emRequest t = new stock_account_statistics_emRequest();



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
