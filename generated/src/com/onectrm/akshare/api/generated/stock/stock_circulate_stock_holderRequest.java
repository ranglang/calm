
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_circulate_stock_holder
    * 目标地址: https://vip.stock.finance.sina.com.cn/corp/go.php/vCI_CirculateStockHolder/stockid/600000.phtml
    * 描述: 新浪财经-股东股本-流通股东
    * 限量: 单次获取流通股东数据
    */
    public class stock_circulate_stock_holderRequest extends AkShareRequestAndResponse {
    public stock_circulate_stock_holderRequest(){
    setInterfaceName("stock_circulate_stock_holder");
    }

    public static String name() {
        return "stock_circulate_stock_holder";
    }
    public String getName() {
    return "stock_circulate_stock_holder";
    }

    public static stock_circulate_stock_holderRequest of(


    String p_stock,


    Map.Entry
    <String
    , String>... others){
    stock_circulate_stock_holderRequest t = new stock_circulate_stock_holderRequest();


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
    * desc: stock=&quot;600000&quot;; 股票代码
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
