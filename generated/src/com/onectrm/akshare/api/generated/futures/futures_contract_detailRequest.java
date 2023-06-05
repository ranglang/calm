
    package com.onectrm.akshare.api.generated.futures;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: futures
    * 接口: futures_contract_detail
    * 目标地址: https://finance.sina.com.cn/futures/quotes/V2101.shtml
    * 描述: 新浪财经-期货-期货合约详情数据
    * 限量: 单次返回指定 symbol 的合约详情数据
    */
    public class futures_contract_detailRequest extends AkShareRequestAndResponse {
    public futures_contract_detailRequest(){
    setInterfaceName("futures_contract_detail");
    }

    public static String name() {
        return "futures_contract_detail";
    }
    public String getName() {
    return "futures_contract_detail";
    }

    public static futures_contract_detailRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    futures_contract_detailRequest t = new futures_contract_detailRequest();


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
    * desc: symbol=&#39;AP2101&#39;; 请参考**新浪连续合约品种一览表**, 也可通过 **ak.futures_display_main_sina()** 获取
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
