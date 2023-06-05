
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_hot_follow_xq
    * 目标地址: https://xueqiu.com/hq
    * 描述: 雪球-沪深股市-热度排行榜-关注排行榜
    * 限量: 单次返回所有股票的热度数据
    */
    public class stock_hot_follow_xqRequest extends AkShareRequestAndResponse {
    public stock_hot_follow_xqRequest(){
    setInterfaceName("stock_hot_follow_xq");
    }

    public static String name() {
        return "stock_hot_follow_xq";
    }
    public String getName() {
    return "stock_hot_follow_xq";
    }

    public static stock_hot_follow_xqRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    stock_hot_follow_xqRequest t = new stock_hot_follow_xqRequest();


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
    * desc: symbol=&quot;最热门&quot;; choice of {&quot;本周新增&quot;, &quot;最热门&quot;}
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
