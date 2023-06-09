
    package com.onectrm.akshare.api.generated.macros;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_china_foreign_exchange_gold
    * 目标地址: http://finance.sina.com.cn/mac/#fininfo-5-0-31-2
    * 描述: 国家统计局-央行黄金和外汇储备, 比东财接口数据时间长
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_foreign_exchange_goldRequest extends AkShareRequestAndResponse {
    public macro_china_foreign_exchange_goldRequest(){
    setInterfaceName("macro_china_foreign_exchange_gold");
    }

    public static String name() {
        return "macro_china_foreign_exchange_gold";
    }
    public String getName() {
    return "macro_china_foreign_exchange_gold";
    }

    public static macro_china_foreign_exchange_goldRequest of(


    String p_wu2,


    Map.Entry
    <String
    , String>... others){
    macro_china_foreign_exchange_goldRequest t = new macro_china_foreign_exchange_goldRequest();


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
