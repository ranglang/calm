
    package com.onectrm.akshare.api.generated.fund_public;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fund_public
    * 接口: fund_fh_em
    * 目标地址: http://fund.eastmoney.com/data/fundfenhong.html
    * 描述: 天天基金网-基金数据-分红送配-基金分红
    * 限量: 单次返回所有历史数据
    */
    public class fund_fh_emRequest extends AkShareRequestAndResponse {
    public fund_fh_emRequest(){
    setInterfaceName("fund_fh_em");
    }

    public static String name() {
        return "fund_fh_em";
    }
    public String getName() {
    return "fund_fh_em";
    }

    public static fund_fh_emRequest of(



    Map.Entry
    <String
    , String>... others){
    fund_fh_emRequest t = new fund_fh_emRequest();



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
