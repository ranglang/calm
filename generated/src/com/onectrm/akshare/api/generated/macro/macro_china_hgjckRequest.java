
    package com.onectrm.akshare.api.generated.macro;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_china_hgjck
    * 目标地址: http://data.eastmoney.com/cjsj/hgjck.html
    * 描述: 获取中国海关进出口增减情况一览表, 数据区间从 200801 至今, 月度数据
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_hgjckRequest extends AkShareRequestAndResponse {
    public macro_china_hgjckRequest(){
    setInterfaceName("macro_china_hgjck");
    }

    public static String name() {
        return "macro_china_hgjck";
    }
    public String getName() {
    return "macro_china_hgjck";
    }

    public static macro_china_hgjckRequest of(


    String p_wu2,


    Map.Entry
    <String
    , String>... others){
    macro_china_hgjckRequest t = new macro_china_hgjckRequest();


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
