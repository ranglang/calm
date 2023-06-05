
    package com.onectrm.akshare.api.generated.others;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: others
    * 接口: xincaifu_rank
    * 目标地址: http://www.xcf.cn/zhuanti/ztzz/hdzt1/500frb/index.html
    * 描述: 获取新财富 500 富豪榜, 从 2003 年至今
    * 限量: 单次返回指定年份的富豪榜数据
    */
    public class xincaifu_rankRequest extends AkShareRequestAndResponse {
    public xincaifu_rankRequest(){
    setInterfaceName("xincaifu_rank");
    }

    public static String name() {
        return "xincaifu_rank";
    }
    public String getName() {
    return "xincaifu_rank";
    }

    public static xincaifu_rankRequest of(


    String p_year,


    Map.Entry
    <String
    , String>... others){
    xincaifu_rankRequest t = new xincaifu_rankRequest();


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
    * desc: year=&quot;2020&quot;; 从 2003 年至今
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
