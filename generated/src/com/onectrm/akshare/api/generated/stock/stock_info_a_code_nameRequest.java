
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_info_a_code_name
    * 目标地址: 沪深京三个交易所
    * 描述: 沪深京 A 股股票代码和股票简称数据
    * 限量: 单次获取所有 A 股股票代码和简称数据
    */
    public class stock_info_a_code_nameRequest extends AkShareRequestAndResponse {
    public stock_info_a_code_nameRequest(){
    setInterfaceName("stock_info_a_code_name");
    }

    public static String name() {
        return "stock_info_a_code_name";
    }
    public String getName() {
    return "stock_info_a_code_name";
    }

    public static stock_info_a_code_nameRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_info_a_code_nameRequest t = new stock_info_a_code_nameRequest();



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
