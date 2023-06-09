
    package com.onectrm.akshare.api.generated.option;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: option
    * 接口: option_cffex_hs300_daily_sina
    * 目标地址: https://stock.finance.sina.com.cn/futures/view/optionsCffexDP.php
    * 描述: 中金所-沪深300指数-指定合约-日频行情
    * 限量: 单次返回指定合约的日频行情
    */
    public class option_cffex_hs300_daily_sinaRequest extends AkShareRequestAndResponse {
    public option_cffex_hs300_daily_sinaRequest(){
    setInterfaceName("option_cffex_hs300_daily_sina");
    }

    public static String name() {
        return "option_cffex_hs300_daily_sina";
    }
    public String getName() {
    return "option_cffex_hs300_daily_sina";
    }

    public static option_cffex_hs300_daily_sinaRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    option_cffex_hs300_daily_sinaRequest t = new option_cffex_hs300_daily_sinaRequest();


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
    * desc: symbol=&quot;io2202P4350&quot;; 具体合约代码(包括看涨和看跌标识), 可以通过 ak.option_cffex_hs300_spot_sina 中的 call-标识 获取
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
