
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_zygc_ym
    * 目标地址: http://f10.emoney.cn/f10/zbyz/1000001
    * 描述: 益盟-F10-主营构成
    * 限量: 单次返回所有历史数据
    */
    public class stock_zygc_ymRequest extends AkShareRequestAndResponse {
    public stock_zygc_ymRequest(){
    setInterfaceName("stock_zygc_ym");
    }

    public static String name() {
        return "stock_zygc_ym";
    }
    public String getName() {
    return "stock_zygc_ym";
    }

    public static stock_zygc_ymRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    stock_zygc_ymRequest t = new stock_zygc_ymRequest();


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
