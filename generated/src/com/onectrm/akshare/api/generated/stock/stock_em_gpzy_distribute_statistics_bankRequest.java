
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_em_gpzy_distribute_statistics_bank
    * 目标地址: http://data.eastmoney.com/gpzy/distributeStatistics.aspx
    * 描述: 获取东方财富网-数据中心-特色数据-股权质押-质押机构分布统计-银行
    * 限量: 单次所有历史数据, 由于数据量比较大需要等待一定时间
    */
    public class stock_em_gpzy_distribute_statistics_bankRequest extends AkShareRequestAndResponse {
    public stock_em_gpzy_distribute_statistics_bankRequest(){
    setInterfaceName("stock_em_gpzy_distribute_statistics_bank");
    }

    public static String name() {
        return "stock_em_gpzy_distribute_statistics_bank";
    }
    public String getName() {
    return "stock_em_gpzy_distribute_statistics_bank";
    }

    public static stock_em_gpzy_distribute_statistics_bankRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_em_gpzy_distribute_statistics_bankRequest t = new stock_em_gpzy_distribute_statistics_bankRequest();



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
