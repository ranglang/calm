
    package com.onectrm.akshare.api.generated.hf;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: hf
    * 接口: hf_sp_500
    * 目标地址: https://github.com/FutureSharks/financial-data
    * 描述: 获取标普 500 指数的分钟数据, 由于数据量比较大, 需要等待, 由于服务器在国外, 建议使用代理访问
    * 限量: 
    */
    public class hf_sp_500Request extends AkShareRequestAndResponse {
    public hf_sp_500Request(){
    setInterfaceName("hf_sp_500");
    }

    public static String name() {
        return "hf_sp_500";
    }
    public String getName() {
    return "hf_sp_500";
    }

    public static hf_sp_500Request of(



    Map.Entry
    <String
    , String>... others){
    hf_sp_500Request t = new hf_sp_500Request();



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
