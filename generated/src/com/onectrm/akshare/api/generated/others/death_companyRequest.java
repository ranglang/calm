
    package com.onectrm.akshare.api.generated.others;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: others
    * 接口: death_company
    * 目标地址: https://www.itjuzi.com/deathCompany
    * 描述: 新经济死亡公司数据库
    * 限量: 返回所有历史数据
    */
    public class death_companyRequest extends AkShareRequestAndResponse {
    public death_companyRequest(){
    setInterfaceName("death_company");
    }

    public static String name() {
        return "death_company";
    }
    public String getName() {
    return "death_company";
    }

    public static death_companyRequest of(



    Map.Entry
    <String
    , String>... others){
    death_companyRequest t = new death_companyRequest();



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
