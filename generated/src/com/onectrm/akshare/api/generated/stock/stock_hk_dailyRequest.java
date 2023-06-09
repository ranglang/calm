
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_hk_daily
    * 目标地址: http://stock.finance.sina.com.cn/hkstock/quotes/01336.html(个例)
    * 描述: 港股-历史行情数据, 可以选择返回复权后数据,更新频率为日频
    * 限量: 单次返回指定上市公司的历史行情数据(包括前后复权因子), 提供新浪财经拥有的该股票的所有数据(并不等于该股票从上市至今的数据)
    */
    public class stock_hk_dailyRequest extends AkShareRequestAndResponse {
    public stock_hk_dailyRequest(){
    setInterfaceName("stock_hk_daily");
    }

    public static String name() {
        return "stock_hk_daily";
    }
    public String getName() {
    return "stock_hk_daily";
    }

    public static stock_hk_dailyRequest of(


    String p_symbol,

    String p_adjust,


    Map.Entry
    <String
    , String>... others){
    stock_hk_dailyRequest t = new stock_hk_dailyRequest();


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
    * desc: 港股代码,可以通过 **ak.stock_hk_spot()** 函数返回所有港股代码
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: adjust
    * type: str
    * desc: &quot;&quot;: 返回未复权的数据 ; qfq: 返回前复权后的数据; hfq: 返回后复权后的数据; qfq-factor: 返回前复权因子和调整; hfq-factor: 返回后复权因子和调整;
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
