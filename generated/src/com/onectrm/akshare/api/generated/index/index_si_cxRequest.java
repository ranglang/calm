
    package com.onectrm.akshare.api.generated.index;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: index
    * 接口: index_si_cx
    * 目标地址: https://s.ccxe.com.cn/indices/dei
    * 描述: 财新指数-溢出指数
    * 限量: 该接口返回所有历史数据
    */
    public class index_si_cxRequest extends AkShareRequestAndResponse {
    public index_si_cxRequest(){
    setInterfaceName("index_si_cx");
    }

    public static String name() {
        return "index_si_cx";
    }
    public String getName() {
    return "index_si_cx";
    }

    public static index_si_cxRequest of(



    Map.Entry
    <String
    , String>... others){
    index_si_cxRequest t = new index_si_cxRequest();



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
