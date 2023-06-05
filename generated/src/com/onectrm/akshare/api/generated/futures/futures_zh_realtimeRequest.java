
    package com.onectrm.akshare.api.generated.futures;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: futures
    * 接口: futures_zh_realtime
    * 目标地址: http://vip.stock.finance.sina.com.cn/quotes_service/view/qihuohangqing.html#titlePos_1
    * 描述: 新浪财经-期货实时行情数据
    * 限量: 单次返回指定 symbol 的数据
    */
    public class futures_zh_realtimeRequest extends AkShareRequestAndResponse {
    public futures_zh_realtimeRequest(){
    setInterfaceName("futures_zh_realtime");
    }

    public static String name() {
        return "futures_zh_realtime";
    }
    public String getName() {
    return "futures_zh_realtime";
    }

    public static futures_zh_realtimeRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    futures_zh_realtimeRequest t = new futures_zh_realtimeRequest();


    t.p_symbol = p_symbol;
    t.other.put("symbol", p_symbol.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: symbol
    * type: str
    * desc: symbol=&quot;白糖&quot;, 品种名称；可以通过 ak.futures_symbol_mark() 获取所有品种命名表
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
