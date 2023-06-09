
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_sector_fund_flow_rank
    * 目标地址: http://data.eastmoney.com/bkzj/hy.html
    * 描述: 东方财富网-数据中心-资金流向-板块资金流-排名
    * 限量: 单次获取指定板块的指定期限的资金流排名数据
    */
    public class stock_sector_fund_flow_rankRequest extends AkShareRequestAndResponse {
    public stock_sector_fund_flow_rankRequest(){
    setInterfaceName("stock_sector_fund_flow_rank");
    }

    public static String name() {
        return "stock_sector_fund_flow_rank";
    }
    public String getName() {
    return "stock_sector_fund_flow_rank";
    }

    public static stock_sector_fund_flow_rankRequest of(


    String p_indicator,

    String p_sectortype,


    Map.Entry
    <String
    , String>... others){
    stock_sector_fund_flow_rankRequest t = new stock_sector_fund_flow_rankRequest();


    t.p_indicator = p_indicator;
    t.other.put("indicator", p_indicator.toString());

    t.p_sectortype = p_sectortype;
    t.other.put("sector_type", p_sectortype.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: indicator
    * type: str
    * desc: indicator=&quot;5日&quot;; choice of {&quot;今日&quot;, &quot;5日&quot;, &quot;10日&quot;}
    * required: Y
    */
    private String p_indicator;

    public String getP_indicator() { return this.p_indicator;}
    public void setP_indicator(String v) { this.p_indicator = v;}

    /**
    * name: sector_type
    * type: str
    * desc: sector_type=&quot;地域资金流&quot;; choice of {&quot;行业资金流&quot;: &quot;2&quot;, &quot;概念资金流&quot;: &quot;3&quot;, &quot;地域资金流&quot;: &quot;1&quot;}
    * required: Y
    */
    private String p_sectortype;

    public String getP_sectortype() { return this.p_sectortype;}
    public void setP_sectortype(String v) { this.p_sectortype = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
