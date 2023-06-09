
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_em_qsjy
    * 目标地址: http://data.eastmoney.com/other/qsjy.html
    * 描述: 东方财富网-数据中心-特色数据-券商业绩月报
    * 限量: 单次获取所有数据, 数据从 20100601-至今, 月频率
    */
    public class stock_em_qsjyRequest extends AkShareRequestAndResponse {
    public stock_em_qsjyRequest(){
    setInterfaceName("stock_em_qsjy");
    }

    public static String name() {
        return "stock_em_qsjy";
    }
    public String getName() {
    return "stock_em_qsjy";
    }

    public static stock_em_qsjyRequest of(


    String p_category,


    Map.Entry
    <String
    , String>... others){
    stock_em_qsjyRequest t = new stock_em_qsjyRequest();


    t.p_category = p_category;
    t.other.put("category", p_category.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: category
    * type: str
    * desc: category=&quot;us&quot;; choice of {&quot;us&quot;, &quot;hk&quot;}
    * required: Y
    */
    private String p_category;

    public String getP_category() { return this.p_category;}
    public void setP_category(String v) { this.p_category = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
