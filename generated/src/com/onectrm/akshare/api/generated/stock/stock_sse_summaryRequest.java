
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_sse_summary
    * 目标地址: http://www.sse.com.cn/market/stockdata/statistic/
    * 描述: 上海证券交易所-股票数据总貌
    * 限量: 单次返回最近交易日的股票数据总貌(当前交易日的数据需要交易所收盘后统计)
    */
    public class stock_sse_summaryRequest extends AkShareRequestAndResponse {
    public stock_sse_summaryRequest(){
    setInterfaceName("stock_sse_summary");
    }

    public static String name() {
        return "stock_sse_summary";
    }
    public String getName() {
    return "stock_sse_summary";
    }

    public static stock_sse_summaryRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_sse_summaryRequest t = new stock_sse_summaryRequest();



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
