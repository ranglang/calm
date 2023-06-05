
    package com.onectrm.akshare.api.generated.futures;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: futures
    * 接口: futures_shfe_warehouse_receipt
    * 目标地址: http://www.shfe.com.cn/statements/dataview.html?paramid=dailystock&amp;paramdate=20200703
    * 描述: 提供上海期货交易所指定交割仓库期货仓单日报
    * 限量: 单次返回当前交易日的所有仓单日报数据
    */
    public class futures_shfe_warehouse_receiptRequest extends AkShareRequestAndResponse {
    public futures_shfe_warehouse_receiptRequest(){
    setInterfaceName("futures_shfe_warehouse_receipt");
    }

    public static String name() {
        return "futures_shfe_warehouse_receipt";
    }
    public String getName() {
    return "futures_shfe_warehouse_receipt";
    }

    public static futures_shfe_warehouse_receiptRequest of(


    String p_tradedate,


    Map.Entry
    <String
    , String>... others){
    futures_shfe_warehouse_receiptRequest t = new futures_shfe_warehouse_receiptRequest();


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
    * name: trade_date
    * type: str
    * desc: trade_date=&quot;20200702&quot;; 交易日
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
