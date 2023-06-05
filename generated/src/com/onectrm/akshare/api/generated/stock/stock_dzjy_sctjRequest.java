
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_dzjy_sctj
    * 目标地址: http://data.eastmoney.com/dzjy/dzjy_sctj.aspx
    * 描述: 东方财富网-数据中心-大宗交易-市场统计
    * 限量: 单次返回所有历史数据
    */
    public class stock_dzjy_sctjRequest extends AkShareRequestAndResponse {
    public stock_dzjy_sctjRequest(){
    setInterfaceName("stock_dzjy_sctj");
    }

    public static String name() {
        return "stock_dzjy_sctj";
    }
    public String getName() {
    return "stock_dzjy_sctj";
    }

    public static stock_dzjy_sctjRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_dzjy_sctjRequest t = new stock_dzjy_sctjRequest();



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
