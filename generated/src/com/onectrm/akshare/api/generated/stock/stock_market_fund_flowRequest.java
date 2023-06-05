
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_market_fund_flow
    * 目标地址: http://data.eastmoney.com/zjlx/dpzjlx.html
    * 描述: 获取东方财富网-数据中心-资金流向-大盘
    * 限量: 单次获取大盘资金流向历史数据
    */
    public class stock_market_fund_flowRequest extends AkShareRequestAndResponse {
    public stock_market_fund_flowRequest(){
    setInterfaceName("stock_market_fund_flow");
    }

    public static String name() {
        return "stock_market_fund_flow";
    }
    public String getName() {
    return "stock_market_fund_flow";
    }

    public static stock_market_fund_flowRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_market_fund_flowRequest t = new stock_market_fund_flowRequest();



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
