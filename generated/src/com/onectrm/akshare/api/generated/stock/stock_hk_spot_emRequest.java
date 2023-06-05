
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_hk_spot_em
    * 目标地址: http://quote.eastmoney.com/center/gridlist.html#hk_stocks
    * 描述: 获取所有港股的实时行情数据; 该数据有 15 分钟延时
    * 限量: 单次返回最近交易日的所有港股的数据
    */
    public class stock_hk_spot_emRequest extends AkShareRequestAndResponse {
    public stock_hk_spot_emRequest(){
    setInterfaceName("stock_hk_spot_em");
    }

    public static String name() {
        return "stock_hk_spot_em";
    }
    public String getName() {
    return "stock_hk_spot_em";
    }

    public static stock_hk_spot_emRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_hk_spot_emRequest t = new stock_hk_spot_emRequest();



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
