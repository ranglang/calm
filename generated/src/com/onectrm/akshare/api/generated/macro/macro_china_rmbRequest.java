
    package com.onectrm.akshare.api.generated.macro;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_china_rmb
    * 目标地址: https://datacenter.jin10.com/reportType/dc_rmb_data
    * 描述: 中国人民币汇率中间价报告, 数据区间从 20170103-20210513
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_rmbRequest extends AkShareRequestAndResponse {
    public macro_china_rmbRequest(){
    setInterfaceName("macro_china_rmb");
    }

    public static String name() {
        return "macro_china_rmb";
    }
    public String getName() {
    return "macro_china_rmb";
    }

    public static macro_china_rmbRequest of(



    Map.Entry
    <String
    , String>... others){
    macro_china_rmbRequest t = new macro_china_rmbRequest();



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
