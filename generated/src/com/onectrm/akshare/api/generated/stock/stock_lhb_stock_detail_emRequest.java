
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_lhb_stock_detail_em
    * 目标地址: https://data.eastmoney.com/stock/lhb/600077.html
    * 描述: 东方财富网-数据中心-龙虎榜单-个股龙虎榜详情
    * 限量: 单次返回所有历史数据
    */
    public class stock_lhb_stock_detail_emRequest extends AkShareRequestAndResponse {
    public stock_lhb_stock_detail_emRequest(){
    setInterfaceName("stock_lhb_stock_detail_em");
    }

    public static String name() {
        return "stock_lhb_stock_detail_em";
    }
    public String getName() {
    return "stock_lhb_stock_detail_em";
    }

    public static stock_lhb_stock_detail_emRequest of(


    String p_symbol,

    String p_date,

    String p_flag,


    Map.Entry
    <String
    , String>... others){
    stock_lhb_stock_detail_emRequest t = new stock_lhb_stock_detail_emRequest();


    t.p_symbol = p_symbol;
    t.other.put("symbol", p_symbol.toString());

    t.p_date = p_date;
    t.other.put("date", p_date.toString());

    t.p_flag = p_flag;
    t.other.put("flag", p_flag.toString());


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
    * desc: symbol=&quot;600077&quot;;
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: date
    * type: str
    * desc: date=&quot;20220310&quot;; 需要通过 ak.stock_lhb_stock_detail_date_em(symbol=&quot;600077&quot;) 接口获取相应股票的有龙虎榜详情数据的日期
    * required: 
    */
    private String p_date;

    public String getP_date() { return this.p_date;}
    public void setP_date(String v) { this.p_date = v;}

    /**
    * name: flag
    * type: str
    * desc: flag=&quot;卖出&quot;;  choice of {&quot;买入&quot;, &quot;卖出&quot;}
    * required: 
    */
    private String p_flag;

    public String getP_flag() { return this.p_flag;}
    public void setP_flag(String v) { this.p_flag = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
