
    package com.onectrm.akshare.api.generated.bond;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: bond
    * 接口: bond_zh_hs_cov_spot
    * 目标地址: http://vip.stock.finance.sina.com.cn/mkt/#hskzz_z
    * 描述: 新浪财经-沪深可转债数据
    * 限量: 单次返回所有沪深可转债的实时行情数据
    */
    public class bond_zh_hs_cov_spotRequest extends AkShareRequestAndResponse {
    public bond_zh_hs_cov_spotRequest(){
    setInterfaceName("bond_zh_hs_cov_spot");
    }

    public static String name() {
        return "bond_zh_hs_cov_spot";
    }
    public String getName() {
    return "bond_zh_hs_cov_spot";
    }

    public static bond_zh_hs_cov_spotRequest of(



    Map.Entry
    <String
    , String>... others){
    bond_zh_hs_cov_spotRequest t = new bond_zh_hs_cov_spotRequest();



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
