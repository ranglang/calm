
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_hsgt_south_net_flow_in_em
    * 目标地址: http://data.eastmoney.com/hsgtcg/
    * 描述: 东方财富网-数据中心-沪深港通持股-南向概括-南向净流入; 注: 资金净流入=当日资金限额-当日资金余额; 资金净流入包含当日成交净买额和当日买入申报未成交金额; 南向资金是沪股通与深股通的资金加总
    * 限量: 单次返回指定 symbol 的所有数据
    */
    public class stock_hsgt_south_net_flow_in_emRequest extends AkShareRequestAndResponse {
    public stock_hsgt_south_net_flow_in_emRequest(){
    setInterfaceName("stock_hsgt_south_net_flow_in_em");
    }

    public static String name() {
        return "stock_hsgt_south_net_flow_in_em";
    }
    public String getName() {
    return "stock_hsgt_south_net_flow_in_em";
    }

    public static stock_hsgt_south_net_flow_in_emRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    stock_hsgt_south_net_flow_in_emRequest t = new stock_hsgt_south_net_flow_in_emRequest();


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
    * desc: symbol=&quot;沪股通&quot;; choice of {&quot;沪股通&quot;, &quot;深股通&quot;, &quot;南下&quot;}
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
