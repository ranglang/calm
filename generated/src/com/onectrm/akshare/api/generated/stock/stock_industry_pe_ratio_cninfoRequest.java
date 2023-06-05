
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_industry_pe_ratio_cninfo
    * 目标地址: http://webapi.cninfo.com.cn/#/thematicStatistics
    * 描述: 巨潮资讯-数据中心-行业分析-行业市盈率
    * 限量: 单次获取指定行业在指定交易日的所有数据
    */
    public class stock_industry_pe_ratio_cninfoRequest extends AkShareRequestAndResponse {
    public stock_industry_pe_ratio_cninfoRequest(){
    setInterfaceName("stock_industry_pe_ratio_cninfo");
    }

    public static String name() {
        return "stock_industry_pe_ratio_cninfo";
    }
    public String getName() {
    return "stock_industry_pe_ratio_cninfo";
    }

    public static stock_industry_pe_ratio_cninfoRequest of(


    String p_symbol,

    String p_date,


    Map.Entry
    <String
    , String>... others){
    stock_industry_pe_ratio_cninfoRequest t = new stock_industry_pe_ratio_cninfoRequest();


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
    * desc: symbol=&quot;证监会行业分类&quot;; choice of {&quot;证监会行业分类&quot;, &quot;国证行业分类&quot;}
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: date
    * type: str
    * desc: date=&quot;20210910&quot;; 交易日
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
