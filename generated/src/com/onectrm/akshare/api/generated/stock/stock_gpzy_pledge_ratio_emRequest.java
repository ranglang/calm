
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_gpzy_pledge_ratio_em
    * 目标地址: http://data.eastmoney.com/gpzy/pledgeRatio.aspx
    * 描述: 东方财富网-数据中心-特色数据-股权质押-上市公司质押比例
    * 限量: 单次返回指定交易日的所有历史数据; 其中的交易日需要根据网站提供的为准; 请访问 http://data.eastmoney.com/gpzy/pledgeRatio.aspx 查询具体交易日
    */
    public class stock_gpzy_pledge_ratio_emRequest extends AkShareRequestAndResponse {
    public stock_gpzy_pledge_ratio_emRequest(){
    setInterfaceName("stock_gpzy_pledge_ratio_em");
    }

    public static String name() {
        return "stock_gpzy_pledge_ratio_em";
    }
    public String getName() {
    return "stock_gpzy_pledge_ratio_em";
    }

    public static stock_gpzy_pledge_ratio_emRequest of(


    String p_date,


    Map.Entry
    <String
    , String>... others){
    stock_gpzy_pledge_ratio_emRequest t = new stock_gpzy_pledge_ratio_emRequest();


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
    * desc: date=&quot;20220408&quot;; 请访问 http://data.eastmoney.com/gpzy/pledgeRatio.aspx 查询具体交易日
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
