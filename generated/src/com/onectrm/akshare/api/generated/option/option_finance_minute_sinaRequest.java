
    package com.onectrm.akshare.api.generated.option;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: option
    * 接口: option_finance_minute_sina
    * 目标地址: https://stock.finance.sina.com.cn/option/quotes.html
    * 描述: 新浪财经-股票期权分时行情数据
    * 限量: 单次返回指定期权的分时行情数据
    */
    public class option_finance_minute_sinaRequest extends AkShareRequestAndResponse {
    public option_finance_minute_sinaRequest(){
    setInterfaceName("option_finance_minute_sina");
    }

    public static String name() {
        return "option_finance_minute_sina";
    }
    public String getName() {
    return "option_finance_minute_sina";
    }

    public static option_finance_minute_sinaRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    option_finance_minute_sinaRequest t = new option_finance_minute_sinaRequest();


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
    * desc: symbol=&quot;10002530&quot;; 通过 **ak.option_sse_codes_sina()** 获取
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
