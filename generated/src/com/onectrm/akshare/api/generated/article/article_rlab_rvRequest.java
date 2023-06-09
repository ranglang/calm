
    package com.onectrm.akshare.api.generated.article;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: article
    * 接口: article_rlab_rv
    * 目标地址: https://dachxiu.chicagobooth.edu/
    * 描述: 获取 Risk-Lab 已实现波动率数据
    * 限量: 单次返回某个指数所有历史数据
    */
    public class article_rlab_rvRequest extends AkShareRequestAndResponse {
    public article_rlab_rvRequest(){
    setInterfaceName("article_rlab_rv");
    }

    public static String name() {
        return "article_rlab_rv";
    }
    public String getName() {
    return "article_rlab_rv";
    }

    public static article_rlab_rvRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    article_rlab_rvRequest t = new article_rlab_rvRequest();


    t.p_symbol = p_symbol;
    t.other.put("symbol", p_symbol.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: symbol
    * type: str
    * desc: symbol=&quot;39693&quot;, 某个具体指数 help(article_rlab_rv)
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
