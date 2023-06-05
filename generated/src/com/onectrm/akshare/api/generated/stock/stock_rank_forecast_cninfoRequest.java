
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_rank_forecast_cninfo
    * 目标地址: http://webapi.cninfo.com.cn/#/thematicStatistics?name=%E6%8A%95%E8%B5%84%E8%AF%84%E7%BA%A7
    * 描述: 巨潮资讯-数据中心-评级预测-投资评级
    * 限量: 单次获取指定交易日的所有数据
    */
    public class stock_rank_forecast_cninfoRequest extends AkShareRequestAndResponse {
    public stock_rank_forecast_cninfoRequest(){
    setInterfaceName("stock_rank_forecast_cninfo");
    }

    public static String name() {
        return "stock_rank_forecast_cninfo";
    }
    public String getName() {
    return "stock_rank_forecast_cninfo";
    }

    public static stock_rank_forecast_cninfoRequest of(


    String p_date,


    Map.Entry
    <String
    , String>... others){
    stock_rank_forecast_cninfoRequest t = new stock_rank_forecast_cninfoRequest();


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
    * desc: date=&quot;20210910&quot;; 交易日
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
