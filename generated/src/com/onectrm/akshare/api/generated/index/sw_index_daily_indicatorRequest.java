
    package com.onectrm.akshare.api.generated.index;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: index
    * 接口: sw_index_daily_indicator
    * 目标地址: http://www.swsindex.com/idx0200.aspx?columnid=8838&amp;type=Day
    * 描述: 申万一级和二级行业历史行情指标数据
    * 限量: 由于申万源问题该接口暂不能获取数据
    */
    public class sw_index_daily_indicatorRequest extends AkShareRequestAndResponse {
    public sw_index_daily_indicatorRequest(){
    setInterfaceName("sw_index_daily_indicator");
    }

    public static String name() {
        return "sw_index_daily_indicator";
    }
    public String getName() {
    return "sw_index_daily_indicator";
    }

    public static sw_index_daily_indicatorRequest of(


    String p_symbol,

    String p_startdate,

    String p_enddate,

    String p_datatype,


    Map.Entry
    <String
    , String>... others){
    sw_index_daily_indicatorRequest t = new sw_index_daily_indicatorRequest();


    t.p_symbol = p_symbol;
    t.other.put("symbol", p_symbol.toString());

    t.p_startdate = p_startdate;
    t.other.put("start_date", p_startdate.toString());

    t.p_enddate = p_enddate;
    t.other.put("end_date", p_enddate.toString());

    t.p_datatype = p_datatype;
    t.other.put("data_type", p_datatype.toString());


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
    * desc: symbol=&quot;801010&quot;; 行业代码
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: start_date
    * type: str
    * desc: start_date=&quot;20191201&quot;
    * required: 
    */
    private String p_startdate;

    public String getP_startdate() { return this.p_startdate;}
    public void setP_startdate(String v) { this.p_startdate = v;}

    /**
    * name: end_date
    * type: str
    * desc: end_date=&quot;20191207&quot;
    * required: 
    */
    private String p_enddate;

    public String getP_enddate() { return this.p_enddate;}
    public void setP_enddate(String v) { this.p_enddate = v;}

    /**
    * name: data_type
    * type: str
    * desc: data_type=&quot;Day&quot;; &quot;Day&quot;: 日报表, &quot;Week&quot;: 周报表
    * required: 
    */
    private String p_datatype;

    public String getP_datatype() { return this.p_datatype;}
    public void setP_datatype(String v) { this.p_datatype = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
