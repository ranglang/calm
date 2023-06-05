
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_em_gpzy_distribute_statistics_company
    * 目标地址: http://data.eastmoney.com/gpzy/distributeStatistics.aspx
    * 描述: 获取东方财富网-数据中心-特色数据-股权质押-质押机构分布统计-证券公司
    * 限量: 单次所有历史数据, 由于数据量比较大需要等待一定时间
    */
    public class stock_em_gpzy_distribute_statistics_companyRequest extends AkShareRequestAndResponse {
    public stock_em_gpzy_distribute_statistics_companyRequest(){
    setInterfaceName("stock_em_gpzy_distribute_statistics_company");
    }

    public static String name() {
        return "stock_em_gpzy_distribute_statistics_company";
    }
    public String getName() {
    return "stock_em_gpzy_distribute_statistics_company";
    }

    public static stock_em_gpzy_distribute_statistics_companyRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_em_gpzy_distribute_statistics_companyRequest t = new stock_em_gpzy_distribute_statistics_companyRequest();



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
