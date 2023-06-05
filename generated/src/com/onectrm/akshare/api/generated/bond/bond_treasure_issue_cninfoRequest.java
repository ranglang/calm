
    package com.onectrm.akshare.api.generated.bond;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: bond
    * 接口: bond_treasure_issue_cninfo
    * 目标地址: http://webapi.cninfo.com.cn/#/thematicStatistics
    * 描述: 巨潮资讯-数据中心-专题统计-债券报表-债券发行-国债发行
    * 限量: 
    */
    public class bond_treasure_issue_cninfoRequest extends AkShareRequestAndResponse {
    public bond_treasure_issue_cninfoRequest(){
    setInterfaceName("bond_treasure_issue_cninfo");
    }

    public static String name() {
        return "bond_treasure_issue_cninfo";
    }
    public String getName() {
    return "bond_treasure_issue_cninfo";
    }

    public static bond_treasure_issue_cninfoRequest of(



    Map.Entry
    <String
    , String>... others){
    bond_treasure_issue_cninfoRequest t = new bond_treasure_issue_cninfoRequest();



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
