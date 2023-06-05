
    package com.onectrm.akshare.api.generated.macros;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_china_shrzgm
    * 目标地址: http://data.mofcom.gov.cn/gnmy/shrzgm.shtml
    * 描述: 商务数据中心-国内贸易-社会融资规模增量统计, 数据区间从 201501-至今
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_shrzgmRequest extends AkShareRequestAndResponse {
    public macro_china_shrzgmRequest(){
    setInterfaceName("macro_china_shrzgm");
    }

    public static String name() {
        return "macro_china_shrzgm";
    }
    public String getName() {
    return "macro_china_shrzgm";
    }

    public static macro_china_shrzgmRequest of(



    Map.Entry
    <String
    , String>... others){
    macro_china_shrzgmRequest t = new macro_china_shrzgmRequest();



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
