
    package com.onectrm.akshare.api.generated.event;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: event
    * 接口: migration_scale_baidu
    * 目标地址: https://qianxi.baidu.com/?from=shoubai#city=0
    * 描述: 获取百度-百度地图慧眼-百度迁徙-迁徙规模
    * 限量: 单次返回当前城市的去年和今年的迁徙规模数据, 查询参数中的 **start_date** 不要随意更改
    */
    public class migration_scale_baiduRequest extends AkShareRequestAndResponse {
    public migration_scale_baiduRequest(){
    setInterfaceName("migration_scale_baidu");
    }

    public static String name() {
        return "migration_scale_baidu";
    }
    public String getName() {
    return "migration_scale_baidu";
    }

    public static migration_scale_baiduRequest of(


    String p_area,

    String p_indicator,

    String p_startdate,

    String p_enddate,


    Map.Entry
    <String
    , String>... others){
    migration_scale_baiduRequest t = new migration_scale_baiduRequest();


    t.p_area = p_area;
    t.other.put("area", p_area.toString());

    t.p_indicator = p_indicator;
    t.other.put("indicator", p_indicator.toString());

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
    * name: area
    * type: str
    * desc: area=&quot;乌鲁木齐市&quot;, 输入需要查询的省份或者城市, 都需要用全称, 比如: &quot;浙江省&quot;, &quot;乌鲁木齐市&quot;
    * required: 
    */
    private String p_area;

    public String getP_area() { return this.p_area;}
    public void setP_area(String v) { this.p_area = v;}

    /**
    * name: indicator
    * type: str
    * desc: indicator=&quot;move_in&quot;, 返回迁入地详情, indicator=&quot;move_out&quot;, 返回迁出地详情
    * required: 
    */
    private String p_indicator;

    public String getP_indicator() { return this.p_indicator;}
    public void setP_indicator(String v) { this.p_indicator = v;}

    /**
    * name: start_date
    * type: str
    * desc: start_date=&quot;20190112&quot;, 一般不要变化
    * required: 
    */
    private String p_startdate;

    public String getP_startdate() { return this.p_startdate;}
    public void setP_startdate(String v) { this.p_startdate = v;}

    /**
    * name: end_date
    * type: str
    * desc: end_date=&quot;20200201&quot;, 往后查询如 20200202 之后
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
