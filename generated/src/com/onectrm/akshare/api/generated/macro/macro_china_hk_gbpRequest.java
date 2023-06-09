
    package com.onectrm.akshare.api.generated.macro;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_china_hk_gbp
    * 目标地址: https://data.eastmoney.com/cjsj/foreign_8_3.html
    * 描述: 东方财富-经济数据一览-中国香港-香港 GDP
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_hk_gbpRequest extends AkShareRequestAndResponse {
    public macro_china_hk_gbpRequest(){
    setInterfaceName("macro_china_hk_gbp");
    }

    public static String name() {
        return "macro_china_hk_gbp";
    }
    public String getName() {
    return "macro_china_hk_gbp";
    }

    public static macro_china_hk_gbpRequest of(


    String p_wu2,


    Map.Entry
    <String
    , String>... others){
    macro_china_hk_gbpRequest t = new macro_china_hk_gbpRequest();


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
