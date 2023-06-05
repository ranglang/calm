
    package com.onectrm.akshare.api.generated.option;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: option
    * 接口: option_commodity_contract_sina
    * 目标地址: https://stock.finance.sina.com.cn/futures/view/optionsDP.php
    * 描述: 新浪财经-商品期权当前在交易的合约
    * 限量: 单次返回指定 symbol 的所有合约数据
    */
    public class option_commodity_contract_sinaRequest extends AkShareRequestAndResponse {
    public option_commodity_contract_sinaRequest(){
    setInterfaceName("option_commodity_contract_sina");
    }

    public static String name() {
        return "option_commodity_contract_sina";
    }
    public String getName() {
    return "option_commodity_contract_sina";
    }

    public static option_commodity_contract_sinaRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    option_commodity_contract_sinaRequest t = new option_commodity_contract_sinaRequest();


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
    * desc: symbol=&quot;玉米期权&quot;
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
