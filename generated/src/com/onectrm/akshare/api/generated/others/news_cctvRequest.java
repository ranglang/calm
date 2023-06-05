
    package com.onectrm.akshare.api.generated.others;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: others
    * 接口: news_cctv
    * 目标地址: https://tv.cctv.com/lm/xwlb/?spm=C52056131267.P4y8I53JvSWE.0.0
    * 描述: 新闻联播文字稿, 数据区间从 20160330-至今
    * 限量: 单次返回指定日期新闻联播文字稿数据
    */
    public class news_cctvRequest extends AkShareRequestAndResponse {
    public news_cctvRequest(){
    setInterfaceName("news_cctv");
    }

    public static String name() {
        return "news_cctv";
    }
    public String getName() {
    return "news_cctv";
    }

    public static news_cctvRequest of(


    String p_date,


    Map.Entry
    <String
    , String>... others){
    news_cctvRequest t = new news_cctvRequest();


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
    * desc: date=&quot;20210708&quot;;  20160330-至今
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
