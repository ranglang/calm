
    package com.onectrm.akshare.api.generated.macro;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_china_hb
    * 目标地址: http://www.chinamoney.com.cn/chinese/hb/
    * 描述: 央行币净投放与净回笼, 数据区间从 19970310 至今, 周或则月频率
    * 限量: 单次返回指定 symbol 的所有历史数据
    */
    public class macro_china_hbRequest extends AkShareRequestAndResponse {
    public macro_china_hbRequest(){
    setInterfaceName("macro_china_hb");
    }

    public static String name() {
        return "macro_china_hb";
    }
    public String getName() {
    return "macro_china_hb";
    }

    public static macro_china_hbRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    macro_china_hbRequest t = new macro_china_hbRequest();


    t.p_symbol = p_symbol;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: symbol
    * type: str
    * desc: symbol=&quot;weekly&quot;; choice of {&quot;weekly&quot;, &quot;monthly&quot;}
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
