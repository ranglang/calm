
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_us_spot_em
    * 目标地址: http://quote.eastmoney.com/center/gridlist.html#us_stocks
    * 描述: 美股实时行情数据, 从东方财富获取; 注意数据有 15 分钟延迟
    * 限量: 单次返回美股所有上市公司的实时行情数据
    */
    public class stock_us_spot_emRequest extends AkShareRequestAndResponse {
    public stock_us_spot_emRequest(){
    setInterfaceName("stock_us_spot_em");
    }

    public static String name() {
        return "stock_us_spot_em";
    }
    public String getName() {
    return "stock_us_spot_em";
    }

    public static stock_us_spot_emRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_us_spot_emRequest t = new stock_us_spot_emRequest();



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
