
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_zh_kcb_spot
    * 目标地址: http://vip.stock.finance.sina.com.cn/mkt/#kcb
    * 描述: 新浪财经-科创板股票实时行情数据
    * 限量: 单次返回所有科创板上市公司的实时行情数据; 请控制采集的频率, 大量抓取容易封IP
    */
    public class stock_zh_kcb_spotRequest extends AkShareRequestAndResponse {
    public stock_zh_kcb_spotRequest(){
    setInterfaceName("stock_zh_kcb_spot");
    }

    public static String name() {
        return "stock_zh_kcb_spot";
    }
    public String getName() {
    return "stock_zh_kcb_spot";
    }

    public static stock_zh_kcb_spotRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_zh_kcb_spotRequest t = new stock_zh_kcb_spotRequest();



    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }




    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
