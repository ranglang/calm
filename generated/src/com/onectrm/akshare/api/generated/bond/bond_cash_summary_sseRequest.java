
    package com.onectrm.akshare.api.generated.bond;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: bond
    * 接口: bond_cash_summary_sse
    * 目标地址: http://bond.sse.com.cn/data/statistics/overview/bondow/
    * 描述: 上登债券信息网-市场数据-市场统计-市场概览-债券现券市场概览
    * 限量: 单次返回指定交易日的债券现券市场概览数据
    */
    public class bond_cash_summary_sseRequest extends AkShareRequestAndResponse {
    public bond_cash_summary_sseRequest(){
    setInterfaceName("bond_cash_summary_sse");
    }

    public static String name() {
        return "bond_cash_summary_sse";
    }
    public String getName() {
    return "bond_cash_summary_sse";
    }

    public static bond_cash_summary_sseRequest of(


    String p_date,


    Map.Entry
    <String
    , String>... others){
    bond_cash_summary_sseRequest t = new bond_cash_summary_sseRequest();


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
    * desc: date=&#39;20200111&#39;
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
