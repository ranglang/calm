
    package com.onectrm.akshare.api.generated.futures;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: futures
    * 接口: futures_to_spot_dce
    * 目标地址: http://www.dce.com.cn/dalianshangpin/xqsj/tjsj26/jgtj/qzxcx/index.html
    * 描述: 提供大连商品交易所-期转现统计数据
    * 限量: 单次返回指定交易日的期转现统计数据
    */
    public class futures_to_spot_dceRequest extends AkShareRequestAndResponse {
    public futures_to_spot_dceRequest(){
    setInterfaceName("futures_to_spot_dce");
    }

    public static String name() {
        return "futures_to_spot_dce";
    }
    public String getName() {
    return "futures_to_spot_dce";
    }

    public static futures_to_spot_dceRequest of(


    String p_date,


    Map.Entry
    <String
    , String>... others){
    futures_to_spot_dceRequest t = new futures_to_spot_dceRequest();


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
    * desc: date=&quot;202102&quot;; 交易年月
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
