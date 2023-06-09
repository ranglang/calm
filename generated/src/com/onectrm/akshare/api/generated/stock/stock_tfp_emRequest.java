
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_tfp_em
    * 目标地址: http://data.eastmoney.com/tfpxx/
    * 描述: 东方财富网-数据中心-特色数据-两市停复牌
    * 限量: 单次获取指定 date 的停复牌数据, 具体更新逻辑跟目标网页统一
    */
    public class stock_tfp_emRequest extends AkShareRequestAndResponse {
    public stock_tfp_emRequest(){
    setInterfaceName("stock_tfp_em");
    }

    public static String name() {
        return "stock_tfp_em";
    }
    public String getName() {
    return "stock_tfp_em";
    }

    public static stock_tfp_emRequest of(


    String p_date,


    Map.Entry
    <String
    , String>... others){
    stock_tfp_emRequest t = new stock_tfp_emRequest();


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
    * desc: date=&quot;20220523&quot;
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
