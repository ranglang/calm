
    package com.onectrm.akshare.api.generated.energy;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: energy
    * 接口: energy_carbon_hb
    * 目标地址: http://www.cerx.cn/dailynewsOuter/index.htm
    * 描述: 湖北碳排放权交易中心-现货交易数据-配额-每日概况
    * 限量: 返回从 2017-04-05 至今的所有历史数据
    */
    public class energy_carbon_hbRequest extends AkShareRequestAndResponse {
    public energy_carbon_hbRequest(){
    setInterfaceName("energy_carbon_hb");
    }

    public static String name() {
        return "energy_carbon_hb";
    }
    public String getName() {
    return "energy_carbon_hb";
    }

    public static energy_carbon_hbRequest of(



    Map.Entry
    <String
    , String>... others){
    energy_carbon_hbRequest t = new energy_carbon_hbRequest();



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
