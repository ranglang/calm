
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_hold_num_cninfo
    * 目标地址: http://webapi.cninfo.com.cn/#/thematicStatistics
    * 描述: 巨潮资讯-数据中心-专题统计-股东股本-股东人数及持股集中度
    * 限量: 单次指定 date 的股东人数及持股集中度数据, 从 20170331 开始
    */
    public class stock_hold_num_cninfoRequest extends AkShareRequestAndResponse {
    public stock_hold_num_cninfoRequest(){
    setInterfaceName("stock_hold_num_cninfo");
    }

    public static String name() {
        return "stock_hold_num_cninfo";
    }
    public String getName() {
    return "stock_hold_num_cninfo";
    }

    public static stock_hold_num_cninfoRequest of(


    String p_date,


    Map.Entry
    <String
    , String>... others){
    stock_hold_num_cninfoRequest t = new stock_hold_num_cninfoRequest();


    t.p_date = p_date;
    t.other.put("date", p_date.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: date
    * type: str
    * desc: date=&quot;20210630&quot;; choice of {&quot;XXXX0331&quot;, &quot;XXXX0630&quot;, &quot;XXXX0930&quot;, &quot;XXXX1231&quot;}; 从 20170331 开始
    * required: 
    */
    private String p_date;

    public String getP_date() { return this.p_date;}
    public void setP_date(String v) { this.p_date = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
