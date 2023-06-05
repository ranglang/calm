
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_rank_cxfl_ths
    * 目标地址: http://data.10jqka.com.cn/rank/cxfl/
    * 描述: 同花顺-数据中心-技术选股-持续放量
    * 限量: 单次返回所有数据
    */
    public class stock_rank_cxfl_thsRequest extends AkShareRequestAndResponse {
    public stock_rank_cxfl_thsRequest(){
    setInterfaceName("stock_rank_cxfl_ths");
    }

    public static String name() {
        return "stock_rank_cxfl_ths";
    }
    public String getName() {
    return "stock_rank_cxfl_ths";
    }

    public static stock_rank_cxfl_thsRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_rank_cxfl_thsRequest t = new stock_rank_cxfl_thsRequest();



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
