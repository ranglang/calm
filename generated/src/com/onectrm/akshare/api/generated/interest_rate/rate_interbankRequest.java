
    package com.onectrm.akshare.api.generated.interest_rate;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: interest_rate
    * 接口: rate_interbank
    * 目标地址: http://data.eastmoney.com/shibor/shibor.aspx?m=sg&amp;t=88&amp;d=99333&amp;cu=sgd&amp;type=009065&amp;p=79
    * 描述: 东方财富-拆借利率一览-具体市场的具体品种的具体指标的拆借利率数据
    * 限量: 返回所有历史数据
    */
    public class rate_interbankRequest extends AkShareRequestAndResponse {
    public rate_interbankRequest(){
    setInterfaceName("rate_interbank");
    }

    public static String name() {
        return "rate_interbank";
    }
    public String getName() {
    return "rate_interbank";
    }

    public static rate_interbankRequest of(


    String p_market,

    String p_symbol,

    String p_indicator,


    Map.Entry
    <String
    , String>... others){
    rate_interbankRequest t = new rate_interbankRequest();


    t.p_market = p_market;
    t.other.put("market", p_market.toString());

    t.p_symbol = p_symbol;
    t.other.put("symbol", p_symbol.toString());

    t.p_indicator = p_indicator;
    t.other.put("indicator", p_indicator.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: market
    * type: str
    * desc: market=&quot;上海银行同业拆借市场&quot;; 参见 **市场-品种-指标一览表**
    * required: 
    */
    private String p_market;

    public String getP_market() { return this.p_market;}
    public void setP_market(String v) { this.p_market = v;}

    /**
    * name: symbol
    * type: str
    * desc: symbol=&quot;Shibor人民币&quot;; 参见 **市场-品种-指标一览表**
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: indicator
    * type: str
    * desc: indicator=&quot;隔夜&quot;; 参见 **市场-品种-指标一览表**
    * required: 
    */
    private String p_indicator;

    public String getP_indicator() { return this.p_indicator;}
    public void setP_indicator(String v) { this.p_indicator = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
