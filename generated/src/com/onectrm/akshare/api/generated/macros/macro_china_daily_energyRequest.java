
    package com.onectrm.akshare.api.generated.macros;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_china_daily_energy
    * 目标地址: https://datacenter.jin10.com/reportType/dc_qihuo_energy_report
    * 描述: 获取中国日度沿海六大电库存数据, 数据区间从20160101-至今, 不再更新, 只能获得历史数据
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_daily_energyRequest extends AkShareRequestAndResponse {
    public macro_china_daily_energyRequest(){
    setInterfaceName("macro_china_daily_energy");
    }

    public static String name() {
        return "macro_china_daily_energy";
    }
    public String getName() {
    return "macro_china_daily_energy";
    }

    public static macro_china_daily_energyRequest of(


    String p_wu2,


    Map.Entry
    <String
    , String>... others){
    macro_china_daily_energyRequest t = new macro_china_daily_energyRequest();


    t.p_wu2 = p_wu2;
    t.other.put("无", p_wu2.toString());


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
