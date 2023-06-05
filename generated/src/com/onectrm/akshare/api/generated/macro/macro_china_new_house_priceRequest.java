
    package com.onectrm.akshare.api.generated.macro;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_china_new_house_price
    * 目标地址: http://data.eastmoney.com/cjsj/newhouse.html
    * 描述: 获取中国新房价指数月度数据, 数据区间从 201101-至今
    * 限量: 单次返回所有历史数据, 目前该指数由上海和北京房价构成
    */
    public class macro_china_new_house_priceRequest extends AkShareRequestAndResponse {
    public macro_china_new_house_priceRequest(){
    setInterfaceName("macro_china_new_house_price");
    }

    public static String name() {
        return "macro_china_new_house_price";
    }
    public String getName() {
    return "macro_china_new_house_price";
    }

    public static macro_china_new_house_priceRequest of(


    String p_wu2,


    Map.Entry
    <String
    , String>... others){
    macro_china_new_house_priceRequest t = new macro_china_new_house_priceRequest();


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
