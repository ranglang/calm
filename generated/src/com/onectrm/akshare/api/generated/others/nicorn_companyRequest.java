
    package com.onectrm.akshare.api.generated.others;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: others
    * 接口: nicorn_company
    * 目标地址: https://www.itjuzi.com/unicorn
    * 描述: 获取独角兽公司数据库, 该数据未更新
    * 限量: 返回所有历史数据, 该数据未更新
    */
    public class nicorn_companyRequest extends AkShareRequestAndResponse {
    public nicorn_companyRequest(){
    setInterfaceName("nicorn_company");
    }

    public static String name() {
        return "nicorn_company";
    }
    public String getName() {
    return "nicorn_company";
    }

    public static nicorn_companyRequest of(



    Map.Entry
    <String
    , String>... others){
    nicorn_companyRequest t = new nicorn_companyRequest();



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
