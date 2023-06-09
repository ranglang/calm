
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_ipo_info
    * 目标地址: https://vip.stock.finance.sina.com.cn/corp/go.php/vISSUE_NewStock/stockid/600004.phtml
    * 描述: 新浪财经-发行与分配-新股发行
    * 限量: 单次获取新股发行的基本信息数据
    */
    public class stock_ipo_infoRequest extends AkShareRequestAndResponse {
    public stock_ipo_infoRequest(){
    setInterfaceName("stock_ipo_info");
    }

    public static String name() {
        return "stock_ipo_info";
    }
    public String getName() {
    return "stock_ipo_info";
    }

    public static stock_ipo_infoRequest of(


    String p_stock,


    Map.Entry
    <String
    , String>... others){
    stock_ipo_infoRequest t = new stock_ipo_infoRequest();


    t.p_stock = p_stock;
    t.other.put("stock", p_stock.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: stock
    * type: str
    * desc: stock=&quot;600004&quot;; 股票代码
    * required: Y
    */
    private String p_stock;

    public String getP_stock() { return this.p_stock;}
    public void setP_stock(String v) { this.p_stock = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
