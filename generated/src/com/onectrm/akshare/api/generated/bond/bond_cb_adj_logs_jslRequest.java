
    package com.onectrm.akshare.api.generated.bond;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: bond
    * 接口: bond_cb_adj_logs_jsl
    * 目标地址: https://app.jisilu.cn/data/cbnew/#cb; 点击带红色星号的转股价会弹出转股价调整记录
    * 描述: 集思录-单个可转债的转股价格-调整记录
    * 限量: 返回当前时刻该可转债的所有转股价格调整记录
    */
    public class bond_cb_adj_logs_jslRequest extends AkShareRequestAndResponse {
    public bond_cb_adj_logs_jslRequest(){
    setInterfaceName("bond_cb_adj_logs_jsl");
    }

    public static String name() {
        return "bond_cb_adj_logs_jsl";
    }
    public String getName() {
    return "bond_cb_adj_logs_jsl";
    }

    public static bond_cb_adj_logs_jslRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    bond_cb_adj_logs_jslRequest t = new bond_cb_adj_logs_jslRequest();


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
    * desc: symbol=&quot;128013&quot;; 可转债代码
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
