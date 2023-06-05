
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_gdfx_top_10_em
    * 目标地址: https://emweb.securities.eastmoney.com/PC_HSF10/ShareholderResearch/Index?type=web&amp;code=SH688686#sdltgd-0
    * 描述: 东方财富网-个股-十大股东
    * 限量: 单次返回指定 symbol 和 date 的所有数据
    */
    public class stock_gdfx_top_10_emRequest extends AkShareRequestAndResponse {
    public stock_gdfx_top_10_emRequest(){
    setInterfaceName("stock_gdfx_top_10_em");
    }

    public static String name() {
        return "stock_gdfx_top_10_em";
    }
    public String getName() {
    return "stock_gdfx_top_10_em";
    }

    public static stock_gdfx_top_10_emRequest of(


    String p_symbol,

    String p_date,


    Map.Entry
    <String
    , String>... others){
    stock_gdfx_top_10_emRequest t = new stock_gdfx_top_10_emRequest();


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
    * desc: symbol=&quot;sh688686&quot;; 带市场标识的股票代码
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: date
    * type: str
    * desc: date=&quot;20210630&quot;; 财报发布季度最后日
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
