
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_info_sz_name_code
    * 目标地址: http://www.szse.cn/market/product/stock/list/index.html
    * 描述: 深证证券交易所股票代码和股票简称数据
    * 限量: 单次获取深证证券交易所股票代码和简称数据
    */
    public class stock_info_sz_name_codeRequest extends AkShareRequestAndResponse {
    public stock_info_sz_name_codeRequest(){
    setInterfaceName("stock_info_sz_name_code");
    }

    public static String name() {
        return "stock_info_sz_name_code";
    }
    public String getName() {
    return "stock_info_sz_name_code";
    }

    public static stock_info_sz_name_codeRequest of(


    String p_indicator,


    Map.Entry
    <String
    , String>... others){
    stock_info_sz_name_codeRequest t = new stock_info_sz_name_codeRequest();


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
    * desc: indicator=&quot;A股列表&quot;; choice of {&quot;A股列表&quot;, &quot;B股列表&quot;, &quot;CDR列表&quot;, &quot;AB股列表&quot;}
    * required: 
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
