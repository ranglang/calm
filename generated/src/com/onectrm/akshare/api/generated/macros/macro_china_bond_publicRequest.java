
    package com.onectrm.akshare.api.generated.macros;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_china_bond_public
    * 目标地址: http://www.chinamoney.com.cn/chinese/xzjfx/
    * 描述: 中国外汇交易中心暨全国银行间同业拆借中心-债券信息披露-新债发行; 近期债券发行数据
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_bond_publicRequest extends AkShareRequestAndResponse {
    public macro_china_bond_publicRequest(){
    setInterfaceName("macro_china_bond_public");
    }

    public static String name() {
        return "macro_china_bond_public";
    }
    public String getName() {
    return "macro_china_bond_public";
    }

    public static macro_china_bond_publicRequest of(



    Map.Entry
    <String
    , String>... others){
    macro_china_bond_publicRequest t = new macro_china_bond_publicRequest();



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
