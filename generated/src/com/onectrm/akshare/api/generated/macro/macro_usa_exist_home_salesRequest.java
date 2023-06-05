
    package com.onectrm.akshare.api.generated.macro;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_usa_exist_home_sales
    * 目标地址: https://datacenter.jin10.com/reportType/dc_usa_exist_home_sales
    * 描述: 获取美国成屋销售总数年化报告, 数据区间从19700101-至今
    * 限量: 单次返回所有历史数据
    */
    public class macro_usa_exist_home_salesRequest extends AkShareRequestAndResponse {
    public macro_usa_exist_home_salesRequest(){
    setInterfaceName("macro_usa_exist_home_sales");
    }

    public static String name() {
        return "macro_usa_exist_home_sales";
    }
    public String getName() {
    return "macro_usa_exist_home_sales";
    }

    public static macro_usa_exist_home_salesRequest of(


    String p_wu2,


    Map.Entry
    <String
    , String>... others){
    macro_usa_exist_home_salesRequest t = new macro_usa_exist_home_salesRequest();


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
