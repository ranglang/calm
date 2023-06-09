
    package com.onectrm.akshare.api.generated.bond;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: bond
    * 接口: bond_zh_cov_value_analysis
    * 目标地址: https://data.eastmoney.com/kzz/detail/113527.html
    * 描述: 东方财富网-行情中心-新股数据-可转债数据-可转债溢价率分析
    * 限量: 单次返回所有可转债溢价率分析数据
    */
    public class bond_zh_cov_value_analysisRequest extends AkShareRequestAndResponse {
    public bond_zh_cov_value_analysisRequest(){
    setInterfaceName("bond_zh_cov_value_analysis");
    }

    public static String name() {
        return "bond_zh_cov_value_analysis";
    }
    public String getName() {
    return "bond_zh_cov_value_analysis";
    }

    public static bond_zh_cov_value_analysisRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    bond_zh_cov_value_analysisRequest t = new bond_zh_cov_value_analysisRequest();


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
    * desc: symbol=&quot;113527&quot;; 可转债代码
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
