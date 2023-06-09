
    package com.onectrm.akshare.api.generated.macro;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_china_swap_rate
    * 目标地址: http://www.chinamoney.com.cn/chinese/bkcurvfxhis/?cfgItemType=72&amp;curveType=FR007
    * 描述: 国家统计局-FR007 利率互换曲线历史数据
    * 限量: 单次返回所有历史数据, 该接口只能获取近一年的数据的数据，其中每次只能获取一个月的数据
    */
    public class macro_china_swap_rateRequest extends AkShareRequestAndResponse {
    public macro_china_swap_rateRequest(){
    setInterfaceName("macro_china_swap_rate");
    }

    public static String name() {
        return "macro_china_swap_rate";
    }
    public String getName() {
    return "macro_china_swap_rate";
    }

    public static macro_china_swap_rateRequest of(


    String p_wu2,


    Map.Entry
    <String
    , String>... others){
    macro_china_swap_rateRequest t = new macro_china_swap_rateRequest();


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
