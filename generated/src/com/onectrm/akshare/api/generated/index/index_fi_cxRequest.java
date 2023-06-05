
    package com.onectrm.akshare.api.generated.index;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: index
    * 接口: index_fi_cx
    * 目标地址: https://s.ccxe.com.cn/indices/dei
    * 描述: 财新指数-融合指数
    * 限量: 该接口返回所有历史数据
    */
    public class index_fi_cxRequest extends AkShareRequestAndResponse {
    public index_fi_cxRequest(){
    setInterfaceName("index_fi_cx");
    }

    public static String name() {
        return "index_fi_cx";
    }
    public String getName() {
    return "index_fi_cx";
    }

    public static index_fi_cxRequest of(



    Map.Entry
    <String
    , String>... others){
    index_fi_cxRequest t = new index_fi_cxRequest();



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
