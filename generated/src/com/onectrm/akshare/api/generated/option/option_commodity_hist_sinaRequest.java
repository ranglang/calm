
    package com.onectrm.akshare.api.generated.option;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: option
    * 接口: option_commodity_hist_sina
    * 目标地址: https://stock.finance.sina.com.cn/futures/view/optionsDP.php
    * 描述: 新浪财经-商品期权的历史行情数据-日频率
    * 限量: 单次返回指定合约的历史行情数据
    */
    public class option_commodity_hist_sinaRequest extends AkShareRequestAndResponse {
    public option_commodity_hist_sinaRequest(){
    setInterfaceName("option_commodity_hist_sina");
    }

    public static String name() {
        return "option_commodity_hist_sina";
    }
    public String getName() {
    return "option_commodity_hist_sina";
    }

    public static option_commodity_hist_sinaRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    option_commodity_hist_sinaRequest t = new option_commodity_hist_sinaRequest();


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
    * desc: symbol=&quot;au2012C328&quot;; 可以通过 ak.option_commodity_contract_table_sina() 获取具体合约代码
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
