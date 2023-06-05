
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_sina_lhb_detail_daily
    * 目标地址: http://vip.stock.finance.sina.com.cn/q/go.php/vInvestConsult/kind/lhb/index.phtml
    * 描述: 新浪财经-龙虎榜-每日详情
    * 限量: 单次返回指定 trade_date 和 symbol 的所有历史数据
    */
    public class stock_sina_lhb_detail_dailyRequest extends AkShareRequestAndResponse {
    public stock_sina_lhb_detail_dailyRequest(){
    setInterfaceName("stock_sina_lhb_detail_daily");
    }

    public static String name() {
        return "stock_sina_lhb_detail_daily";
    }
    public String getName() {
    return "stock_sina_lhb_detail_daily";
    }

    public static stock_sina_lhb_detail_dailyRequest of(


    String p_tradedate,

    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    stock_sina_lhb_detail_dailyRequest t = new stock_sina_lhb_detail_dailyRequest();


    t.p_tradedate = p_tradedate;
    t.other.put("trade_date", p_tradedate.toString());

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
    * name: trade_date
    * type: str
    * desc: trade_date=&quot;20200730&quot;; 交易日
    * required: 
    */
    private String p_tradedate;

    public String getP_tradedate() { return this.p_tradedate;}
    public void setP_tradedate(String v) { this.p_tradedate = v;}

    /**
    * name: symbol
    * type: str
    * desc: symbol=&quot;涨幅偏离值达7%的证券&quot;; 调用**ak.stock_sina_lhb_detail_daily(trade_date=&quot;指定交易日&quot;, symbol=&quot;返回当前交易日所有可查询的指标&quot;)**返回可以获取的指标
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
