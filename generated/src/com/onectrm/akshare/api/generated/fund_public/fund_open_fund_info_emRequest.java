
    package com.onectrm.akshare.api.generated.fund_public;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fund_public
    * 接口: fund_open_fund_info_em
    * 目标地址: http://fund.eastmoney.com/pingzhongdata/710001.js
    * 描述: 东方财富网-天天基金网-基金数据-具体基金信息
    * 限量: 单次返回当前时刻所有历史数据, 在查询基金数据的时候注意基金前后端问题
    */
    public class fund_open_fund_info_emRequest extends AkShareRequestAndResponse {
    public fund_open_fund_info_emRequest(){
    setInterfaceName("fund_open_fund_info_em");
    }

    public static String name() {
        return "fund_open_fund_info_em";
    }
    public String getName() {
    return "fund_open_fund_info_em";
    }

    public static fund_open_fund_info_emRequest of(


    String p_fund,

    String p_indicator,


    Map.Entry
    <String
    , String>... others){
    fund_open_fund_info_emRequest t = new fund_open_fund_info_emRequest();


    t.p_fund = p_fund;
    t.other.put("fund", p_fund.toString());

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
    * name: fund
    * type: str
    * desc: fund=&quot;710001&quot;; 需要基金代码, 可以通过调用 **fund_open_fund_daily_em** 获取
    * required: 
    */
    private String p_fund;

    public String getP_fund() { return this.p_fund;}
    public void setP_fund(String v) { this.p_fund = v;}

    /**
    * name: indicator
    * type: str
    * desc: indicator=&quot;单位净值走势&quot;;  参见 **fund_open_fund_info_em** 参数一览表
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
