
    package com.onectrm.akshare.api.generated.others;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: others
    * 接口: club_rank_game
    * 目标地址: http://rank.uuu9.com/
    * 描述: 中国电竞价值排行榜-俱乐部排名
    * 限量: 返回当前的俱乐部排名数据
    */
    public class club_rank_gameRequest extends AkShareRequestAndResponse {
    public club_rank_gameRequest(){
    setInterfaceName("club_rank_game");
    }

    public static String name() {
        return "club_rank_game";
    }
    public String getName() {
    return "club_rank_game";
    }

    public static club_rank_gameRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    club_rank_gameRequest t = new club_rank_gameRequest();


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
    * desc: symbol=&quot;英雄联盟&quot;; choice of {&#39;英雄联盟&#39;, &#39;绝地求生&#39;, &#39;王者荣耀&#39;, &#39;DOTA2&#39;, &#39;穿越火线&#39;, &#39;和平精英&#39;}
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
