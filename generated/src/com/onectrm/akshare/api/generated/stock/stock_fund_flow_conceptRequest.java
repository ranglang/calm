
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_fund_flow_concept
    * 目标地址: http://data.10jqka.com.cn/funds/gnzjl/#refCountId=data_55f13c2c_254
    * 描述: 同花顺-数据中心-资金流向-概念资金流
    * 限量: 单次获取指定 symbol 的概念资金流数据
    */
    public class stock_fund_flow_conceptRequest extends AkShareRequestAndResponse {
    public stock_fund_flow_conceptRequest(){
    setInterfaceName("stock_fund_flow_concept");
    }

    public static String name() {
        return "stock_fund_flow_concept";
    }
    public String getName() {
    return "stock_fund_flow_concept";
    }

    public static stock_fund_flow_conceptRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    stock_fund_flow_conceptRequest t = new stock_fund_flow_conceptRequest();


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
    * desc: symbol=&quot;即时&quot;; choice of {“即时”, &quot;3日排行&quot;, &quot;5日排行&quot;, &quot;10日排行&quot;, &quot;20日排行&quot;}
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
