
    package com.onectrm.akshare.api.generated.fund_public;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fund_public
    * 接口: fund_scale_open_sina
    * 目标地址: http://vip.stock.finance.sina.com.cn/fund_center/index.html#jjhqetf
    * 描述: 基金数据中心-基金规模-开放式基金
    * 限量: 单次返回指定 symbol 的基金规模数据
    */
    public class fund_scale_open_sinaRequest extends AkShareRequestAndResponse {
    public fund_scale_open_sinaRequest(){
    setInterfaceName("fund_scale_open_sina");
    }

    public static String name() {
        return "fund_scale_open_sina";
    }
    public String getName() {
    return "fund_scale_open_sina";
    }

    public static fund_scale_open_sinaRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    fund_scale_open_sinaRequest t = new fund_scale_open_sinaRequest();


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
    * desc: symbol=&quot;股票型基金&quot;; choice of {&quot;股票型基金&quot;, &quot;混合型基金&quot;, &quot;债券型基金&quot;, &quot;货币型基金&quot;, &quot;QDII基金&quot;}
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
