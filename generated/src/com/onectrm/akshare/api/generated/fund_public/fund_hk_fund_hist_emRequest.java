
    package com.onectrm.akshare.api.generated.fund_public;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fund_public
    * 接口: fund_hk_fund_hist_em
    * 目标地址: http://overseas.1234567.com.cn/f10/FundJz/968092#FHPS
    * 描述: 东方财富网站-天天基金网-基金数据-香港基金-历史净值明细
    * 限量: 单次返回指定 code 和 symbol 所有历史数据
    */
    public class fund_hk_fund_hist_emRequest extends AkShareRequestAndResponse {
    public fund_hk_fund_hist_emRequest(){
    setInterfaceName("fund_hk_fund_hist_em");
    }

    public static String name() {
        return "fund_hk_fund_hist_em";
    }
    public String getName() {
    return "fund_hk_fund_hist_em";
    }

    public static fund_hk_fund_hist_emRequest of(


    String p_code,

    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    fund_hk_fund_hist_emRequest t = new fund_hk_fund_hist_emRequest();


    t.p_code = p_code;
    t.other.put("code", p_code.toString());

    t.p_symbol = p_symbol;
    t.other.put("symbol", p_symbol.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: code
    * type: str
    * desc: code=&quot;1002200683&quot;; 需要香港基金代码, 可以通过调用 **fund_em_hk_rank** 获取
    * required: 
    */
    private String p_code;

    public String getP_code() { return this.p_code;}
    public void setP_code(String v) { this.p_code = v;}

    /**
    * name: symbol
    * type: str
    * desc: symbol=&quot;历史净值明细&quot;; choice of {&quot;历史净值明细&quot;, &quot;分红送配详情&quot;}
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
