
    package com.onectrm.akshare.api.generated.fund_private;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fund_private
    * 接口: amac_fund_abs
    * 目标地址: https://gs.amac.org.cn/amac-infodisc/res/fund/abs/index.html
    * 描述: 中国证券投资基金业协会-信息公示-产品公示-资产支持专项计划
    * 限量: 单次返回当前时刻所有历史数据
    */
    public class amac_fund_absRequest extends AkShareRequestAndResponse {
    public amac_fund_absRequest(){
    setInterfaceName("amac_fund_abs");
    }

    public static String name() {
        return "amac_fund_abs";
    }
    public String getName() {
    return "amac_fund_abs";
    }

    public static amac_fund_absRequest of(



    Map.Entry
    <String
    , String>... others){
    amac_fund_absRequest t = new amac_fund_absRequest();



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
