
    package com.onectrm.akshare.api.generated.fund_public;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fund_public
    * 接口: fund_report_industry_allocation_cninfo
    * 目标地址: http://webapi.cninfo.com.cn/#/thematicStatistics
    * 描述: 巨潮资讯-数据中心-专题统计-基金报表-基金行业配置
    * 限量: 返回指定 date 的所有数据; date 从 2017 年开始
    */
    public class fund_report_industry_allocation_cninfoRequest extends AkShareRequestAndResponse {
    public fund_report_industry_allocation_cninfoRequest(){
    setInterfaceName("fund_report_industry_allocation_cninfo");
    }

    public static String name() {
        return "fund_report_industry_allocation_cninfo";
    }
    public String getName() {
    return "fund_report_industry_allocation_cninfo";
    }

    public static fund_report_industry_allocation_cninfoRequest of(


    String p_date,


    Map.Entry
    <String
    , String>... others){
    fund_report_industry_allocation_cninfoRequest t = new fund_report_industry_allocation_cninfoRequest();


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
    * name: date
    * type: str
    * desc: date=&quot;20210630&quot;; choice of {&quot;XXXX0331&quot;, &quot;XXXX0630&quot;, &quot;XXXX0930&quot;, &quot;XXXX1231&quot;}, 其中 XXXX 为年份
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
