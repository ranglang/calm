
    package com.onectrm.akshare.api.generated.bond;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: bond
    * 接口: bond_china_yield
    * 目标地址: http://yield.chinabond.com.cn/cbweb-pbc-web/pbc/historyQuery?startDate=2019-02-07&amp;endDate=2020-02-04&amp;gjqx=0&amp;qxId=ycqx&amp;locale=cn_ZH
    * 描述: 中国债券信息网-国债及其他债券收益率曲线
    * 限量: 单次返回所有指定日期间 start_date 到 end_date 需要小于一年的所有数据
    */
    public class bond_china_yieldRequest extends AkShareRequestAndResponse {
    public bond_china_yieldRequest(){
    setInterfaceName("bond_china_yield");
    }

    public static String name() {
        return "bond_china_yield";
    }
    public String getName() {
    return "bond_china_yield";
    }

    public static bond_china_yieldRequest of(


    String p_startdate,

    String p_enddate,


    Map.Entry
    <String
    , String>... others){
    bond_china_yieldRequest t = new bond_china_yieldRequest();


    t.p_startdate = p_startdate;
    t.other.put("start_date", p_startdate.toString());

    t.p_enddate = p_enddate;
    t.other.put("end_date", p_enddate.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: start_date
    * type: str
    * desc: start_date=&quot;20190204&quot;, 指定开始日期; start_date 到 end_date 需要小于一年
    * required: 
    */
    private String p_startdate;

    public String getP_startdate() { return this.p_startdate;}
    public void setP_startdate(String v) { this.p_startdate = v;}

    /**
    * name: end_date
    * type: str
    * desc: end_date=&quot;20200204&quot;, 指定结束日期; start_date 到 end_date 需要小于一年
    * required: 
    */
    private String p_enddate;

    public String getP_enddate() { return this.p_enddate;}
    public void setP_enddate(String v) { this.p_enddate = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
