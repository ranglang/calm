
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_sse_deal_daily
    * 目标地址: http://www.sse.com.cn/market/stockdata/overview/day/
    * 描述: 上海证券交易所-数据-股票数据-成交概况-股票成交概况-每日股票情况
    * 限量: 单次返回指定日期的每日概况数据, 当前交易日数据需要在收盘后获取; 注意在 20211227（包含）之后输出格式变化
    */
    public class stock_sse_deal_dailyRequest extends AkShareRequestAndResponse {
    public stock_sse_deal_dailyRequest(){
    setInterfaceName("stock_sse_deal_daily");
    }

    public static String name() {
        return "stock_sse_deal_daily";
    }
    public String getName() {
    return "stock_sse_deal_daily";
    }

    public static stock_sse_deal_dailyRequest of(


    String p_date,


    Map.Entry
    <String
    , String>... others){
    stock_sse_deal_dailyRequest t = new stock_sse_deal_dailyRequest();


    t.p_date = p_date;
    t.other.put("date", p_date.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: date
    * type: str
    * desc: date=&quot;20200619&quot;; 当前交易日的数据需要交易所收盘后统计; 注意在 20211227（包含）之后输出格式变化
    * required: 
    */
    private String p_date;

    public String getP_date() { return this.p_date;}
    public void setP_date(String v) { this.p_date = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
