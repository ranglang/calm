
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_zh_ah_daily
    * 目标地址: http://gu.qq.com/hk02359/gp(示例)
    * 描述: A+H 股数据是从腾讯财经获取的数据, 历史数据按日频率更新
    * 限量: 单次返回所有 A+H 上市公司的历史行情数据
    */
    public class stock_zh_ah_dailyRequest extends AkShareRequestAndResponse {
    public stock_zh_ah_dailyRequest(){
    setInterfaceName("stock_zh_ah_daily");
    }

    public static String name() {
        return "stock_zh_ah_daily";
    }
    public String getName() {
    return "stock_zh_ah_daily";
    }

    public static stock_zh_ah_dailyRequest of(


    String p_symbol,

    String p_startyear,

    String p_endyear,

    String p_adjust,


    Map.Entry
    <String
    , String>... others){
    stock_zh_ah_dailyRequest t = new stock_zh_ah_dailyRequest();


    t.p_symbol = p_symbol;
    t.other.put("symbol", p_symbol.toString());

    t.p_startyear = p_startyear;
    t.other.put("start_year", p_startyear.toString());

    t.p_endyear = p_endyear;
    t.other.put("end_year", p_endyear.toString());

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
    * desc: symbol=&quot;02318&quot;; 港股股票代码, 可以通过 **stock_zh_ah_name** 函数获取
    * required: Y
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: start_year
    * type: str
    * desc: start_year=&quot;2000&quot;; 开始年份
    * required: Y
    */
    private String p_startyear;

    public String getP_startyear() { return this.p_startyear;}
    public void setP_startyear(String v) { this.p_startyear = v;}

    /**
    * name: end_year
    * type: str
    * desc: end_year=&quot;2019&quot;; 结束年份
    * required: Y
    */
    private String p_endyear;

    public String getP_endyear() { return this.p_endyear;}
    public void setP_endyear(String v) { this.p_endyear = v;}

    /**
    * name: adjust
    * type: str
    * desc: adjust=&quot;&quot;; 默认为空不复权; &#39;qfq&#39;: 前复权, &#39;hfq&#39;: 后复权
    * required: Y
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
