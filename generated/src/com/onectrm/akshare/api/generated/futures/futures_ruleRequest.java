
    package com.onectrm.akshare.api.generated.futures;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: futures
    * 接口: futures_rule
    * 目标地址: https://www.gtjaqh.com/pc/calendar.html
    * 描述: 国泰君安期货-交易日历数据表
    * 限量: 单次返回指定交易日所有合约的交易日历数据
    */
    public class futures_ruleRequest extends AkShareRequestAndResponse {
    public futures_ruleRequest(){
    setInterfaceName("futures_rule");
    }

    public static String name() {
        return "futures_rule";
    }
    public String getName() {
    return "futures_rule";
    }

    public static futures_ruleRequest of(


    String p_date,


    Map.Entry
    <String
    , String>... others){
    futures_ruleRequest t = new futures_ruleRequest();


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
    * name: date
    * type: str
    * desc: date=&quot;20220106&quot;; 需要指定为交易日, 且是近期的日期
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
