
    package com.onectrm.akshare.api.generated.futures;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: futures
    * 接口: futures_foreign_commodity_realtime
    * 目标地址: https://finance.sina.com.cn/money/future/hf.html
    * 描述: 新浪财经-外盘商品期货数据
    * 限量: 单次返回当前交易日的订阅的所有期货品种的数据
    */
    public class futures_foreign_commodity_realtimeRequest extends AkShareRequestAndResponse {
    public futures_foreign_commodity_realtimeRequest(){
    setInterfaceName("futures_foreign_commodity_realtime");
    }

    public static String name() {
        return "futures_foreign_commodity_realtime";
    }
    public String getName() {
    return "futures_foreign_commodity_realtime";
    }

    public static futures_foreign_commodity_realtimeRequest of(


    String p_subscribelist,


    Map.Entry
    <String
    , String>... others){
    futures_foreign_commodity_realtimeRequest t = new futures_foreign_commodity_realtimeRequest();


    t.p_subscribelist = p_subscribelist;
    t.other.put("subscribe_list", p_subscribelist.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: subscribe_list
    * type: list
    * desc: 需要订阅的合约代码; 调用 **ak.futures_hq_subscribe_exchange_symbol()** 获取字段及代码对应表
    * required: 
    */
    private String p_subscribelist;

    public String getP_subscribelist() { return this.p_subscribelist;}
    public void setP_subscribelist(String v) { this.p_subscribelist = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
