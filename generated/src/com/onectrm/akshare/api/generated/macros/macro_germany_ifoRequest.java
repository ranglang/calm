
    package com.onectrm.akshare.api.generated.macros;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_germany_ifo
    * 目标地址: http://data.eastmoney.com/cjsj/foreign_1_0.html
    * 描述: 获取IFO商业景气指数
    * 限量: 单次返回所有历史数据
    */
    public class macro_germany_ifoRequest extends AkShareRequestAndResponse {
    public macro_germany_ifoRequest(){
    setInterfaceName("macro_germany_ifo");
    }

    public static String name() {
        return "macro_germany_ifo";
    }
    public String getName() {
    return "macro_germany_ifo";
    }

    public static macro_germany_ifoRequest of(


    String p_wu2,


    Map.Entry
    <String
    , String>... others){
    macro_germany_ifoRequest t = new macro_germany_ifoRequest();


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
