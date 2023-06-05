
    package com.onectrm.akshare.api.generated.event;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: event
    * 接口: migration_area_baidu
    * 目标地址: https://qianxi.baidu.com/?from=shoubai#city=0
    * 描述: 获取百度-百度地图慧眼-百度迁徙-迁入/迁出地数据接口
    * 限量: 单次返回前 50 个城市, 由于百度接口限制, 目前只能返回前 50 个城市
    */
    public class migration_area_baiduRequest extends AkShareRequestAndResponse {
    public migration_area_baiduRequest(){
    setInterfaceName("migration_area_baidu");
    }

    public static String name() {
        return "migration_area_baidu";
    }
    public String getName() {
    return "migration_area_baidu";
    }

    public static migration_area_baiduRequest of(


    String p_area,

    String p_indicator,

    String p_date,


    Map.Entry
    <String
    , String>... others){
    migration_area_baiduRequest t = new migration_area_baiduRequest();


    t.p_area = p_area;
    t.other.put("area", p_area.toString());

    t.p_indicator = p_indicator;
    t.other.put("indicator", p_indicator.toString());

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
    * name: date
    * type: str
    * desc: date=&quot;20200201&quot;, 需要滞后一天
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
