
    package com.onectrm.akshare.api.generated.futures;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: futures
    * 接口: futures_global_commodity_hist
    * 目标地址: https://cn.investing.com/commodities
    * 描述: 主要提供全球能源、农业、金属、商品指数历史数据, 此处请注意调取数据的时间长度; 该接口需要通过代理访问
    * 限量: 单次最大 5000 行, 建议用 for 获取行数据
    */
    public class futures_global_commodity_histRequest extends AkShareRequestAndResponse {
    public futures_global_commodity_histRequest(){
    setInterfaceName("futures_global_commodity_hist");
    }

    public static String name() {
        return "futures_global_commodity_hist";
    }
    public String getName() {
    return "futures_global_commodity_hist";
    }

    public static futures_global_commodity_histRequest of(


    String p_sector,

    String p_symbol,

    String p_startdate,

    String p_enddate,


    Map.Entry
    <String
    , String>... others){
    futures_global_commodity_histRequest t = new futures_global_commodity_histRequest();


    t.p_sector = p_sector;
    t.other.put("sector", p_sector.toString());

    t.p_symbol = p_symbol;
    t.other.put("symbol", p_symbol.toString());

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
    * name: sector
    * type: str
    * desc: 能源、农业、金属、商品指数之一
    * required: Y
    */
    private String p_sector;

    public String getP_sector() { return this.p_sector;}
    public void setP_sector(String v) { this.p_sector = v;}

    /**
    * name: symbol
    * type: str
    * desc: 对应板块中的产品名称, 可以通过查询网页获取或者调用 **futures_global_commodity_name_url_map** 获取
    * required: Y
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: start_date
    * type: str
    * desc: 需要获取数据的开始时间; e.g., start_date=&#39;2005/01/01&#39;
    * required: Y
    */
    private String p_startdate;

    public String getP_startdate() { return this.p_startdate;}
    public void setP_startdate(String v) { this.p_startdate = v;}

    /**
    * name: end_date
    * type: str
    * desc: 需要获取数据的开始时间; e.g., end_date=&#39;2015/01/01&#39;
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
