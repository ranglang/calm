
    package com.onectrm.akshare.api.generated.option;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: option
    * 接口: option_risk_indicator_sse
    * 目标地址: http://www.sse.com.cn/assortment/options/risk/
    * 描述: 上海证券交易所-产品-股票期权-期权风险指标数据
    * 限量: 单次返回指定 date 的数据
    */
    public class option_risk_indicator_sseRequest extends AkShareRequestAndResponse {
    public option_risk_indicator_sseRequest(){
    setInterfaceName("option_risk_indicator_sse");
    }

    public static String name() {
        return "option_risk_indicator_sse";
    }
    public String getName() {
    return "option_risk_indicator_sse";
    }

    public static option_risk_indicator_sseRequest of(


    String p_date,


    Map.Entry
    <String
    , String>... others){
    option_risk_indicator_sseRequest t = new option_risk_indicator_sseRequest();


    t.p_date = p_date;
    t.other.put("date", p_date.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: date
    * type: str
    * desc: date=&quot;20220516&quot;; 交易日; 从 20150209 开始
    * required: 
    */
    private String p_date;

    public String getP_date() { return this.p_date;}
    public void setP_date(String v) { this.p_date = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
