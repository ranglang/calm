
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_hot_rank_latest_em
    * 目标地址: http://guba.eastmoney.com/rank/stock?code=000665
    * 描述: 东方财富-个股人气榜-最新排名
    * 限量: 单次返回指定 symbol 的股票近期历史数据
    */
    public class stock_hot_rank_latest_emRequest extends AkShareRequestAndResponse {
    public stock_hot_rank_latest_emRequest(){
    setInterfaceName("stock_hot_rank_latest_em");
    }

    public static String name() {
        return "stock_hot_rank_latest_em";
    }
    public String getName() {
    return "stock_hot_rank_latest_em";
    }

    public static stock_hot_rank_latest_emRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    stock_hot_rank_latest_emRequest t = new stock_hot_rank_latest_emRequest();


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
    * desc: symbol=&quot;SZ000665&quot;
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
