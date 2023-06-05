
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_fund_flow_big_deal
    * 目标地址: http://data.10jqka.com.cn/funds/ddzz/###
    * 描述: 同花顺-数据中心-资金流向-大单追踪
    * 限量: 单次获取当前时点的所有大单追踪数据
    */
    public class stock_fund_flow_big_dealRequest extends AkShareRequestAndResponse {
    public stock_fund_flow_big_dealRequest(){
    setInterfaceName("stock_fund_flow_big_deal");
    }

    public static String name() {
        return "stock_fund_flow_big_deal";
    }
    public String getName() {
    return "stock_fund_flow_big_deal";
    }

    public static stock_fund_flow_big_dealRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_fund_flow_big_dealRequest t = new stock_fund_flow_big_dealRequest();



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
