
    package com.onectrm.akshare.api.generated.others;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: others
    * 接口: movie_boxoffice_daily
    * 目标地址: https://www.endata.com.cn/BoxOffice/BO/Day/index.html
    * 描述: 指定日期的电影票房数据, 每日 10:30, 12:30更新日票房，16:30 同时补充前 7 日票房
    * 限量: 只能指定最近的日期
    */
    public class movie_boxoffice_dailyRequest extends AkShareRequestAndResponse {
    public movie_boxoffice_dailyRequest(){
    setInterfaceName("movie_boxoffice_daily");
    }

    public static String name() {
        return "movie_boxoffice_daily";
    }
    public String getName() {
    return "movie_boxoffice_daily";
    }

    public static movie_boxoffice_dailyRequest of(


    String p_date,


    Map.Entry
    <String
    , String>... others){
    movie_boxoffice_dailyRequest t = new movie_boxoffice_dailyRequest();


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
    * desc: date=&quot;20201019&quot;; 只能选择最近的日期
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
