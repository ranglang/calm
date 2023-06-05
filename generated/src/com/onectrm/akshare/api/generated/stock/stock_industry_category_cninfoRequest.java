
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_industry_category_cninfo
    * 目标地址: http://webapi.cninfo.com.cn/#/apiDoc
    * 描述: 巨潮资讯-数据-行业分类数据
    * 限量: 单次获取指定 symbol 的行业分类数据
    */
    public class stock_industry_category_cninfoRequest extends AkShareRequestAndResponse {
    public stock_industry_category_cninfoRequest(){
    setInterfaceName("stock_industry_category_cninfo");
    }

    public static String name() {
        return "stock_industry_category_cninfo";
    }
    public String getName() {
    return "stock_industry_category_cninfo";
    }

    public static stock_industry_category_cninfoRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    stock_industry_category_cninfoRequest t = new stock_industry_category_cninfoRequest();


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
    * desc: symbol=&quot;巨潮行业分类标准&quot;; choice of {&quot;证监会行业分类标准&quot;, &quot;巨潮行业分类标准&quot;, &quot;申银万国行业分类标准&quot;, &quot;新财富行业分类标准&quot;, &quot;国资委行业分类标准&quot;, &quot;巨潮产业细分标准&quot;, &quot;天相行业分类标准&quot;, &quot;全球行业分类标准&quot;}
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
