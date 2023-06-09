
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_info_sz_change_name
    * 目标地址: http://www.szse.cn/market/companys/changename/index.html
    * 描述: 获取深证证券交易所-更名公司(暂无上海交易所的数据)
    * 限量: 单次获取深证证券交易所-更名公司所有历史数据
    */
    public class stock_info_sz_change_nameRequest extends AkShareRequestAndResponse {
    public stock_info_sz_change_nameRequest(){
    setInterfaceName("stock_info_sz_change_name");
    }

    public static String name() {
        return "stock_info_sz_change_name";
    }
    public String getName() {
    return "stock_info_sz_change_name";
    }

    public static stock_info_sz_change_nameRequest of(


    String p_indicator,


    Map.Entry
    <String
    , String>... others){
    stock_info_sz_change_nameRequest t = new stock_info_sz_change_nameRequest();


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
    * desc: indicator=&quot;全称变更&quot;; choice of {&quot;全称变更&quot;, &quot;简称变更&quot;}
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
