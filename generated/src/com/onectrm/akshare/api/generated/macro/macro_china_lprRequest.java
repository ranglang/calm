
    package com.onectrm.akshare.api.generated.macro;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_china_lpr
    * 目标地址: http://data.eastmoney.com/cjsj/globalRateLPR.html
    * 描述: 中国 LPR 品种数据, 数据区间从 19910421-至今
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_lprRequest extends AkShareRequestAndResponse {
    public macro_china_lprRequest(){
    setInterfaceName("macro_china_lpr");
    }

    public static String name() {
        return "macro_china_lpr";
    }
    public String getName() {
    return "macro_china_lpr";
    }

    public static macro_china_lprRequest of(



    Map.Entry
    <String
    , String>... others){
    macro_china_lprRequest t = new macro_china_lprRequest();



    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }




    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
