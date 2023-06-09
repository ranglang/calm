
    package com.onectrm.akshare.api.generated.futures;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: futures
    * 接口: futures_zh_minute_sina
    * 目标地址: http://vip.stock.finance.sina.com.cn/quotes_service/view/qihuohangqing.html#titlePos_3
    * 描述: 新浪财经-期货-分时数据
    * 限量: 单次返回指定 symbol 和 period 的分时数据
    */
    public class futures_zh_minute_sinaRequest extends AkShareRequestAndResponse {
    public futures_zh_minute_sinaRequest(){
    setInterfaceName("futures_zh_minute_sina");
    }

    public static String name() {
        return "futures_zh_minute_sina";
    }
    public String getName() {
    return "futures_zh_minute_sina";
    }

    public static futures_zh_minute_sinaRequest of(


    String p_symbol,

    String p_period,


    Map.Entry
    <String
    , String>... others){
    futures_zh_minute_sinaRequest t = new futures_zh_minute_sinaRequest();


    t.p_symbol = p_symbol;
    t.other.put("symbol", p_symbol.toString());

    t.p_period = p_period;
    t.other.put("period", p_period.toString());


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
    * desc: symbol=&quot;IF2008&quot;; 具体合约(期货品种符号需要大写), 可以通过调用 ak.match_main_contract(symbol=&quot;cffex&quot;) 接口获取, 或者访问网页获取
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: period
    * type: str
    * desc: period=&quot;1&quot;; choice of {&quot;1&quot;: &quot;1分钟&quot;, &quot;5&quot;: &quot;5分钟&quot;, &quot;15&quot;: &quot;15分钟&quot;, &quot;30&quot;: &quot;30分钟&quot;, &quot;60&quot;: &quot;60分钟&quot;}
    * required: 
    */
    private String p_period;

    public String getP_period() { return this.p_period;}
    public void setP_period(String v) { this.p_period = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
