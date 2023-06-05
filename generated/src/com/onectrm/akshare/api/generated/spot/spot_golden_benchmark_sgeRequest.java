
    package com.onectrm.akshare.api.generated.spot;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: spot
    * 接口: spot_golden_benchmark_sge
    * 目标地址: https://www.sge.com.cn/sjzx/jzj
    * 描述: 上海黄金交易所-数据资讯-上海金基准价-历史数据
    * 限量: 单次返回所有历史数据
    */
    public class spot_golden_benchmark_sgeRequest extends AkShareRequestAndResponse {
    public spot_golden_benchmark_sgeRequest(){
    setInterfaceName("spot_golden_benchmark_sge");
    }

    public static String name() {
        return "spot_golden_benchmark_sge";
    }
    public String getName() {
    return "spot_golden_benchmark_sge";
    }

    public static spot_golden_benchmark_sgeRequest of(



    Map.Entry
    <String
    , String>... others){
    spot_golden_benchmark_sgeRequest t = new spot_golden_benchmark_sgeRequest();



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
