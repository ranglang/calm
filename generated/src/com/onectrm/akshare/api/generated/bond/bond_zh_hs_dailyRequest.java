
    package com.onectrm.akshare.api.generated.bond;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: bond
    * 接口: bond_zh_hs_daily
    * 目标地址: http://money.finance.sina.com.cn/bond/quotes/sh019315.html(示例)
    * 描述: 新浪财经-债券-沪深债券-历史行情数据, 历史数据按日频率更新
    * 限量: 单次返回具体某个沪深转债的所有历史行情数据
    */
    public class bond_zh_hs_dailyRequest extends AkShareRequestAndResponse {
    public bond_zh_hs_dailyRequest(){
    setInterfaceName("bond_zh_hs_daily");
    }

    public static String name() {
        return "bond_zh_hs_daily";
    }
    public String getName() {
    return "bond_zh_hs_daily";
    }

    public static bond_zh_hs_dailyRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    bond_zh_hs_dailyRequest t = new bond_zh_hs_dailyRequest();


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
    * name: symbol
    * type: str
    * desc: symbol=&quot;sh010107&quot;
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
