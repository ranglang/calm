
    package com.onectrm.akshare.api.generated.futures;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: futures
    * 接口: futures_delivery_dce
    * 目标地址: http://www.dce.com.cn/dalianshangpin/xqsj/tjsj26/jgtj/jgsj/index.html
    * 描述: 提供大连商品交易所-交割统计
    * 限量: 单次返回指定交易月份的交割统计数据
    */
    public class futures_delivery_dceRequest extends AkShareRequestAndResponse {
    public futures_delivery_dceRequest(){
    setInterfaceName("futures_delivery_dce");
    }

    public static String name() {
        return "futures_delivery_dce";
    }
    public String getName() {
    return "futures_delivery_dce";
    }

    public static futures_delivery_dceRequest of(


    String p_date,


    Map.Entry
    <String
    , String>... others){
    futures_delivery_dceRequest t = new futures_delivery_dceRequest();


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
    * desc: date=&quot;202101&quot;; 交易月份
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
