
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_report_fund_hold_detail
    * 目标地址: http://data.eastmoney.com/zlsj/ccjj/2020-12-31-008286.html
    * 描述: 东方财富网-数据中心-主力数据-基金持仓-基金持仓明细表
    * 限量: 单次返回指定 symbol 和 date 的所有历史数据
    */
    public class stock_report_fund_hold_detailRequest extends AkShareRequestAndResponse {
    public stock_report_fund_hold_detailRequest(){
    setInterfaceName("stock_report_fund_hold_detail");
    }

    public static String name() {
        return "stock_report_fund_hold_detail";
    }
    public String getName() {
    return "stock_report_fund_hold_detail";
    }

    public static stock_report_fund_hold_detailRequest of(


    String p_symbol,

    String p_date,


    Map.Entry
    <String
    , String>... others){
    stock_report_fund_hold_detailRequest t = new stock_report_fund_hold_detailRequest();


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
    * desc: symbol=&quot;005827&quot;; 基金代码
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
