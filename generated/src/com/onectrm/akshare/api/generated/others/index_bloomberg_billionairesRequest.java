
    package com.onectrm.akshare.api.generated.others;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: others
    * 接口: index_bloomberg_billionaires
    * 目标地址: https://www.bloomberg.com/billionaires/
    * 描述: 彭博亿万富豪指数, 全球前 500 名; 该接口需要使用代理访问
    * 限量: 单次返回所有数据彭博亿万富豪排名数据
    */
    public class index_bloomberg_billionairesRequest extends AkShareRequestAndResponse {
    public index_bloomberg_billionairesRequest(){
    setInterfaceName("index_bloomberg_billionaires");
    }

    public static String name() {
        return "index_bloomberg_billionaires";
    }
    public String getName() {
    return "index_bloomberg_billionaires";
    }

    public static index_bloomberg_billionairesRequest of(



    Map.Entry
    <String
    , String>... others){
    index_bloomberg_billionairesRequest t = new index_bloomberg_billionairesRequest();



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
