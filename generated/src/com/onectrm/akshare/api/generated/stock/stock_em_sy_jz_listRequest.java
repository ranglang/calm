
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_em_sy_jz_list
    * 目标地址: http://data.eastmoney.com/sy/jzlist.html
    * 描述: 获取东方财富网-数据中心-特色数据-商誉-个股商誉减值明细
    * 限量: 单次所有历史数据, 由于数据量比较大需要等待一定时间
    */
    public class stock_em_sy_jz_listRequest extends AkShareRequestAndResponse {
    public stock_em_sy_jz_listRequest(){
    setInterfaceName("stock_em_sy_jz_list");
    }

    public static String name() {
        return "stock_em_sy_jz_list";
    }
    public String getName() {
    return "stock_em_sy_jz_list";
    }

    public static stock_em_sy_jz_listRequest of(


    String p_symbol,

    String p_tradedate,


    Map.Entry
    <String
    , String>... others){
    stock_em_sy_jz_listRequest t = new stock_em_sy_jz_listRequest();


    t.p_symbol = p_symbol;
    t.other.put("symbol", p_symbol.toString());

    t.p_tradedate = p_tradedate;
    t.other.put("trade_date", p_tradedate.toString());


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
    * desc: symbol=&quot;沪市主板&quot;; 参见网页选项
    * required: Y
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: trade_date
    * type: str
    * desc: trade_date=&quot;2019-12-31&quot;; 参见网页选项
    * required: Y
    */
    private String p_tradedate;

    public String getP_tradedate() { return this.p_tradedate;}
    public void setP_tradedate(String v) { this.p_tradedate = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
