
    package com.onectrm.akshare.api.generated.futures;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: futures
    * 接口: futures_pig_rank
    * 目标地址: https://zhujia.zhuwang.cc/lists.shtml
    * 描述: 养猪数据中心-生猪价格排行
    * 限量: 单次返回指定 symbol 的所有当日数据
    */
    public class futures_pig_rankRequest extends AkShareRequestAndResponse {
    public futures_pig_rankRequest(){
    setInterfaceName("futures_pig_rank");
    }

    public static String name() {
        return "futures_pig_rank";
    }
    public String getName() {
    return "futures_pig_rank";
    }

    public static futures_pig_rankRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    futures_pig_rankRequest t = new futures_pig_rankRequest();


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
    * desc: symbol=&quot;外三元&quot;; choice of {&quot;外三元&quot;, &quot;内三元&quot;, &quot;土杂猪&quot;, &quot;玉米&quot;, &quot;豆粕&quot;}
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
