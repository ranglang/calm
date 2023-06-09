
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_us_daily
    * 目标地址: http://finance.sina.com.cn/stock/usstock/sector.shtml
    * 描述: 美股历史行情数据，设定 adjust=&quot;qfq&quot; 则返回前复权后的数据，默认 adjust=&quot;&quot;, 则返回未复权的数据，历史数据按日频率更新
    * 限量: 单次返回指定上市公司的指定 adjust 后的所有历史行情数据
    */
    public class stock_us_dailyRequest extends AkShareRequestAndResponse {
    public stock_us_dailyRequest(){
    setInterfaceName("stock_us_daily");
    }

    public static String name() {
        return "stock_us_daily";
    }
    public String getName() {
    return "stock_us_daily";
    }

    public static stock_us_dailyRequest of(


    String p_symbol,

    String p_adjust,


    Map.Entry
    <String
    , String>... others){
    stock_us_dailyRequest t = new stock_us_dailyRequest();


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
    * desc: 美股代码, 可以通过 **ak.get_us_stock_name** 函数返回所有美股代码, 由于美股数据量大, 建议按需要获取
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: adjust
    * type: str
    * desc: adjust=&quot;qfq&quot; 则返回前复权后的数据，默认 adjust=&quot;&quot;, 则返回未复权的数据
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
