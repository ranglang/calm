
    package com.onectrm.akshare.api.generated.interest_rate;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: interest_rate
    * 接口: repo_rate_hist
    * 目标地址: http://www.chinamoney.com.cn/chinese/bkfrr/
    * 描述: 回购定盘利率数据
    * 限量: 单次返回指定日期间(一个月)的所有历史数据
    */
    public class repo_rate_histRequest extends AkShareRequestAndResponse {
    public repo_rate_histRequest(){
    setInterfaceName("repo_rate_hist");
    }

    public static String name() {
        return "repo_rate_hist";
    }
    public String getName() {
    return "repo_rate_hist";
    }

    public static repo_rate_histRequest of(


    String p_startdate,

    String p_enddate,


    Map.Entry
    <String
    , String>... others){
    repo_rate_histRequest t = new repo_rate_histRequest();


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
    * desc: start_date=&quot;20200930&quot;; 开始时间与结束时间需要在一个月内
    * required: 
    */
    private String p_startdate;

    public String getP_startdate() { return this.p_startdate;}
    public void setP_startdate(String v) { this.p_startdate = v;}

    /**
    * name: end_date
    * type: str
    * desc: end_date=&quot;20201029&quot;; 开始时间与结束时间需要在一个月内
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
