
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_ipo_benefit_ths
    * 目标地址: http://data.10jqka.com.cn/ipo/syg/
    * 描述: 同花顺-数据中心-新股数据-IPO受益股
    * 限量: 单次返回当前交易日的所有数据; 该数据每周更新一次, 返回最近一周的数据
    */
    public class stock_ipo_benefit_thsRequest extends AkShareRequestAndResponse {
    public stock_ipo_benefit_thsRequest(){
    setInterfaceName("stock_ipo_benefit_ths");
    }

    public static String name() {
        return "stock_ipo_benefit_ths";
    }
    public String getName() {
    return "stock_ipo_benefit_ths";
    }

    public static stock_ipo_benefit_thsRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_ipo_benefit_thsRequest t = new stock_ipo_benefit_thsRequest();



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
