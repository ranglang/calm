
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_institute_recommend_detail
    * 目标地址: http://stock.finance.sina.com.cn/stock/go.php/vIR_StockSearch/key/sz000001.phtml
    * 描述: 新浪财经-机构推荐池-股票评级记录
    * 限量: 单次获取新浪财经-机构推荐池-股票评级记录的所有数据
    */
    public class stock_institute_recommend_detailRequest extends AkShareRequestAndResponse {
    public stock_institute_recommend_detailRequest(){
    setInterfaceName("stock_institute_recommend_detail");
    }

    public static String name() {
        return "stock_institute_recommend_detail";
    }
    public String getName() {
    return "stock_institute_recommend_detail";
    }

    public static stock_institute_recommend_detailRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    stock_institute_recommend_detailRequest t = new stock_institute_recommend_detailRequest();


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
    * desc: symbol=&quot;000001&quot;
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
