
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_report_fund_hold
    * 目标地址: http://data.eastmoney.com/zlsj/2020-06-30-1-2.html
    * 描述: 东方财富网-数据中心-主力数据-基金持仓
    * 限量: 单次返回指定 symbol 和 date 的所有历史数据
    */
    public class stock_report_fund_holdRequest extends AkShareRequestAndResponse {
    public stock_report_fund_holdRequest(){
    setInterfaceName("stock_report_fund_hold");
    }

    public static String name() {
        return "stock_report_fund_hold";
    }
    public String getName() {
    return "stock_report_fund_hold";
    }

    public static stock_report_fund_holdRequest of(


    String p_symbol,

    String p_date,


    Map.Entry
    <String
    , String>... others){
    stock_report_fund_holdRequest t = new stock_report_fund_holdRequest();


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
    * desc: symbol=&quot;基金持仓&quot;; choice of {&quot;基金持仓&quot;, &quot;QFII持仓&quot;, &quot;社保持仓&quot;, &quot;券商持仓&quot;, &quot;保险持仓&quot;, &quot;信托持仓&quot;}
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: date
    * type: str
    * desc: date=&quot;20200630&quot;; 财报发布日期, xxxx-03-31, xxxx-06-30, xxxx-09-30, xxxx-12-31
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
