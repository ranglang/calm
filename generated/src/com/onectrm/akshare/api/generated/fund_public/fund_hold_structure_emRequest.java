
    package com.onectrm.akshare.api.generated.fund_public;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fund_public
    * 接口: fund_hold_structure_em
    * 目标地址: http://fund.eastmoney.com/data/cyrjglist.html
    * 描述: 天天基金网-基金数据-规模份额-持有人结构
    * 限量: 返回所有持有人结构数据
    */
    public class fund_hold_structure_emRequest extends AkShareRequestAndResponse {
    public fund_hold_structure_emRequest(){
    setInterfaceName("fund_hold_structure_em");
    }

    public static String name() {
        return "fund_hold_structure_em";
    }
    public String getName() {
    return "fund_hold_structure_em";
    }

    public static fund_hold_structure_emRequest of(



    Map.Entry
    <String
    , String>... others){
    fund_hold_structure_emRequest t = new fund_hold_structure_emRequest();



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
