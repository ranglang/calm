
    package com.onectrm.akshare.api.generated.fund_private;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fund_private
    * 接口: amac_manager_cancelled_info
    * 目标地址: http://gs.amac.org.cn/amac-infodisc/res/cancelled/manager/index.html
    * 描述: 获取中国证券投资基金业协会-信息公示-诚信信息-已注销私募基金管理人名单
    * 限量: 单次返回当前时刻所有历史数据
    */
    public class amac_manager_cancelled_infoRequest extends AkShareRequestAndResponse {
    public amac_manager_cancelled_infoRequest(){
    setInterfaceName("amac_manager_cancelled_info");
    }

    public static String name() {
        return "amac_manager_cancelled_info";
    }
    public String getName() {
    return "amac_manager_cancelled_info";
    }

    public static amac_manager_cancelled_infoRequest of(



    Map.Entry
    <String
    , String>... others){
    amac_manager_cancelled_infoRequest t = new amac_manager_cancelled_infoRequest();



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
