
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_szse_sector_summary
    * 目标地址: http://docs.static.szse.cn/www/market/periodical/month/W020220511355248518608.html
    * 描述: 深圳证券交易所-统计资料-股票行业成交
    * 限量: 单次返回指定 date 和 symbol 的统计资料-股票行业成交数据
    */
    public class stock_szse_sector_summaryRequest extends AkShareRequestAndResponse {
    public stock_szse_sector_summaryRequest(){
    setInterfaceName("stock_szse_sector_summary");
    }

    public static String name() {
        return "stock_szse_sector_summary";
    }
    public String getName() {
    return "stock_szse_sector_summary";
    }

    public static stock_szse_sector_summaryRequest of(


    String p_symbol,

    String p_date,


    Map.Entry
    <String
    , String>... others){
    stock_szse_sector_summaryRequest t = new stock_szse_sector_summaryRequest();


    t.p_symbol = p_symbol;
    t.other.put("symbol", p_symbol.toString());

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
    * name: symbol
    * type: str
    * desc: symbol=&quot;当月&quot;; choice of {&quot;当月&quot;, &quot;当年&quot;}
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: date
    * type: str
    * desc: date=&quot;202203&quot;; 年月
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
