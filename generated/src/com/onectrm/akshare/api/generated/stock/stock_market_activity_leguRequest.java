
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_market_activity_legu
    * 目标地址: https://www.legulegu.com/stockdata/market-activity
    * 描述: 乐咕乐股网-赚钱效应分析数据
    * 限量: 单次返回当前赚钱效应分析数据
    */
    public class stock_market_activity_leguRequest extends AkShareRequestAndResponse {
    public stock_market_activity_leguRequest(){
    setInterfaceName("stock_market_activity_legu");
    }

    public static String name() {
        return "stock_market_activity_legu";
    }
    public String getName() {
    return "stock_market_activity_legu";
    }

    public static stock_market_activity_leguRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_market_activity_leguRequest t = new stock_market_activity_leguRequest();



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
