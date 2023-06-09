
    package com.onectrm.akshare.api.generated.option;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: option
    * 接口: option_czce_hist
    * 目标地址: http://www.czce.com.cn/cn/jysj/lshqxz/H770319index_1.htm
    * 描述: 郑州商品交易所的商品期权历史行情数据
    * 限量: 单次返回指定年份指定品种期权历史行情数据
    */
    public class option_czce_histRequest extends AkShareRequestAndResponse {
    public option_czce_histRequest(){
    setInterfaceName("option_czce_hist");
    }

    public static String name() {
        return "option_czce_hist";
    }
    public String getName() {
    return "option_czce_hist";
    }

    public static option_czce_histRequest of(


    String p_year,

    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    option_czce_histRequest t = new option_czce_histRequest();


    t.p_year = p_year;
    t.other.put("year", p_year.toString());

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
    * name: year
    * type: str
    * desc: year=&quot;2019&quot;
    * required: 
    */
    private String p_year;

    public String getP_year() { return this.p_year;}
    public void setP_year(String v) { this.p_year = v;}

    /**
    * name: symbol
    * type: str
    * desc: symbol=&quot;SR&quot;; choice of {&quot;白糖&quot;: &quot;SR&quot;, &quot;棉花&quot;: &quot;CF&quot;, &quot;PTA&quot;: &quot;TA&quot;, &quot;甲醇&quot;: &quot;MA&quot;, &quot;菜籽粕&quot;: &quot;RM&quot;, &quot;动力煤&quot;: &quot;ZC&quot;}
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
