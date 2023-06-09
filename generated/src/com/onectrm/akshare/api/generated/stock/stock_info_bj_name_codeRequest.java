
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_info_bj_name_code
    * 目标地址: http://www.bse.cn/nq/listedcompany.html
    * 描述: 北京证券交易所股票代码和简称数据
    * 限量: 单次获取北京证券交易所所有的股票代码和简称数据
    */
    public class stock_info_bj_name_codeRequest extends AkShareRequestAndResponse {
    public stock_info_bj_name_codeRequest(){
    setInterfaceName("stock_info_bj_name_code");
    }

    public static String name() {
        return "stock_info_bj_name_code";
    }
    public String getName() {
    return "stock_info_bj_name_code";
    }

    public static stock_info_bj_name_codeRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_info_bj_name_codeRequest t = new stock_info_bj_name_codeRequest();



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
