
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_zt_pool_em
    * 目标地址: http://quote.eastmoney.com/ztb/detail#type=ztgc
    * 描述: 东方财富网-行情中心-涨停板行情-涨停股池
    * 限量: 单次返回所有涨停股池数据
    */
    public class stock_zt_pool_emRequest extends AkShareRequestAndResponse {
    public stock_zt_pool_emRequest(){
    setInterfaceName("stock_zt_pool_em");
    }

    public static String name() {
        return "stock_zt_pool_em";
    }
    public String getName() {
    return "stock_zt_pool_em";
    }

    public static stock_zt_pool_emRequest of(


    String p_date,


    Map.Entry
    <String
    , String>... others){
    stock_zt_pool_emRequest t = new stock_zt_pool_emRequest();


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
    * desc: date=&#39;20210525&#39;
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
