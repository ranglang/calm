
    package com.onectrm.akshare.api.generated.others;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: others
    * 接口: fortune_rank
    * 目标地址: http://www.fortunechina.com/fortune500/node_65.htm
    * 描述: 获取指定年份财富世界 500 强公司排行榜
    * 限量: 单次返回某一个年份的所有历史数据
    */
    public class fortune_rankRequest extends AkShareRequestAndResponse {
    public fortune_rankRequest(){
    setInterfaceName("fortune_rank");
    }

    public static String name() {
        return "fortune_rank";
    }
    public String getName() {
    return "fortune_rank";
    }

    public static fortune_rankRequest of(


    Integer p_year,


    Map.Entry
    <String
    , String>... others){
    fortune_rankRequest t = new fortune_rankRequest();


    t.p_year = p_year;
    t.other.put("year", p_year.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: year
    * type: int
    * desc: year=&quot;2019&quot;
    * required: Y
    */
    private Integer p_year;

    public Integer getP_year() { return this.p_year;}
    public void setP_year(Integer v) { this.p_year = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
