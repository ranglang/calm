
    package com.onectrm.akshare.api.generated.energy;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: energy
    * 接口: energy_oil_detail
    * 目标地址: http://data.eastmoney.com/cjsj/oil_default.html
    * 描述: 东方财富-数据中心-中国油价-地区油价
    * 限量: 返回指定调价日的全国各地区的油价的历史数据
    */
    public class energy_oil_detailRequest extends AkShareRequestAndResponse {
    public energy_oil_detailRequest(){
    setInterfaceName("energy_oil_detail");
    }

    public static String name() {
        return "energy_oil_detail";
    }
    public String getName() {
    return "energy_oil_detail";
    }

    public static energy_oil_detailRequest of(


    String p_date,


    Map.Entry
    <String
    , String>... others){
    energy_oil_detailRequest t = new energy_oil_detailRequest();


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
    * desc: date=&quot;20200319&quot;; 此日期为调价日期, 通过调用 ak.energy_oil_hist() 可以获取历史调价日期
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
