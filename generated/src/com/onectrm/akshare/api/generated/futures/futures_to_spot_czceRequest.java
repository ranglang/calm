
    package com.onectrm.akshare.api.generated.futures;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: futures
    * 接口: futures_to_spot_czce
    * 目标地址: http://www.czce.com.cn/cn/jysj/qzxtj/H770311index_1.htm
    * 描述: 郑州商品交易所-期转现统计数据
    * 限量: 单次返回指定交易日的期转现统计数据
    */
    public class futures_to_spot_czceRequest extends AkShareRequestAndResponse {
    public futures_to_spot_czceRequest(){
    setInterfaceName("futures_to_spot_czce");
    }

    public static String name() {
        return "futures_to_spot_czce";
    }
    public String getName() {
    return "futures_to_spot_czce";
    }

    public static futures_to_spot_czceRequest of(


    String p_date,


    Map.Entry
    <String
    , String>... others){
    futures_to_spot_czceRequest t = new futures_to_spot_czceRequest();


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
    * desc: date=&quot;20210112&quot;; 交易日
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
