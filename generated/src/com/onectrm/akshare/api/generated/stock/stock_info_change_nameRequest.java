
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_info_change_name
    * 目标地址: http://vip.stock.finance.sina.com.cn/corp/go.php/vCI_CorpInfo/stockid/300378.phtml
    * 描述: 新浪财经-股票曾用名
    * 限量: 单次指定 symbol 的所有历史曾用名称
    */
    public class stock_info_change_nameRequest extends AkShareRequestAndResponse {
    public stock_info_change_nameRequest(){
    setInterfaceName("stock_info_change_name");
    }

    public static String name() {
        return "stock_info_change_name";
    }
    public String getName() {
    return "stock_info_change_name";
    }

    public static stock_info_change_nameRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    stock_info_change_nameRequest t = new stock_info_change_nameRequest();


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
    * desc: symbol=&quot;000503&quot;; 股票代码
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
