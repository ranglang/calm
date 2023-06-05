
    package com.onectrm.akshare.api.generated.macros;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_usa_business_inventories
    * 目标地址: https://datacenter.jin10.com/reportType/dc_usa_business_inventories
    * 描述: 获取美国商业库存月率报告, 数据区间从19920301-至今
    * 限量: 单次返回所有历史数据
    */
    public class macro_usa_business_inventoriesRequest extends AkShareRequestAndResponse {
    public macro_usa_business_inventoriesRequest(){
    setInterfaceName("macro_usa_business_inventories");
    }

    public static String name() {
        return "macro_usa_business_inventories";
    }
    public String getName() {
    return "macro_usa_business_inventories";
    }

    public static macro_usa_business_inventoriesRequest of(


    String p_wu2,


    Map.Entry
    <String
    , String>... others){
    macro_usa_business_inventoriesRequest t = new macro_usa_business_inventoriesRequest();


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
