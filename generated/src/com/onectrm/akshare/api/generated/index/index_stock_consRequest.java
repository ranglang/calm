
    package com.onectrm.akshare.api.generated.index;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: index
    * 接口: index_stock_cons
    * 目标地址: http://vip.stock.finance.sina.com.cn/corp/view/vII_NewestComponent.php?page=1&amp;indexid=399639
    * 描述: 指定指数的最新成份股票信息, 注意该接口返回的数据有部分是重复会导致数据缺失, 可以调用 **ak.index_stock_cons_sina()** 获取主流指数数据, 或调用**ak.index_stock_cons_csindex()**获取中证指数网提供的成分数据
    * 限量: 单次返回某一个国家或地区的具体某一个指数, 每次最大返回 5000 条, 想获取较长时间的历史数据请分时间段获取, 建议用 for 循环获取多个国家的多个指数, 注意不要大量获取, 以免给对方服务器造成压力!
    */
    public class index_stock_consRequest extends AkShareRequestAndResponse {
    public index_stock_consRequest(){
    setInterfaceName("index_stock_cons");
    }

    public static String name() {
        return "index_stock_cons";
    }
    public String getName() {
    return "index_stock_cons";
    }

    public static index_stock_consRequest of(


    String p_symbol,

    String p_indexname,

    String p_period,

    String p_startdate,

    String p_enddate,


    Map.Entry
    <String
    , String>... others){
    index_stock_consRequest t = new index_stock_consRequest();


    t.p_symbol = p_symbol;
    t.other.put("symbol", p_symbol.toString());

    t.p_indexname = p_indexname;
    t.other.put("index_name", p_indexname.toString());

    t.p_period = p_period;
    t.other.put("period", p_period.toString());

    t.p_startdate = p_startdate;
    t.other.put("start_date", p_startdate.toString());

    t.p_enddate = p_enddate;
    t.other.put("end_date", p_enddate.toString());


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
    * desc: symbol=&quot;美国&quot;
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: index_name
    * type: str
    * desc: index_name=&quot;美元指数&quot;; 可以通过 ak.index_investing_global_country_name_url(&quot;美国&quot;) 获取
    * required: 
    */
    private String p_indexname;

    public String getP_indexname() { return this.p_indexname;}
    public void setP_indexname(String v) { this.p_indexname = v;}

    /**
    * name: period
    * type: str
    * desc: period=&quot;每月&quot;; choice of {&quot;每日&quot;, &quot;每周&quot;, &quot;每月&quot;}
    * required: 
    */
    private String p_period;

    public String getP_period() { return this.p_period;}
    public void setP_period(String v) { this.p_period = v;}

    /**
    * name: start_date
    * type: str
    * desc: start_date=&#39;20000101&#39;
    * required: 
    */
    private String p_startdate;

    public String getP_startdate() { return this.p_startdate;}
    public void setP_startdate(String v) { this.p_startdate = v;}

    /**
    * name: end_date
    * type: str
    * desc: end_date=&#39;20191017&#39;
    * required: 
    */
    private String p_enddate;

    public String getP_enddate() { return this.p_enddate;}
    public void setP_enddate(String v) { this.p_enddate = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
