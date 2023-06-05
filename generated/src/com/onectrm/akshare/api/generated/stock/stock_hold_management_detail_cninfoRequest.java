
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_hold_management_detail_cninfo
    * 目标地址: http://webapi.cninfo.com.cn/#/thematicStatistics
    * 描述: 巨潮资讯-数据中心-专题统计-股东股本-高管持股变动明细
    * 限量: 单次指定 symbol 的高管持股变动明细数据, 返回近一年的数据
    */
    public class stock_hold_management_detail_cninfoRequest extends AkShareRequestAndResponse {
    public stock_hold_management_detail_cninfoRequest(){
    setInterfaceName("stock_hold_management_detail_cninfo");
    }

    public static String name() {
        return "stock_hold_management_detail_cninfo";
    }
    public String getName() {
    return "stock_hold_management_detail_cninfo";
    }

    public static stock_hold_management_detail_cninfoRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    stock_hold_management_detail_cninfoRequest t = new stock_hold_management_detail_cninfoRequest();


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
    * desc: symbol=&quot;增持&quot;; choice of {&quot;增持&quot;, &quot;减持&quot;}
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
