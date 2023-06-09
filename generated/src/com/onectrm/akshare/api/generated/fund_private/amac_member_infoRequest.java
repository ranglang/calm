
    package com.onectrm.akshare.api.generated.fund_private;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fund_private
    * 接口: amac_member_info
    * 目标地址: http://gs.amac.org.cn/amac-infodisc/res/pof/member/index.html
    * 描述: 获取中国证券投资基金业协会-信息公示-会员信息-会员机构综合查询
    * 限量: 单次返回当前时刻所有历史数据
    */
    public class amac_member_infoRequest extends AkShareRequestAndResponse {
    public amac_member_infoRequest(){
    setInterfaceName("amac_member_info");
    }

    public static String name() {
        return "amac_member_info";
    }
    public String getName() {
    return "amac_member_info";
    }

    public static amac_member_infoRequest of(



    Map.Entry
    <String
    , String>... others){
    amac_member_infoRequest t = new amac_member_infoRequest();



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
