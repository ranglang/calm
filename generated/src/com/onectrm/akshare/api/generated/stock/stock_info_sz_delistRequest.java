
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_info_sz_delist
    * 目标地址: http://www.szse.cn/market/stock/suspend/index.html
    * 描述: 获取深证证券交易所终止(暂停)上市股票
    * 限量: 单次获取深证证券交易所终止(暂停)上市股票
    */
    public class stock_info_sz_delistRequest extends AkShareRequestAndResponse {
    public stock_info_sz_delistRequest(){
    setInterfaceName("stock_info_sz_delist");
    }

    public static String name() {
        return "stock_info_sz_delist";
    }
    public String getName() {
    return "stock_info_sz_delist";
    }

    public static stock_info_sz_delistRequest of(


    String p_indicator,


    Map.Entry
    <String
    , String>... others){
    stock_info_sz_delistRequest t = new stock_info_sz_delistRequest();


    t.p_indicator = p_indicator;
    t.other.put("indicator", p_indicator.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: indicator
    * type: str
    * desc: indicator=&quot;终止上市公司&quot;; choice of {&quot;暂停上市公司&quot;, &quot;终止上市公司&quot;}
    * required: Y
    */
    private String p_indicator;

    public String getP_indicator() { return this.p_indicator;}
    public void setP_indicator(String v) { this.p_indicator = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
