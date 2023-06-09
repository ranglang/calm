
    package com.onectrm.akshare.api.generated.energy;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: energy
    * 接口: energy_carbon_domestic
    * 目标地址: http://www.tanjiaoyi.com/
    * 描述: 碳交易网-行情信息
    * 限量: 返回指定 symbol 的所有历史数据
    */
    public class energy_carbon_domesticRequest extends AkShareRequestAndResponse {
    public energy_carbon_domesticRequest(){
    setInterfaceName("energy_carbon_domestic");
    }

    public static String name() {
        return "energy_carbon_domestic";
    }
    public String getName() {
    return "energy_carbon_domestic";
    }

    public static energy_carbon_domesticRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    energy_carbon_domesticRequest t = new energy_carbon_domesticRequest();


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
    * desc: symbol=&quot;湖北&quot;; choice of {&#39;湖北&#39;, &#39;上海&#39;, &#39;北京&#39;, &#39;重庆&#39;, &#39;广东&#39;, &#39;天津&#39;, &#39;深圳&#39;, &#39;福建&#39;}
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
