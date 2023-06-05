
    package com.onectrm.akshare.api.generated.index;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: index
    * 接口: index_awpr_cx
    * 目标地址: https://s.ccxe.com.cn/indices/nei
    * 描述: 财新指数-新经济入职工资溢价水平
    * 限量: 该接口返回所有历史数据
    */
    public class index_awpr_cxRequest extends AkShareRequestAndResponse {
    public index_awpr_cxRequest(){
    setInterfaceName("index_awpr_cx");
    }

    public static String name() {
        return "index_awpr_cx";
    }
    public String getName() {
    return "index_awpr_cx";
    }

    public static index_awpr_cxRequest of(



    Map.Entry
    <String
    , String>... others){
    index_awpr_cxRequest t = new index_awpr_cxRequest();



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
