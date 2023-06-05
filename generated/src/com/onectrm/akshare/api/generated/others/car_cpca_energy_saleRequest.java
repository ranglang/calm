
    package com.onectrm.akshare.api.generated.others;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: others
    * 接口: car_cpca_energy_sale
    * 目标地址: http://data.cpcaauto.com/FuelMarket
    * 描述: 乘联会-新能源细分市场汽车销量数据
    * 限量: 单次返回本年度和上年度月份的销量数据
    */
    public class car_cpca_energy_saleRequest extends AkShareRequestAndResponse {
    public car_cpca_energy_saleRequest(){
    setInterfaceName("car_cpca_energy_sale");
    }

    public static String name() {
        return "car_cpca_energy_sale";
    }
    public String getName() {
    return "car_cpca_energy_sale";
    }

    public static car_cpca_energy_saleRequest of(



    Map.Entry
    <String
    , String>... others){
    car_cpca_energy_saleRequest t = new car_cpca_energy_saleRequest();



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
