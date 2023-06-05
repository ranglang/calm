
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_us_spot
    * 目标地址: http://finance.sina.com.cn/stock/usstock/sector.shtml
    * 描述: 新浪财经-美股; 获取的数据有 15 分钟延迟; 建议使用 ak.stock_us_spot_em() 来获取数据
    * 限量: 单次返回美股所有上市公司的实时行情数据
    */
    public class stock_us_spotRequest extends AkShareRequestAndResponse {
    public stock_us_spotRequest(){
    setInterfaceName("stock_us_spot");
    }

    public static String name() {
        return "stock_us_spot";
    }
    public String getName() {
    return "stock_us_spot";
    }

    public static stock_us_spotRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_us_spotRequest t = new stock_us_spotRequest();



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
