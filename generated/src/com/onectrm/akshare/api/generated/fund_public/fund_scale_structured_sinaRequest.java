
    package com.onectrm.akshare.api.generated.fund_public;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fund_public
    * 接口: fund_scale_structured_sina
    * 目标地址: http://vip.stock.finance.sina.com.cn/fund_center/index.html#jjhqetf
    * 描述: 基金数据中心-基金规模-分级子基金
    * 限量: 单次返回所有分级子基金的基金规模数据
    */
    public class fund_scale_structured_sinaRequest extends AkShareRequestAndResponse {
    public fund_scale_structured_sinaRequest(){
    setInterfaceName("fund_scale_structured_sina");
    }

    public static String name() {
        return "fund_scale_structured_sina";
    }
    public String getName() {
    return "fund_scale_structured_sina";
    }

    public static fund_scale_structured_sinaRequest of(



    Map.Entry
    <String
    , String>... others){
    fund_scale_structured_sinaRequest t = new fund_scale_structured_sinaRequest();



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
