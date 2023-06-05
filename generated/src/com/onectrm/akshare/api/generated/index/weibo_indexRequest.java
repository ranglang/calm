
    package com.onectrm.akshare.api.generated.index;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: index
    * 接口: weibo_index
    * 目标地址: https://data.weibo.com/index/newindex
    * 描述: 获取指定 **word** 的微博指数
    * 限量: 由于申万源问题该接口暂不能获取数据
    */
    public class weibo_indexRequest extends AkShareRequestAndResponse {
    public weibo_indexRequest(){
    setInterfaceName("weibo_index");
    }

    public static String name() {
        return "weibo_index";
    }
    public String getName() {
    return "weibo_index";
    }

    public static weibo_indexRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    weibo_indexRequest t = new weibo_indexRequest();


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
    * desc: symbol=&quot;801010&quot;
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
