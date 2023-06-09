
    package com.onectrm.akshare.api.generated.fund_public;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fund_public
    * 接口: fund_scale_change_em
    * 目标地址: http://fund.eastmoney.com/data/gmbdlist.html
    * 描述: 天天基金网-基金数据-规模份额-规模变动
    * 限量: 返回所有规模变动数据
    */
    public class fund_scale_change_emRequest extends AkShareRequestAndResponse {
    public fund_scale_change_emRequest(){
    setInterfaceName("fund_scale_change_em");
    }

    public static String name() {
        return "fund_scale_change_em";
    }
    public String getName() {
    return "fund_scale_change_em";
    }

    public static fund_scale_change_emRequest of(



    Map.Entry
    <String
    , String>... others){
    fund_scale_change_emRequest t = new fund_scale_change_emRequest();



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
