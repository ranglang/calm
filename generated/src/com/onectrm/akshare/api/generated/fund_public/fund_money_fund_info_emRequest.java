
    package com.onectrm.akshare.api.generated.fund_public;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fund_public
    * 接口: fund_money_fund_info_em
    * 目标地址: http://fundf10.eastmoney.com/jjjz_004186.html
    * 描述: 东方财富网-天天基金网-基金数据-货币型基金-历史净值
    * 限量: 单次返回当前时刻所有历史数据
    */
    public class fund_money_fund_info_emRequest extends AkShareRequestAndResponse {
    public fund_money_fund_info_emRequest(){
    setInterfaceName("fund_money_fund_info_em");
    }

    public static String name() {
        return "fund_money_fund_info_em";
    }
    public String getName() {
    return "fund_money_fund_info_em";
    }

    public static fund_money_fund_info_emRequest of(


    String p_fund,


    Map.Entry
    <String
    , String>... others){
    fund_money_fund_info_emRequest t = new fund_money_fund_info_emRequest();


    t.p_fund = p_fund;
    t.other.put("fund", p_fund.toString());


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
    * desc: fund=&quot;000009&quot;; 需要基金代码, 可以通过调用 **ak.fund_money_fund_daily_em()** 获取
    * required: 
    */
    private String p_fund;

    public String getP_fund() { return this.p_fund;}
    public void setP_fund(String v) { this.p_fund = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
