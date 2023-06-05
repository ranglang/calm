
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_new_a_spot_em
    * 目标地址: http://quote.eastmoney.com/center/gridlist.html#newshares
    * 描述: 东方财富网-新股-实时行情数据
    * 限量: 单次返回所有新股上市公司的实时行情数据
    */
    public class stock_new_a_spot_emRequest extends AkShareRequestAndResponse {
    public stock_new_a_spot_emRequest(){
    setInterfaceName("stock_new_a_spot_em");
    }

    public static String name() {
        return "stock_new_a_spot_em";
    }
    public String getName() {
    return "stock_new_a_spot_em";
    }

    public static stock_new_a_spot_emRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_new_a_spot_emRequest t = new stock_new_a_spot_emRequest();



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