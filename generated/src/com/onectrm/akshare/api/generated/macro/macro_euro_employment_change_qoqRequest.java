
    package com.onectrm.akshare.api.generated.macro;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_euro_employment_change_qoq
    * 目标地址: https://datacenter.jin10.com/reportType/dc_eurozone_employment_change_qoq
    * 描述: 获取欧元区季调后就业人数季率报告, 数据区间从20083017-至今
    * 限量: 单次返回所有历史数据
    */
    public class macro_euro_employment_change_qoqRequest extends AkShareRequestAndResponse {
    public macro_euro_employment_change_qoqRequest(){
    setInterfaceName("macro_euro_employment_change_qoq");
    }

    public static String name() {
        return "macro_euro_employment_change_qoq";
    }
    public String getName() {
    return "macro_euro_employment_change_qoq";
    }

    public static macro_euro_employment_change_qoqRequest of(


    String p_wu2,


    Map.Entry
    <String
    , String>... others){
    macro_euro_employment_change_qoqRequest t = new macro_euro_employment_change_qoqRequest();


    t.p_wu2 = p_wu2;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 无
    * type: 无
    * desc: 无
    * required: 无
    */
    private String p_wu2;

    public String getP_wu2() { return this.p_wu2;}
    public void setP_wu2(String v) { this.p_wu2 = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
