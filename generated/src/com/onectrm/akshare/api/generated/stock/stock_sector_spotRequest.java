
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_sector_spot
    * 目标地址: http://finance.sina.com.cn/stock/sl/
    * 描述: 新浪行业-板块行情
    * 限量: 单次获取指定的板块行情实时数据
    */
    public class stock_sector_spotRequest extends AkShareRequestAndResponse {
    public stock_sector_spotRequest(){
    setInterfaceName("stock_sector_spot");
    }

    public static String name() {
        return "stock_sector_spot";
    }
    public String getName() {
    return "stock_sector_spot";
    }

    public static stock_sector_spotRequest of(


    String p_indicator,


    Map.Entry
    <String
    , String>... others){
    stock_sector_spotRequest t = new stock_sector_spotRequest();


    t.p_indicator = p_indicator;
    t.other.put("indicator", p_indicator.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: indicator
    * type: str
    * desc: indicator=&quot;新浪行业&quot;; choice of {&quot;新浪行业&quot;, &quot;启明星行业&quot;, &quot;概念&quot;, &quot;地域&quot;, &quot;行业&quot;}
    * required: 
    */
    private String p_indicator;

    public String getP_indicator() { return this.p_indicator;}
    public void setP_indicator(String v) { this.p_indicator = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
