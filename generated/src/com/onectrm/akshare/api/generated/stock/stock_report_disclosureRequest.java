
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_report_disclosure
    * 目标地址: http://www.cninfo.com.cn/new/commonUrl?url=data/yypl
    * 描述: 巨潮资讯-数据-预约披露的数据
    * 限量: 单次获取指定 market 和 period 的预约披露数据
    */
    public class stock_report_disclosureRequest extends AkShareRequestAndResponse {
    public stock_report_disclosureRequest(){
    setInterfaceName("stock_report_disclosure");
    }

    public static String name() {
        return "stock_report_disclosure";
    }
    public String getName() {
    return "stock_report_disclosure";
    }

    public static stock_report_disclosureRequest of(


    String p_market,

    String p_period,


    Map.Entry
    <String
    , String>... others){
    stock_report_disclosureRequest t = new stock_report_disclosureRequest();


    t.p_market = p_market;
    t.other.put("market", p_market.toString());

    t.p_period = p_period;
    t.other.put("period", p_period.toString());


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
    * desc: market=&quot;沪深京&quot;; choice of {&quot;沪深京&quot;, &quot;深市&quot;, &quot;深主板&quot;, &quot;创业板&quot;, &quot;沪市&quot;, &quot;沪主板&quot;, &quot;科创板&quot;, &quot;北交所&quot;}
    * required: 
    */
    private String p_market;

    public String getP_market() { return this.p_market;}
    public void setP_market(String v) { this.p_market = v;}

    /**
    * name: period
    * type: str
    * desc: period=&quot;2021年报&quot;; 近四期的财务报告; e.g., choice of {&quot;2021一季&quot;, &quot;2021半年报&quot;, &quot;2021三季&quot;, &quot;2021年报&quot;}
    * required: 
    */
    private String p_period;

    public String getP_period() { return this.p_period;}
    public void setP_period(String v) { this.p_period = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
