
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_kc_a_spot_em
    * 目标地址: http://quote.eastmoney.com/center/gridlist.html#hs_a_board
    * 描述: 东方财富网-科创板-实时行情
    * 限量: 单次返回所有科创板的实时行情数据
    */
    public class stock_kc_a_spot_emRequest extends AkShareRequestAndResponse {
    public stock_kc_a_spot_emRequest(){
    setInterfaceName("stock_kc_a_spot_em");
    }

    public static String name() {
        return "stock_kc_a_spot_em";
    }
    public String getName() {
    return "stock_kc_a_spot_em";
    }

    public static stock_kc_a_spot_emRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_kc_a_spot_emRequest t = new stock_kc_a_spot_emRequest();



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
