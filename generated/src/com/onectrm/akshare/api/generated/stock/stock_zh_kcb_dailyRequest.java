
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_zh_kcb_daily
    * 目标地址: https://finance.sina.com.cn/realstock/company/sh688001/nc.shtml(示例)
    * 描述: 新浪财经-科创板股票历史行情数据
    * 限量: 单次返回指定 symbol 和 adjust 的所有历史行情数据; 请控制采集的频率, 大量抓取容易封IP
    */
    public class stock_zh_kcb_dailyRequest extends AkShareRequestAndResponse {
    public stock_zh_kcb_dailyRequest(){
    setInterfaceName("stock_zh_kcb_daily");
    }

    public static String name() {
        return "stock_zh_kcb_daily";
    }
    public String getName() {
    return "stock_zh_kcb_daily";
    }

    public static stock_zh_kcb_dailyRequest of(


    String p_symbol,

    String p_adjust,


    Map.Entry
    <String
    , String>... others){
    stock_zh_kcb_dailyRequest t = new stock_zh_kcb_dailyRequest();


    t.p_symbol = p_symbol;
    t.other.put("symbol", p_symbol.toString());

    t.p_adjust = p_adjust;
    t.other.put("adjust", p_adjust.toString());


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
    * desc: symbol=&quot;sh688008&quot;; 带市场标识的股票代码
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: adjust
    * type: str
    * desc: 默认不复权的数据; qfq: 返回前复权后的数据; hfq: 返回后复权后的数据; hfq-factor: 返回后复权因子; hfq-factor: 返回前复权因子
    * required: 
    */
    private String p_adjust;

    public String getP_adjust() { return this.p_adjust;}
    public void setP_adjust(String v) { this.p_adjust = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
