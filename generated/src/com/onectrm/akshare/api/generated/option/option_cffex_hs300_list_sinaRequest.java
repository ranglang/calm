
    package com.onectrm.akshare.api.generated.option;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: option
    * 接口: option_cffex_hs300_list_sina
    * 目标地址: https://stock.finance.sina.com.cn/futures/view/optionsCffexDP.php
    * 描述: 中金所-沪深300指数-所有合约, 返回的第一个合约为主力合约
    * 限量: 单次返回所有合约
    */
    public class option_cffex_hs300_list_sinaRequest extends AkShareRequestAndResponse {
    public option_cffex_hs300_list_sinaRequest(){
    setInterfaceName("option_cffex_hs300_list_sina");
    }

    public static String name() {
        return "option_cffex_hs300_list_sina";
    }
    public String getName() {
    return "option_cffex_hs300_list_sina";
    }

    public static option_cffex_hs300_list_sinaRequest of(



    Map.Entry
    <String
    , String>... others){
    option_cffex_hs300_list_sinaRequest t = new option_cffex_hs300_list_sinaRequest();



    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }




    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
