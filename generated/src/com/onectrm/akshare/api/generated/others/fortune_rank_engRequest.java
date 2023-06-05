
    package com.onectrm.akshare.api.generated.others;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: others
    * 接口: fortune_rank_eng
    * 目标地址: https://fortune.com/global500/
    * 描述: 获取指定年份财富世界 500 强公司排行榜-英文版本, 从 1995 年开始, 数据和格式较中文版本完整
    * 限量: 单次返回某一个年份的所有历史数据, 早期数据可能不足 500 家公司
    */
    public class fortune_rank_engRequest extends AkShareRequestAndResponse {
    public fortune_rank_engRequest(){
    setInterfaceName("fortune_rank_eng");
    }

    public static String name() {
        return "fortune_rank_eng";
    }
    public String getName() {
    return "fortune_rank_eng";
    }

    public static fortune_rank_engRequest of(


    String p_year,


    Map.Entry
    <String
    , String>... others){
    fortune_rank_engRequest t = new fortune_rank_engRequest();


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
    * type: str
    * desc: year=&quot;2019&quot;; 指定年份
    * required: Y
    */
    private String p_year;

    public String getP_year() { return this.p_year;}
    public void setP_year(String v) { this.p_year = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
