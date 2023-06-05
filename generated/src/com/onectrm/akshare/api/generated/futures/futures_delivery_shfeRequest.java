
    package com.onectrm.akshare.api.generated.futures;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: futures
    * 接口: futures_delivery_shfe
    * 目标地址: http://www.shfe.com.cn/statements/dataview.html?paramid=kx
    * 描述: 提供上海期货交易所-交割统计
    * 限量: 单次返回指定交易月份的交割统计数据
    */
    public class futures_delivery_shfeRequest extends AkShareRequestAndResponse {
    public futures_delivery_shfeRequest(){
    setInterfaceName("futures_delivery_shfe");
    }

    public static String name() {
        return "futures_delivery_shfe";
    }
    public String getName() {
    return "futures_delivery_shfe";
    }

    public static futures_delivery_shfeRequest of(


    String p_date,


    Map.Entry
    <String
    , String>... others){
    futures_delivery_shfeRequest t = new futures_delivery_shfeRequest();


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
    * desc: date=&quot;202003&quot;; 交易月份
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
