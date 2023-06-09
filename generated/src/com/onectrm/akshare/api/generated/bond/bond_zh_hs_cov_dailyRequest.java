
    package com.onectrm.akshare.api.generated.bond;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: bond
    * 接口: bond_zh_hs_cov_daily
    * 目标地址: http://biz.finance.sina.com.cn/suggest/lookup_n.php?q=sh110048(示例)
    * 描述: 新浪财经-历史行情数据，日频率更新, 新上的标的需要次日更新数据
    * 限量: 单次返回具体某个沪深可转债的所有历史行情数据
    */
    public class bond_zh_hs_cov_dailyRequest extends AkShareRequestAndResponse {
    public bond_zh_hs_cov_dailyRequest(){
    setInterfaceName("bond_zh_hs_cov_daily");
    }

    public static String name() {
        return "bond_zh_hs_cov_daily";
    }
    public String getName() {
    return "bond_zh_hs_cov_daily";
    }

    public static bond_zh_hs_cov_dailyRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    bond_zh_hs_cov_dailyRequest t = new bond_zh_hs_cov_dailyRequest();


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
    * desc: symbol=&quot;sh113542&quot;
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
