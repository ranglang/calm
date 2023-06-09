
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_dividents_cninfo
    * 目标地址: http://webapi.cninfo.com.cn/#/company?companyid=600009
    * 描述: 巨潮资讯-个股-历史分红
    * 限量: 单次获取指定股票的历史分红数据
    */
    public class stock_dividents_cninfoRequest extends AkShareRequestAndResponse {
    public stock_dividents_cninfoRequest(){
    setInterfaceName("stock_dividents_cninfo");
    }

    public static String name() {
        return "stock_dividents_cninfo";
    }
    public String getName() {
    return "stock_dividents_cninfo";
    }

    public static stock_dividents_cninfoRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    stock_dividents_cninfoRequest t = new stock_dividents_cninfoRequest();


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
    * desc: symbol=&quot;600009&quot;
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
