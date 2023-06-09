
    package com.onectrm.akshare.api.generated.others;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: others
    * 接口: hurun_rank
    * 目标地址: https://www.hurun.net/zh-CN/Rank/HsRankDetails?num=QWDD234E
    * 描述: 胡润百富榜单；富豪榜系列，创业系列，500强系列，特色系列
    * 限量: 单次返回指定 indicator 和 year 的榜单数据
    */
    public class hurun_rankRequest extends AkShareRequestAndResponse {
    public hurun_rankRequest(){
    setInterfaceName("hurun_rank");
    }

    public static String name() {
        return "hurun_rank";
    }
    public String getName() {
    return "hurun_rank";
    }

    public static hurun_rankRequest of(


    String p_indicator,

    String p_year,


    Map.Entry
    <String
    , String>... others){
    hurun_rankRequest t = new hurun_rankRequest();


    t.p_indicator = p_indicator;
    t.other.put("indicator", p_indicator.toString());

    t.p_year = p_year;
    t.other.put("year", p_year.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: indicator
    * type: str
    * desc: indicator=&quot;胡润百富榜&quot;; choice of {&quot;胡润百富榜&quot;, &quot;胡润全球富豪榜&quot;, &quot;胡润印度榜&quot;, &quot;胡润全球独角兽榜&quot;, &quot;中国瞪羚企业榜&quot;, &quot;全球瞪羚企业榜&quot;, &quot;胡润Under30s创业领袖榜&quot;, &quot;胡润中国500强民营企业&quot;, &quot;胡润世界500强&quot;, &quot;胡润艺术榜&quot;}
    * required: 
    */
    private String p_indicator;

    public String getP_indicator() { return this.p_indicator;}
    public void setP_indicator(String v) { this.p_indicator = v;}

    /**
    * name: year
    * type: str
    * desc: year=&quot;2020&quot;; choice of {&quot;胡润百富榜&quot;: &quot;2014-至今&quot;, &quot;胡润全球富豪榜&quot;: &quot;2019-至今&quot;, &quot;胡润印度榜&quot;: &quot;2018-至今&quot;, &quot;胡润全球独角兽榜&quot;: &quot;2019-至今&quot;, &quot;中国瞪羚企业榜&quot;: &quot;2021-至今&quot;, &quot;全球瞪羚企业榜&quot;: &quot;2021-至今&quot;, &quot;胡润Under30s创业领袖榜&quot;: &quot;2019-至今&quot;, &quot;胡润中国500强民营企业&quot;: &quot;2019-至今&quot;, &quot;胡润世界500强&quot;: &quot;2020-至今&quot;, &quot;胡润艺术榜&quot;: &quot;2019-至今&quot;}
    * required: 
    */
    private String p_year;

    public String getP_year() { return this.p_year;}
    public void setP_year(String v) { this.p_year = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
