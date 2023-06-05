
    package com.onectrm.akshare.api.generated.energy;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: energy
    * 接口: energy_carbon_bj
    * 目标地址: https://www.bjets.com.cn/article/jyxx/
    * 描述: 北京市碳排放权电子交易平台-北京市碳排放权公开交易行情
    * 限量: 全部历史数据
    */
    public class energy_carbon_bjRequest extends AkShareRequestAndResponse {
    public energy_carbon_bjRequest(){
    setInterfaceName("energy_carbon_bj");
    }

    public static String name() {
        return "energy_carbon_bj";
    }
    public String getName() {
    return "energy_carbon_bj";
    }

    public static energy_carbon_bjRequest of(



    Map.Entry
    <String
    , String>... others){
    energy_carbon_bjRequest t = new energy_carbon_bjRequest();



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
