
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_institute_recommend
    * 目标地址: http://stock.finance.sina.com.cn/stock/go.php/vIR_RatingNewest/index.phtml
    * 描述: 新浪财经-机构推荐池-具体指标的数据
    * 限量: 单次获取新浪财经-机构推荐池-具体指标的所有数据
    */
    public class stock_institute_recommendRequest extends AkShareRequestAndResponse {
    public stock_institute_recommendRequest(){
    setInterfaceName("stock_institute_recommend");
    }

    public static String name() {
        return "stock_institute_recommend";
    }
    public String getName() {
    return "stock_institute_recommend";
    }

    public static stock_institute_recommendRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    stock_institute_recommendRequest t = new stock_institute_recommendRequest();


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
    * desc: symbol=&quot;行业关注度&quot;; choice of {&#39;最新投资评级&#39;, &#39;上调评级股票&#39;, &#39;下调评级股票&#39;, &#39;股票综合评级&#39;, &#39;首次评级股票&#39;, &#39;目标涨幅排名&#39;, &#39;机构关注度&#39;, &#39;行业关注度&#39;, &#39;投资评级选股&#39;}
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
