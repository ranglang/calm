
    package com.onectrm.akshare.api.generated.option;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: option
    * 接口: option_commodity_contract_table_sina
    * 目标地址: https://stock.finance.sina.com.cn/futures/view/optionsDP.php
    * 描述: 新浪财经-商品期权的 T 型报价表
    * 限量: 单次返回指定 symbol 和 contract 的所有数据
    */
    public class option_commodity_contract_table_sinaRequest extends AkShareRequestAndResponse {
    public option_commodity_contract_table_sinaRequest(){
    setInterfaceName("option_commodity_contract_table_sina");
    }

    public static String name() {
        return "option_commodity_contract_table_sina";
    }
    public String getName() {
    return "option_commodity_contract_table_sina";
    }

    public static option_commodity_contract_table_sinaRequest of(


    String p_symbol,

    String p_contract,


    Map.Entry
    <String
    , String>... others){
    option_commodity_contract_table_sinaRequest t = new option_commodity_contract_table_sinaRequest();


    t.p_symbol = p_symbol;
    t.other.put("symbol", p_symbol.toString());

    t.p_contract = p_contract;
    t.other.put("contract", p_contract.toString());


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

    /**
    * name: contract
    * type: str
    * desc: contract=&quot;au2204&quot;; 可以通过 ak.option_commodity_contract_sina() 接口获取
    * required: 
    */
    private String p_contract;

    public String getP_contract() { return this.p_contract;}
    public void setP_contract(String v) { this.p_contract = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
