
    package com.onectrm.akshare.api.generated.macros;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_china_stock_market_cap
    * 目标地址: http://data.eastmoney.com/cjsj/gpjytj.html
    * 描述: 全国股票交易统计表, 数据区间从 200801 至今, 月度数据
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_stock_market_capRequest extends AkShareRequestAndResponse {
    public macro_china_stock_market_capRequest(){
    setInterfaceName("macro_china_stock_market_cap");
    }

    public static String name() {
        return "macro_china_stock_market_cap";
    }
    public String getName() {
    return "macro_china_stock_market_cap";
    }

    public static macro_china_stock_market_capRequest of(



    Map.Entry
    <String
    , String>... others){
    macro_china_stock_market_capRequest t = new macro_china_stock_market_capRequest();



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
