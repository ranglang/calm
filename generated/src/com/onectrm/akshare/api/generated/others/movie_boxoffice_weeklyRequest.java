
    package com.onectrm.akshare.api.generated.others;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: others
    * 接口: movie_boxoffice_weekly
    * 目标地址: https://www.endata.com.cn/BoxOffice/BO/Week/oneWeek.html
    * 描述: 指定日期所在完整周的票房数据, 影片周票房数据初始更新周期为每周二，下周二补充数据
    * 限量: 指定日期所在完整周的票房数据
    */
    public class movie_boxoffice_weeklyRequest extends AkShareRequestAndResponse {
    public movie_boxoffice_weeklyRequest(){
    setInterfaceName("movie_boxoffice_weekly");
    }

    public static String name() {
        return "movie_boxoffice_weekly";
    }
    public String getName() {
    return "movie_boxoffice_weekly";
    }

    public static movie_boxoffice_weeklyRequest of(


    String p_date,


    Map.Entry
    <String
    , String>... others){
    movie_boxoffice_weeklyRequest t = new movie_boxoffice_weeklyRequest();


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
    * desc: date=&quot;20201018&quot;; 指定日期所在周必须已经完整
    * required: Y
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
