
    package com.onectrm.akshare.api.generated.energy;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: energy
    * 接口: energy_carbon_eu
    * 目标地址: http://www.cerx.cn/dailynewsOuter/index.htm
    * 描述: 深圳碳排放交易所-国际碳情
    * 限量: 返回从 2018-03-13 至 2020-04-29 的所有历史数据
    */
    public class energy_carbon_euRequest extends AkShareRequestAndResponse {
    public energy_carbon_euRequest(){
    setInterfaceName("energy_carbon_eu");
    }

    public static String name() {
        return "energy_carbon_eu";
    }
    public String getName() {
    return "energy_carbon_eu";
    }

    public static energy_carbon_euRequest of(



    Map.Entry
    <String
    , String>... others){
    energy_carbon_euRequest t = new energy_carbon_euRequest();



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
