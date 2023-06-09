
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_zh_a_new_em
    * 目标地址: http://quote.eastmoney.com/center/gridlist.html#newshares
    * 描述: 东方财富网-行情中心-沪深个股-新股
    * 限量: 单次返回当前交易日新股板块的所有股票的行情数据
    */
    public class stock_zh_a_new_emRequest extends AkShareRequestAndResponse {
    public stock_zh_a_new_emRequest(){
    setInterfaceName("stock_zh_a_new_em");
    }

    public static String name() {
        return "stock_zh_a_new_em";
    }
    public String getName() {
    return "stock_zh_a_new_em";
    }

    public static stock_zh_a_new_emRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_zh_a_new_emRequest t = new stock_zh_a_new_emRequest();



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
