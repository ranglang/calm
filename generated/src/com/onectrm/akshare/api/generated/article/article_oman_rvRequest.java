
    package com.onectrm.akshare.api.generated.article;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: article
    * 接口: article_oman_rv
    * 目标地址: https://realized.oxford-man.ox.ac.uk/data/visualization
    * 描述: 获取 Oxford-Man 已实现波动率数据
    * 限量: 单次返回某个指数具体指标的所有历史数据
    */
    public class article_oman_rvRequest extends AkShareRequestAndResponse {
    public article_oman_rvRequest(){
    setInterfaceName("article_oman_rv");
    }

    public static String name() {
        return "article_oman_rv";
    }
    public String getName() {
    return "article_oman_rv";
    }

    public static article_oman_rvRequest of(


    String p_symbol,

    String p_index,


    Map.Entry
    <String
    , String>... others){
    article_oman_rvRequest t = new article_oman_rvRequest();


    t.p_symbol = p_symbol;
    t.other.put("symbol", p_symbol.toString());

    t.p_index = p_index;
    t.other.put("index", p_index.toString());


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
    * desc: symbol=&quot;FTSE&quot;, 具体指数请查看如下 **已实现波动率指数一览表**
    * required: Y
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: index
    * type: str
    * desc: index=&quot;rk_th2&quot;, 具体指标请查看如下 **已实现波动率指标一览表**
    * required: Y
    */
    private String p_index;

    public String getP_index() { return this.p_index;}
    public void setP_index(String v) { this.p_index = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
