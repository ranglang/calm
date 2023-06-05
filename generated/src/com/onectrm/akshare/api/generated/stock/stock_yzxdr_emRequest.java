
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_yzxdr_em
    * 目标地址: http://data.eastmoney.com/yzxdr/
    * 描述: 东方财富网-数据中心-特色数据-一致行动人
    * 限量: 单次返回所有历史数据
    */
    public class stock_yzxdr_emRequest extends AkShareRequestAndResponse {
    public stock_yzxdr_emRequest(){
    setInterfaceName("stock_yzxdr_em");
    }

    public static String name() {
        return "stock_yzxdr_em";
    }
    public String getName() {
    return "stock_yzxdr_em";
    }

    public static stock_yzxdr_emRequest of(


    String p_date,


    Map.Entry
    <String
    , String>... others){
    stock_yzxdr_emRequest t = new stock_yzxdr_emRequest();


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
    * desc: date=&quot;20200930&quot;; 每年的季度末时间点
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
