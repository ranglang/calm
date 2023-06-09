
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_inner_trade_xq
    * 目标地址: https://xueqiu.com/hq/insider
    * 描述: 雪球-行情中心-沪深股市-内部交易
    * 限量: 单次返回所有历史数据
    */
    public class stock_inner_trade_xqRequest extends AkShareRequestAndResponse {
    public stock_inner_trade_xqRequest(){
    setInterfaceName("stock_inner_trade_xq");
    }

    public static String name() {
        return "stock_inner_trade_xq";
    }
    public String getName() {
    return "stock_inner_trade_xq";
    }

    public static stock_inner_trade_xqRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_inner_trade_xqRequest t = new stock_inner_trade_xqRequest();



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
