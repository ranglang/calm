
    package com.onectrm.akshare.api.generated.fund_public;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fund_public
    * 接口: fund_aum_em
    * 目标地址: http://fund.eastmoney.com/Company/lsgm.html
    * 描述: 天天基金网-基金数据-基金规模
    * 限量: 单次返回所有基金规模数据
    */
    public class fund_aum_emRequest extends AkShareRequestAndResponse {
    public fund_aum_emRequest(){
    setInterfaceName("fund_aum_em");
    }

    public static String name() {
        return "fund_aum_em";
    }
    public String getName() {
    return "fund_aum_em";
    }

    public static fund_aum_emRequest of(



    Map.Entry
    <String
    , String>... others){
    fund_aum_emRequest t = new fund_aum_emRequest();



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
