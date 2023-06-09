
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_zh_a_spot
    * 目标地址: http://vip.stock.finance.sina.com.cn/mkt/#hs_a
    * 描述: 新浪财经-沪深京 A 股数据, 重复运行本函数会被新浪暂时封 IP, 建议增加时间间隔
    * 限量: 单次返回沪深京 A 股上市公司的实时行情数据
    */
    public class stock_zh_a_spotRequest extends AkShareRequestAndResponse {
    public stock_zh_a_spotRequest(){
    setInterfaceName("stock_zh_a_spot");
    }

    public static String name() {
        return "stock_zh_a_spot";
    }
    public String getName() {
    return "stock_zh_a_spot";
    }

    public static stock_zh_a_spotRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_zh_a_spotRequest t = new stock_zh_a_spotRequest();



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
