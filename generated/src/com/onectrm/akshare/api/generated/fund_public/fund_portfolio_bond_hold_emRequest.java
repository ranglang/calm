
    package com.onectrm.akshare.api.generated.fund_public;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fund_public
    * 接口: fund_portfolio_bond_hold_em
    * 目标地址: http://fundf10.eastmoney.com/ccmx_000001.html
    * 描述: 天天基金网-基金档案-投资组合-债券持仓
    * 限量: 单次返回指定 symbol 和 date 的所有持仓数据
    */
    public class fund_portfolio_bond_hold_emRequest extends AkShareRequestAndResponse {
    public fund_portfolio_bond_hold_emRequest(){
    setInterfaceName("fund_portfolio_bond_hold_em");
    }

    public static String name() {
        return "fund_portfolio_bond_hold_em";
    }
    public String getName() {
    return "fund_portfolio_bond_hold_em";
    }

    public static fund_portfolio_bond_hold_emRequest of(


    String p_symbol,

    String p_date,


    Map.Entry
    <String
    , String>... others){
    fund_portfolio_bond_hold_emRequest t = new fund_portfolio_bond_hold_emRequest();


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
    * desc: symbol=&quot;000001&quot;; 基金代码, 可以通过调用 **ak.fund_name_em()** 接口获取
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: date
    * type: str
    * desc: date=&quot;2021&quot;; 指定年份
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
