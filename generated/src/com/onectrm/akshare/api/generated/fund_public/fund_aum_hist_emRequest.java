
    package com.onectrm.akshare.api.generated.fund_public;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fund_public
    * 接口: fund_aum_hist_em
    * 目标地址: http://fund.eastmoney.com/Company/lsgm.html
    * 描述: 天天基金网-基金数据-基金公司历年管理规模排行列表
    * 限量: 单次返回所有基金公司历年管理规模排行列表数据
    */
    public class fund_aum_hist_emRequest extends AkShareRequestAndResponse {
    public fund_aum_hist_emRequest(){
    setInterfaceName("fund_aum_hist_em");
    }

    public static String name() {
        return "fund_aum_hist_em";
    }
    public String getName() {
    return "fund_aum_hist_em";
    }

    public static fund_aum_hist_emRequest of(


    String p_year,


    Map.Entry
    <String
    , String>... others){
    fund_aum_hist_emRequest t = new fund_aum_hist_emRequest();


    t.p_year = p_year;
    t.other.put("year", p_year.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: year
    * type: str
    * desc: year=&quot;2019&quot;; 从 2001 年开始
    * required: 
    */
    private String p_year;

    public String getP_year() { return this.p_year;}
    public void setP_year(String v) { this.p_year = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
