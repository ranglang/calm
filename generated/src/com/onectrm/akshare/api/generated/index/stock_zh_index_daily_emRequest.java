
    package com.onectrm.akshare.api.generated.index;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: index
    * 接口: stock_zh_index_daily_em
    * 目标地址: http://quote.eastmoney.com/center/hszs.html
    * 描述: 东方财富股票指数数据, 历史数据按日频率更新
    * 限量: 单次返回具体指数的所有历史行情数据
    */
    public class stock_zh_index_daily_emRequest extends AkShareRequestAndResponse {
    public stock_zh_index_daily_emRequest(){
    setInterfaceName("stock_zh_index_daily_em");
    }

    public static String name() {
        return "stock_zh_index_daily_em";
    }
    public String getName() {
    return "stock_zh_index_daily_em";
    }

    public static stock_zh_index_daily_emRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    stock_zh_index_daily_emRequest t = new stock_zh_index_daily_emRequest();


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
    * desc: symbol=&quot;sz399552&quot;
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
