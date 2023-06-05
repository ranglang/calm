
    package com.onectrm.akshare.api.generated.energy;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: energy
    * 接口: energy_carbon_gz
    * 目标地址: http://www.cnemission.com/article/hqxx/
    * 描述: 广州碳排放权交易中心-行情信息
    * 限量: 该接口返回从 2013-12-19 至今的所有历史数据
    */
    public class energy_carbon_gzRequest extends AkShareRequestAndResponse {
    public energy_carbon_gzRequest(){
    setInterfaceName("energy_carbon_gz");
    }

    public static String name() {
        return "energy_carbon_gz";
    }
    public String getName() {
    return "energy_carbon_gz";
    }

    public static energy_carbon_gzRequest of(



    Map.Entry
    <String
    , String>... others){
    energy_carbon_gzRequest t = new energy_carbon_gzRequest();



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
