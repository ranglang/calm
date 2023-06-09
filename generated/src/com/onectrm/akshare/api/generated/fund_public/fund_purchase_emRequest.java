
    package com.onectrm.akshare.api.generated.fund_public;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fund_public
    * 接口: fund_purchase_em
    * 目标地址: http://fund.eastmoney.com/Fund_sgzt_bzdm.html#fcode,asc_1
    * 描述: 东方财富网站-天天基金网-基金数据-基金申购状态
    * 限量: 单次返回当前时刻所有历史数据
    */
    public class fund_purchase_emRequest extends AkShareRequestAndResponse {
    public fund_purchase_emRequest(){
    setInterfaceName("fund_purchase_em");
    }

    public static String name() {
        return "fund_purchase_em";
    }
    public String getName() {
    return "fund_purchase_em";
    }

    public static fund_purchase_emRequest of(



    Map.Entry
    <String
    , String>... others){
    fund_purchase_emRequest t = new fund_purchase_emRequest();



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
