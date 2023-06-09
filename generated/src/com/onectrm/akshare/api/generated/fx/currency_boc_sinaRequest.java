
    package com.onectrm.akshare.api.generated.fx;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fx
    * 接口: currency_boc_sina
    * 目标地址: http://biz.finance.sina.com.cn/forex/forex.php?startdate=2012-01-01&amp;enddate=2021-06-14&amp;money_code=EUR&amp;type=0
    * 描述: 新浪财经-中行人民币牌价历史数据
    * 限量: 单次返回指定日期的所有历史数据
    */
    public class currency_boc_sinaRequest extends AkShareRequestAndResponse {
    public currency_boc_sinaRequest(){
    setInterfaceName("currency_boc_sina");
    }

    public static String name() {
        return "currency_boc_sina";
    }
    public String getName() {
    return "currency_boc_sina";
    }

    public static currency_boc_sinaRequest of(


    String p_symbol,

    String p_date,


    Map.Entry
    <String
    , String>... others){
    currency_boc_sinaRequest t = new currency_boc_sinaRequest();


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
    * desc: symbol=&quot;美元&quot;; choice of {&#39;美元&#39;, &#39;英镑&#39;, &#39;欧元&#39;, &#39;澳门元&#39;, &#39;泰国铢&#39;, &#39;菲律宾比索&#39;, &#39;港币&#39;, &#39;瑞士法郎&#39;, &#39;新加坡元&#39;, &#39;瑞典克朗&#39;, &#39;丹麦克朗&#39;, &#39;挪威克朗&#39;, &#39;日元&#39;, &#39;加拿大元&#39;, &#39;澳大利亚元&#39;, &#39;新西兰元&#39;, &#39;韩国元&#39;}
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: date
    * type: str
    * desc: date=&quot;20220620&quot;
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
