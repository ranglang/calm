
    package com.onectrm.akshare.api.generated.fx;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fx
    * 接口: currency_pair_map
    * 目标地址: https://cn.investing.com/currencies/cny-jmd
    * 描述: 获取指定币种的所有能够获取到的货币对信息，历史数据可以调用 **currency_history** 获取
    * 限量: 单次返回指定币种的所有能获取数据的货币对
    */
    public class currency_pair_mapRequest extends AkShareRequestAndResponse {
    public currency_pair_mapRequest(){
    setInterfaceName("currency_pair_map");
    }

    public static String name() {
        return "currency_pair_map";
    }
    public String getName() {
    return "currency_pair_map";
    }

    public static currency_pair_mapRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    currency_pair_mapRequest t = new currency_pair_mapRequest();


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
    * desc: symbol=&quot;人民币&quot;; 此处提供中文的币种名称, 可以访问[网页](https://cn.investing.com/currencies/cny-jmd) 的页面下方查看
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
