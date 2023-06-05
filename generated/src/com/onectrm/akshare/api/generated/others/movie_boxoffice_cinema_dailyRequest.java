
    package com.onectrm.akshare.api.generated.others;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: others
    * 接口: movie_boxoffice_cinema_daily
    * 目标地址: https://www.endata.com.cn/BoxOffice/BO/Cinema/day.html
    * 描述: 指定日期的每日各影院的票房数据
    * 限量: 指定日期各影院的票房数据, 注意当前日期的数据需要第二日才可以获取
    */
    public class movie_boxoffice_cinema_dailyRequest extends AkShareRequestAndResponse {
    public movie_boxoffice_cinema_dailyRequest(){
    setInterfaceName("movie_boxoffice_cinema_daily");
    }

    public static String name() {
        return "movie_boxoffice_cinema_daily";
    }
    public String getName() {
    return "movie_boxoffice_cinema_daily";
    }

    public static movie_boxoffice_cinema_dailyRequest of(


    String p_date,


    Map.Entry
    <String
    , String>... others){
    movie_boxoffice_cinema_dailyRequest t = new movie_boxoffice_cinema_dailyRequest();


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
    * desc: date=&quot;20201019&quot;; 输入具体的日期即可
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
