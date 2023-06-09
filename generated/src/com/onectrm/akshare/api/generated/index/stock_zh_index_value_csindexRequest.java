
    package com.onectrm.akshare.api.generated.index;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: index
    * 接口: stock_zh_index_value_csindex
    * 目标地址: https://www.csindex.com.cn/zh-CN/indices/index-detail/H30374#/indices/family/detail?indexCode=H30374
    * 描述: 中证指数-指数估值数据
    * 限量: 该接口返回指定的指数的估值数据, 该接口只能返回近期的数据
    */
    public class stock_zh_index_value_csindexRequest extends AkShareRequestAndResponse {
    public stock_zh_index_value_csindexRequest(){
    setInterfaceName("stock_zh_index_value_csindex");
    }

    public static String name() {
        return "stock_zh_index_value_csindex";
    }
    public String getName() {
    return "stock_zh_index_value_csindex";
    }

    public static stock_zh_index_value_csindexRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    stock_zh_index_value_csindexRequest t = new stock_zh_index_value_csindexRequest();


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
    * desc: symbol=&quot;H30374&quot;; 指数代码
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
