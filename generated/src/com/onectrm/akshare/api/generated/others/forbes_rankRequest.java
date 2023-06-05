
    package com.onectrm.akshare.api.generated.others;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: others
    * 接口: forbes_rank
    * 目标地址: https://www.forbeschina.com/lists
    * 描述: 福布斯中国-榜单数据, 一共 87 个指标的数据可以获取
    * 限量: 单次返回指定 symbol 的数据
    */
    public class forbes_rankRequest extends AkShareRequestAndResponse {
    public forbes_rankRequest(){
    setInterfaceName("forbes_rank");
    }

    public static String name() {
        return "forbes_rank";
    }
    public String getName() {
    return "forbes_rank";
    }

    public static forbes_rankRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    forbes_rankRequest t = new forbes_rankRequest();


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
    * desc: symbol=&quot;2020年福布斯中国400富豪榜&quot;; 参考 **福布斯中国指标一览表**, 也可以访问 https://www.forbeschina.com/lists 获取所需要的 symbol
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
