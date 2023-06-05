
    package com.onectrm.akshare.api.generated.fund_public;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fund_public
    * 接口: fund_etf_category_sina
    * 目标地址: http://vip.stock.finance.sina.com.cn/fund_center/index.html#jjhqetf
    * 描述: 新浪财经-基金列表及行情数据
    * 限量: 单次返回指定 symbol 基金的所有数据
    */
    public class fund_etf_category_sinaRequest extends AkShareRequestAndResponse {
    public fund_etf_category_sinaRequest(){
    setInterfaceName("fund_etf_category_sina");
    }

    public static String name() {
        return "fund_etf_category_sina";
    }
    public String getName() {
    return "fund_etf_category_sina";
    }

    public static fund_etf_category_sinaRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    fund_etf_category_sinaRequest t = new fund_etf_category_sinaRequest();


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
    * desc: symbol=&quot;LOF基金&quot;; choice of {&quot;封闭式基金&quot;, &quot;ETF基金&quot;, &quot;LOF基金&quot;}
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
