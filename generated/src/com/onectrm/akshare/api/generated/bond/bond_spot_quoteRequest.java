
    package com.onectrm.akshare.api.generated.bond;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: bond
    * 接口: bond_spot_quote
    * 目标地址: http://www.chinamoney.com.cn/chinese/mkdatabond/
    * 描述: 中国外汇交易中心暨全国银行间同业拆借中心-市场数据-市场行情-债券市场行情-现券市场做市报价
    * 限量: 单次返回所有数据
    */
    public class bond_spot_quoteRequest extends AkShareRequestAndResponse {
    public bond_spot_quoteRequest(){
    setInterfaceName("bond_spot_quote");
    }

    public static String name() {
        return "bond_spot_quote";
    }
    public String getName() {
    return "bond_spot_quote";
    }

    public static bond_spot_quoteRequest of(



    Map.Entry
    <String
    , String>... others){
    bond_spot_quoteRequest t = new bond_spot_quoteRequest();



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
