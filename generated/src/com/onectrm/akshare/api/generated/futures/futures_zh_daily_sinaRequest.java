
    package com.onectrm.akshare.api.generated.futures;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: futures
    * 接口: futures_zh_daily_sina
    * 目标地址: https://finance.sina.com.cn/futures/quotes/V2105.shtml
    * 描述: 新浪财经-期货-日频数据
    * 限量: 单次返回指定 symbol 的所有日频数据
    */
    public class futures_zh_daily_sinaRequest extends AkShareRequestAndResponse {
    public futures_zh_daily_sinaRequest(){
    setInterfaceName("futures_zh_daily_sina");
    }

    public static String name() {
        return "futures_zh_daily_sina";
    }
    public String getName() {
    return "futures_zh_daily_sina";
    }

    public static futures_zh_daily_sinaRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    futures_zh_daily_sinaRequest t = new futures_zh_daily_sinaRequest();


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
    * desc: symbol=&quot;V2105&quot;; 具体合约可以通过 ak.match_main_contract(symbol=&quot;shfe&quot;) 获取或者访问网页
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
