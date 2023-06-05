
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_margin_detail_sse
    * 目标地址: http://www.sse.com.cn/market/othersdata/margin/detail/
    * 描述: 上海证券交易所-融资融券数据-融资融券明细数据
    * 限量: 单次返回交易日的所有历史数据
    */
    public class stock_margin_detail_sseRequest extends AkShareRequestAndResponse {
    public stock_margin_detail_sseRequest(){
    setInterfaceName("stock_margin_detail_sse");
    }

    public static String name() {
        return "stock_margin_detail_sse";
    }
    public String getName() {
    return "stock_margin_detail_sse";
    }

    public static stock_margin_detail_sseRequest of(


    String p_date,


    Map.Entry
    <String
    , String>... others){
    stock_margin_detail_sseRequest t = new stock_margin_detail_sseRequest();


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
    * desc: date=&quot;20210205&quot;
    * required: Y
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
