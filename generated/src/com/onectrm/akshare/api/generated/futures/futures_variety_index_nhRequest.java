
    package com.onectrm.akshare.api.generated.futures;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: futures
    * 接口: futures_variety_index_nh
    * 目标地址: http://www.nanhua.net/nhzc/varietychange.html
    * 描述: 南华期货-市场涨跌-品种指数涨跌
    * 限量: 单次返回指定 start_date 和 end_date 的所有历史数据
    */
    public class futures_variety_index_nhRequest extends AkShareRequestAndResponse {
    public futures_variety_index_nhRequest(){
    setInterfaceName("futures_variety_index_nh");
    }

    public static String name() {
        return "futures_variety_index_nh";
    }
    public String getName() {
    return "futures_variety_index_nh";
    }

    public static futures_variety_index_nhRequest of(


    String p_startdate,

    String p_enddate,


    Map.Entry
    <String
    , String>... others){
    futures_variety_index_nhRequest t = new futures_variety_index_nhRequest();


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
    * desc: start_date=&quot;20220104&quot;;
    * required: 
    */
    private String p_startdate;

    public String getP_startdate() { return this.p_startdate;}
    public void setP_startdate(String v) { this.p_startdate = v;}

    /**
    * name: end_date
    * type: str
    * desc: end_date=&quot;20220413&quot;;
    * required: 
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
