
    package com.onectrm.akshare.api.generated.macro;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: news_economic_baidu
    * 目标地址: https://gushitong.baidu.com/calendar
    * 描述: 全球宏观指标重大事件
    * 限量: 单次返回指定 date 的所有历史数据
    */
    public class news_economic_baiduRequest extends AkShareRequestAndResponse {
    public news_economic_baiduRequest(){
    setInterfaceName("news_economic_baidu");
    }

    public static String name() {
        return "news_economic_baidu";
    }
    public String getName() {
    return "news_economic_baidu";
    }

    public static news_economic_baiduRequest of(


    LocalDate p_date,


    Map.Entry
    <String
    , String>... others){
    news_economic_baiduRequest t = new news_economic_baiduRequest();


    t.p_date = p_date;


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
    * desc: date=&quot;20220502&quot;
    * required: 
    */
    private LocalDate p_date;

    public LocalDate getP_date() { return this.p_date;}
    public void setP_date(LocalDate v) { this.p_date = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
