
    package com.onectrm.akshare.api.generated.macro;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_china_freight_index
    * 目标地址: http://finance.sina.com.cn/mac/#industry-22-0-31-2
    * 描述: 国家统计局-航贸运价指数
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_freight_indexRequest extends AkShareRequestAndResponse {
    public macro_china_freight_indexRequest(){
    setInterfaceName("macro_china_freight_index");
    }

    public static String name() {
        return "macro_china_freight_index";
    }
    public String getName() {
    return "macro_china_freight_index";
    }

    public static macro_china_freight_indexRequest of(


    String p_wu2,


    Map.Entry
    <String
    , String>... others){
    macro_china_freight_indexRequest t = new macro_china_freight_indexRequest();


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
    * required: 
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