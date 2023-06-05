
    package com.onectrm.akshare.api.generated.others;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: others
    * 接口: movie_boxoffice_yearly_first_week
    * 目标地址: https://www.endata.com.cn/BoxOffice/BO/Year/firstWeek.html
    * 描述: 指定日期所在年度的年度首周票房数据
    * 限量: 指定日期所在年度的年度首周票房数据, 只能获取最近年度的数据
    */
    public class movie_boxoffice_yearly_first_weekRequest extends AkShareRequestAndResponse {
    public movie_boxoffice_yearly_first_weekRequest(){
    setInterfaceName("movie_boxoffice_yearly_first_week");
    }

    public static String name() {
        return "movie_boxoffice_yearly_first_week";
    }
    public String getName() {
    return "movie_boxoffice_yearly_first_week";
    }

    public static movie_boxoffice_yearly_first_weekRequest of(


    String p_date,


    Map.Entry
    <String
    , String>... others){
    movie_boxoffice_yearly_first_weekRequest t = new movie_boxoffice_yearly_first_weekRequest();


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
