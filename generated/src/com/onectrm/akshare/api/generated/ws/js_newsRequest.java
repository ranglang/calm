
    package com.onectrm.akshare.api.generated.ws;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: ws
    * 接口: js_news
    * 目标地址: https://www.jin10.com/
    * 描述: 金十数据新闻资讯数据
    * 限量: 当日最近 4 小时内的新闻资讯数据
    */
    public class js_newsRequest extends AkShareRequestAndResponse {
    public js_newsRequest(){
    setInterfaceName("js_news");
    }

    public static String name() {
        return "js_news";
    }
    public String getName() {
    return "js_news";
    }

    public static js_newsRequest of(


    String p_timestamp,


    Map.Entry
    <String
    , String>... others){
    js_newsRequest t = new js_newsRequest();


    t.p_timestamp = p_timestamp;
    t.other.put("timestamp", p_timestamp.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: timestamp
    * type: str
    * desc: timestamp=&quot;2022-04-25 17:57:18&quot;
    * required: 
    */
    private String p_timestamp;

    public String getP_timestamp() { return this.p_timestamp;}
    public void setP_timestamp(String v) { this.p_timestamp = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
