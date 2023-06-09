
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_restricted_shares
    * 目标地址: https://vip.stock.finance.sina.com.cn/q/go.php/vInvestConsult/kind/xsjj/index.phtml?symbol=sh600000
    * 描述: 获取新浪财经-发行分配-限售解禁
    * 限量: 单次获取限售解禁数据
    */
    public class stock_restricted_sharesRequest extends AkShareRequestAndResponse {
    public stock_restricted_sharesRequest(){
    setInterfaceName("stock_restricted_shares");
    }

    public static String name() {
        return "stock_restricted_shares";
    }
    public String getName() {
    return "stock_restricted_shares";
    }

    public static stock_restricted_sharesRequest of(


    String p_stock,


    Map.Entry
    <String
    , String>... others){
    stock_restricted_sharesRequest t = new stock_restricted_sharesRequest();


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
