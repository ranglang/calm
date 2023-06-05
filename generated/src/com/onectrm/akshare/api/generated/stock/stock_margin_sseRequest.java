
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_margin_sse
    * 目标地址: http://www.sse.com.cn/market/othersdata/margin/sum/
    * 描述: 获取上海证券交易所-融资融券数据-融资融券汇总数据
    * 限量: 单次返回指定时间段内的所有历史数据
    */
    public class stock_margin_sseRequest extends AkShareRequestAndResponse {
    public stock_margin_sseRequest(){
    setInterfaceName("stock_margin_sse");
    }

    public static String name() {
        return "stock_margin_sse";
    }
    public String getName() {
    return "stock_margin_sse";
    }

    public static stock_margin_sseRequest of(


    String p_startdate,

    String p_enddate,


    Map.Entry
    <String
    , String>... others){
    stock_margin_sseRequest t = new stock_margin_sseRequest();


    t.p_startdate = p_startdate;
    t.other.put("start_date", p_startdate.toString());

    t.p_enddate = p_enddate;
    t.other.put("end_date", p_enddate.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: start_date
    * type: str
    * desc: start_date=&quot;20010106&quot;
    * required: Y
    */
    private String p_startdate;

    public String getP_startdate() { return this.p_startdate;}
    public void setP_startdate(String v) { this.p_startdate = v;}

    /**
    * name: end_date
    * type: str
    * desc: end_date=&quot;20010106&quot;
    * required: Y
    */
    private String p_enddate;

    public String getP_enddate() { return this.p_enddate;}
    public void setP_enddate(String v) { this.p_enddate = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
