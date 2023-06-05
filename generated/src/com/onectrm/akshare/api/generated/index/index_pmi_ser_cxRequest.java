
    package com.onectrm.akshare.api.generated.index;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: index
    * 接口: index_pmi_ser_cx
    * 目标地址: https://s.ccxe.com.cn/indices/pmi
    * 描述: 财新数据-指数报告-财新中国 PMI-服务业 PMI
    * 限量: 该接口返回所有历史数据
    */
    public class index_pmi_ser_cxRequest extends AkShareRequestAndResponse {
    public index_pmi_ser_cxRequest(){
    setInterfaceName("index_pmi_ser_cx");
    }

    public static String name() {
        return "index_pmi_ser_cx";
    }
    public String getName() {
    return "index_pmi_ser_cx";
    }

    public static index_pmi_ser_cxRequest of(



    Map.Entry
    <String
    , String>... others){
    index_pmi_ser_cxRequest t = new index_pmi_ser_cxRequest();



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
