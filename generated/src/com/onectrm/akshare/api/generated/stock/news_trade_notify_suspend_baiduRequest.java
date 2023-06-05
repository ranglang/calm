
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: news_trade_notify_suspend_baidu
    * 目标地址: https://gushitong.baidu.com/calendar
    * 描述: 百度股市通-交易提醒-停复牌
    * 限量: 单次获取指定 date 的停复牌数据, 提供港股的停复牌数据
    */
    public class news_trade_notify_suspend_baiduRequest extends AkShareRequestAndResponse {
    public news_trade_notify_suspend_baiduRequest(){
    setInterfaceName("news_trade_notify_suspend_baidu");
    }

    public static String name() {
        return "news_trade_notify_suspend_baidu";
    }
    public String getName() {
    return "news_trade_notify_suspend_baidu";
    }

    public static news_trade_notify_suspend_baiduRequest of(


    String p_date,


    Map.Entry
    <String
    , String>... others){
    news_trade_notify_suspend_baiduRequest t = new news_trade_notify_suspend_baiduRequest();


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
    * desc: date=&quot;20220513&quot;
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
