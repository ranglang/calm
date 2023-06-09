
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_hot_rank_wc
    * 目标地址: http://www.iwencai.com/unifiedwap/home/index
    * 描述: 问财-热门股票排名数据
    * 限量: 单次返回所有股票的热门排名数据, 当前交易日的数据请在夜间访问; 请注意访问的频率
    */
    public class stock_hot_rank_wcRequest extends AkShareRequestAndResponse {
    public stock_hot_rank_wcRequest(){
    setInterfaceName("stock_hot_rank_wc");
    }

    public static String name() {
        return "stock_hot_rank_wc";
    }
    public String getName() {
    return "stock_hot_rank_wc";
    }

    public static stock_hot_rank_wcRequest of(


    String p_date,


    Map.Entry
    <String
    , String>... others){
    stock_hot_rank_wcRequest t = new stock_hot_rank_wcRequest();


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
    * desc: date=&quot;20210218&quot;; 查询日期
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
