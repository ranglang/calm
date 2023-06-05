
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_zh_a_new
    * 目标地址: http://vip.stock.finance.sina.com.cn/mkt/#new_stock
    * 描述: 新浪财经-行情中心-沪深股市-次新股
    * 限量: 单次返回所有次新股行情数据, 由于次新股名单随着交易日变化而变化，只能获取最近交易日的数据
    */
    public class stock_zh_a_newRequest extends AkShareRequestAndResponse {
    public stock_zh_a_newRequest(){
    setInterfaceName("stock_zh_a_new");
    }

    public static String name() {
        return "stock_zh_a_new";
    }
    public String getName() {
    return "stock_zh_a_new";
    }

    public static stock_zh_a_newRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_zh_a_newRequest t = new stock_zh_a_newRequest();



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
