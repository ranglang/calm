
    package com.onectrm.akshare.api.generated.others;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: others
    * 接口: movie_boxoffice_cinema_weekly
    * 目标地址: https://www.endata.com.cn/BoxOffice/BO/Cinema/week.html
    * 描述: 指定日期的完整周各影院的票房数据
    * 限量: 指定日期的完整周各影院的票房数据, 注意当前日期的数据只能返回上周的数据
    */
    public class movie_boxoffice_cinema_weeklyRequest extends AkShareRequestAndResponse {
    public movie_boxoffice_cinema_weeklyRequest(){
    setInterfaceName("movie_boxoffice_cinema_weekly");
    }

    public static String name() {
        return "movie_boxoffice_cinema_weekly";
    }
    public String getName() {
    return "movie_boxoffice_cinema_weekly";
    }

    public static movie_boxoffice_cinema_weeklyRequest of(


    String p_date,


    Map.Entry
    <String
    , String>... others){
    movie_boxoffice_cinema_weeklyRequest t = new movie_boxoffice_cinema_weeklyRequest();


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
    * desc: date=&quot;20201018&quot;; 输入具体的日期即可
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
