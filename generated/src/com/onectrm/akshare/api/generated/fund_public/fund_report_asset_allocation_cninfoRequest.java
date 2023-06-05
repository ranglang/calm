
    package com.onectrm.akshare.api.generated.fund_public;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fund_public
    * 接口: fund_report_asset_allocation_cninfo
    * 目标地址: http://webapi.cninfo.com.cn/#/thematicStatistics
    * 描述: 巨潮资讯-数据中心-专题统计-基金报表-基金资产配置
    * 限量: 返回所有基金资产配置数据
    */
    public class fund_report_asset_allocation_cninfoRequest extends AkShareRequestAndResponse {
    public fund_report_asset_allocation_cninfoRequest(){
    setInterfaceName("fund_report_asset_allocation_cninfo");
    }

    public static String name() {
        return "fund_report_asset_allocation_cninfo";
    }
    public String getName() {
    return "fund_report_asset_allocation_cninfo";
    }

    public static fund_report_asset_allocation_cninfoRequest of(



    Map.Entry
    <String
    , String>... others){
    fund_report_asset_allocation_cninfoRequest t = new fund_report_asset_allocation_cninfoRequest();



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
