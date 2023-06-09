
    package com.onectrm.akshare.api.generated.others;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: others
    * 接口: index_bloomberg_billionaires_hist
    * 目标地址: https://stats.areppim.com/stats/links_billionairexlists.htm
    * 描述: 按照年份查询彭博亿万富豪指数; 该接口需要使用代理访问
    * 限量: 单次返回当年所有数据彭博亿万富豪排名数据
    */
    public class index_bloomberg_billionaires_histRequest extends AkShareRequestAndResponse {
    public index_bloomberg_billionaires_histRequest(){
    setInterfaceName("index_bloomberg_billionaires_hist");
    }

    public static String name() {
        return "index_bloomberg_billionaires_hist";
    }
    public String getName() {
    return "index_bloomberg_billionaires_hist";
    }

    public static index_bloomberg_billionaires_histRequest of(


    String p_year,


    Map.Entry
    <String
    , String>... others){
    index_bloomberg_billionaires_histRequest t = new index_bloomberg_billionaires_histRequest();


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
    * name: year
    * type: str
    * desc: year=&quot;2021&quot;; choice of {&quot;2021&quot;, &quot;2019&quot;, &quot;2018&quot;, ...}
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
