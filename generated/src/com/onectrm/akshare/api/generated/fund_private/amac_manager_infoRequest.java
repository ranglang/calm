
    package com.onectrm.akshare.api.generated.fund_private;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fund_private
    * 接口: amac_manager_info
    * 目标地址: http://gs.amac.org.cn/amac-infodisc/res/pof/manager/index.html
    * 描述: 中国证券投资基金业协会-信息公示-私募基金管理人公示-私募基金管理人综合查询
    * 限量: 单次返回当前时刻所有历史数据
    */
    public class amac_manager_infoRequest extends AkShareRequestAndResponse {
    public amac_manager_infoRequest(){
    setInterfaceName("amac_manager_info");
    }

    public static String name() {
        return "amac_manager_info";
    }
    public String getName() {
    return "amac_manager_info";
    }

    public static amac_manager_infoRequest of(



    Map.Entry
    <String
    , String>... others){
    amac_manager_infoRequest t = new amac_manager_infoRequest();



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
