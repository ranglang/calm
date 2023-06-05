
    package com.onectrm.akshare.api.generated.dc;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: dc
    * 接口: crypto_crix
    * 目标地址: https://thecrix.de/
    * 描述: 获取加密货币全球市场指数
    * 限量: 单次返回指定 symbol 的历史数据
    */
    public class crypto_crixRequest extends AkShareRequestAndResponse {
    public crypto_crixRequest(){
    setInterfaceName("crypto_crix");
    }

    public static String name() {
        return "crypto_crix";
    }
    public String getName() {
    return "crypto_crix";
    }

    public static crypto_crixRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    crypto_crixRequest t = new crypto_crixRequest();


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
    * desc: symbol=&quot;CRIX&quot;; choice of {&quot;CRIX&quot;, &quot;VCRIX&quot;}
    * required: Y
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
