
    package com.onectrm.akshare.api.generated.fund_private;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fund_private
    * 接口: amac_person_bond_org_list
    * 目标地址: http://gs.amac.org.cn/amac-infodisc/res/pof/person/personOrgList.html
    * 描述: 中国证券投资基金业协会-信息公示-从业人员信息-债券投资交易相关人员公示
    * 限量: 单次返回当前时刻所有历史数据
    */
    public class amac_person_bond_org_listRequest extends AkShareRequestAndResponse {
    public amac_person_bond_org_listRequest(){
    setInterfaceName("amac_person_bond_org_list");
    }

    public static String name() {
        return "amac_person_bond_org_list";
    }
    public String getName() {
    return "amac_person_bond_org_list";
    }

    public static amac_person_bond_org_listRequest of(



    Map.Entry
    <String
    , String>... others){
    amac_person_bond_org_listRequest t = new amac_person_bond_org_listRequest();



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
