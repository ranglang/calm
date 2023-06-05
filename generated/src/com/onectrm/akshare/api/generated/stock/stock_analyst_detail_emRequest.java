
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_analyst_detail_em
    * 目标地址: https://data.eastmoney.com/invest/invest/11000257131.html
    * 描述: 东方财富网-数据中心-研究报告-东方财富分析师指数-分析师详情
    * 限量: 单次获取指定 indicator 指定的数据
    */
    public class stock_analyst_detail_emRequest extends AkShareRequestAndResponse {
    public stock_analyst_detail_emRequest(){
    setInterfaceName("stock_analyst_detail_em");
    }

    public static String name() {
        return "stock_analyst_detail_em";
    }
    public String getName() {
    return "stock_analyst_detail_em";
    }

    public static stock_analyst_detail_emRequest of(


    String p_analystid,

    String p_indicator,


    Map.Entry
    <String
    , String>... others){
    stock_analyst_detail_emRequest t = new stock_analyst_detail_emRequest();


    t.p_analystid = p_analystid;
    t.other.put("analyst_id", p_analystid.toString());

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
    * name: analyst_id
    * type: str
    * desc: analyst_id=&quot;11000257131&quot;; 分析师ID, 从 ak.stock_analyst_rank_em() 获取
    * required: 
    */
    private String p_analystid;

    public String getP_analystid() { return this.p_analystid;}
    public void setP_analystid(String v) { this.p_analystid = v;}

    /**
    * name: indicator
    * type: str
    * desc: indicator=&quot;最新跟踪成分股&quot;; 从 {&quot;最新跟踪成分股&quot;, &quot;历史跟踪成分股&quot;, &quot;历史指数&quot;} 中选择一个
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
