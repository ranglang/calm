
    package com.onectrm.akshare.api.generated.others;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: others
    * 接口: air_city_table
    * 目标地址: https://www.aqistudy.cn/
    * 描述: 所有能获取空气质量数据的城市表
    * 限量: 单次返回所有可以获取的城市表数据
    */
    public class air_city_tableRequest extends AkShareRequestAndResponse {
    public air_city_tableRequest(){
    setInterfaceName("air_city_table");
    }

    public static String name() {
        return "air_city_table";
    }
    public String getName() {
    return "air_city_table";
    }

    public static air_city_tableRequest of(



    Map.Entry
    <String
    , String>... others){
    air_city_tableRequest t = new air_city_tableRequest();



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
