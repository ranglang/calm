
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_zh_b_spot
    * 目标地址: http://vip.stock.finance.sina.com.cn/mkt/#hs_b
    * 描述: B 股数据是从新浪财经获取的数据, 重复运行本函数会被新浪暂时封 IP, 建议增加时间间隔
    * 限量: 单次返回所有 B 股上市公司的实时行情数据
    */
    public class stock_zh_b_spotRequest extends AkShareRequestAndResponse {
    public stock_zh_b_spotRequest(){
    setInterfaceName("stock_zh_b_spot");
    }

    public static String name() {
        return "stock_zh_b_spot";
    }
    public String getName() {
    return "stock_zh_b_spot";
    }

    public static stock_zh_b_spotRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_zh_b_spotRequest t = new stock_zh_b_spotRequest();



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
