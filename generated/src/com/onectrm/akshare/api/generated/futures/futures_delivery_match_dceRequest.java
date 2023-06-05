
    package com.onectrm.akshare.api.generated.futures;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: futures
    * 接口: futures_delivery_match_dce
    * 目标地址: http://www.dce.com.cn/dalianshangpin/xqsj/tjsj26/jgtj/jgsj/index.html
    * 描述: 提供大连商品交易所-交割配对
    * 限量: 单次返回指定品种的的交割配对数据
    */
    public class futures_delivery_match_dceRequest extends AkShareRequestAndResponse {
    public futures_delivery_match_dceRequest(){
    setInterfaceName("futures_delivery_match_dce");
    }

    public static String name() {
        return "futures_delivery_match_dce";
    }
    public String getName() {
    return "futures_delivery_match_dce";
    }

    public static futures_delivery_match_dceRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    futures_delivery_match_dceRequest t = new futures_delivery_match_dceRequest();


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
    * desc: symbol=&quot;a&quot;; 交易品种
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
