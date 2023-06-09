
    package com.onectrm.akshare.api.generated.energy;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: energy
    * 接口: energy_carbon_sz
    * 目标地址: http://www.cerx.cn/dailynewsCN/index.htm
    * 描述: 深圳碳排放交易所-国内碳情
    * 限量: 全部历史数据
    */
    public class energy_carbon_szRequest extends AkShareRequestAndResponse {
    public energy_carbon_szRequest(){
    setInterfaceName("energy_carbon_sz");
    }

    public static String name() {
        return "energy_carbon_sz";
    }
    public String getName() {
    return "energy_carbon_sz";
    }

    public static energy_carbon_szRequest of(



    Map.Entry
    <String
    , String>... others){
    energy_carbon_szRequest t = new energy_carbon_szRequest();



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
