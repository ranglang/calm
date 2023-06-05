
    package com.onectrm.akshare.api.generated.futures;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: futures
    * 接口: futures_foreign_detail
    * 目标地址: https://finance.sina.com.cn/futuremarket/
    * 描述: 新浪财经-期货外盘期货合约详情
    * 限量: 单次返回指定品种的合约详情数据
    */
    public class futures_foreign_detailRequest extends AkShareRequestAndResponse {
    public futures_foreign_detailRequest(){
    setInterfaceName("futures_foreign_detail");
    }

    public static String name() {
        return "futures_foreign_detail";
    }
    public String getName() {
    return "futures_foreign_detail";
    }

    public static futures_foreign_detailRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    futures_foreign_detailRequest t = new futures_foreign_detailRequest();


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
    * desc: symbol=&quot;ZSD&quot;; 外盘期货的 **symbol** 可以通过 **hf_subscribe_exchange_symbol** 获取
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
