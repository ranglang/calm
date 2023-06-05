
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_yysj_em
    * 目标地址: http://data.eastmoney.com/bbsj/202003/yysj.html
    * 描述: 东方财富-数据中心-年报季报-预约披露时间
    * 限量: 单次获取指定 symbol 和 date 的预约披露时间数据
    */
    public class stock_yysj_emRequest extends AkShareRequestAndResponse {
    public stock_yysj_emRequest(){
    setInterfaceName("stock_yysj_em");
    }

    public static String name() {
        return "stock_yysj_em";
    }
    public String getName() {
    return "stock_yysj_em";
    }

    public static stock_yysj_emRequest of(


    String p_symbol,

    String p_date,


    Map.Entry
    <String
    , String>... others){
    stock_yysj_emRequest t = new stock_yysj_emRequest();


    t.p_symbol = p_symbol;
    t.other.put("symbol", p_symbol.toString());

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
    * name: symbol
    * type: str
    * desc: symbol=&quot;沪深A股&quot;; choice of {&#39;沪深A股&#39;, &#39;沪市A股&#39;, &#39;科创板&#39;, &#39;深市A股&#39;, &#39;创业板&#39;, &#39;京市A股&#39;, &#39;ST板&#39;}
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: date
    * type: str
    * desc: date=&quot;20200331&quot;; choice of {&quot;XXXX0331&quot;, &quot;XXXX0630&quot;, &quot;XXXX0930&quot;, &quot;XXXX1231&quot;}; 从 20081231 开始
    * required: 
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
