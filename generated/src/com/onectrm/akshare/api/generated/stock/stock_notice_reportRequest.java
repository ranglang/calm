
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_notice_report
    * 目标地址: http://data.eastmoney.com/notices/hsa/5.html
    * 描述: 东方财富网-数据中心-公告大全-沪深 A 股公告
    * 限量: 单次获取指定 symbol 和 date 的数据
    */
    public class stock_notice_reportRequest extends AkShareRequestAndResponse {
    public stock_notice_reportRequest(){
    setInterfaceName("stock_notice_report");
    }

    public static String name() {
        return "stock_notice_report";
    }
    public String getName() {
    return "stock_notice_report";
    }

    public static stock_notice_reportRequest of(


    String p_symbol,

    String p_date,


    Map.Entry
    <String
    , String>... others){
    stock_notice_reportRequest t = new stock_notice_reportRequest();


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
    * desc: symbol=&#39;财务报告&#39;; choice of {&quot;全部&quot;, &quot;重大事项&quot;, &quot;财务报告&quot;, &quot;融资公告&quot;, &quot;风险提示&quot;, &quot;资产重组&quot;, &quot;信息变更&quot;, &quot;持股变动&quot;}
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: date
    * type: str
    * desc: date=&quot;20220511&quot;; 指定日期
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
