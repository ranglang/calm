
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_zh_a_scr_report
    * 目标地址: http://stockdata.stock.hexun.com/zrbg/Plate.aspx?date=2010-12-31#
    * 描述: 和讯财经-企业社会责任数据; 年度更新
    * 限量: 单次返回指定 year 和 need_page 的数据
    */
    public class stock_zh_a_scr_reportRequest extends AkShareRequestAndResponse {
    public stock_zh_a_scr_reportRequest(){
    setInterfaceName("stock_zh_a_scr_report");
    }

    public static String name() {
        return "stock_zh_a_scr_report";
    }
    public String getName() {
    return "stock_zh_a_scr_report";
    }

    public static stock_zh_a_scr_reportRequest of(


    String p_year,

    String p_needpage,


    Map.Entry
    <String
    , String>... others){
    stock_zh_a_scr_reportRequest t = new stock_zh_a_scr_reportRequest();


    t.p_year = p_year;
    t.other.put("year", p_year.toString());

    t.p_needpage = p_needpage;
    t.other.put("need_page", p_needpage.toString());


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
    * desc: year=&quot;2018&quot;; 需要获取的年份
    * required: 
    */
    private String p_year;

    public String getP_year() { return this.p_year;}
    public void setP_year(String v) { this.p_year = v;}

    /**
    * name: need_page
    * type: str
    * desc: need_page=&quot;10&quot;; 需要获取的页数
    * required: 
    */
    private String p_needpage;

    public String getP_needpage() { return this.p_needpage;}
    public void setP_needpage(String v) { this.p_needpage = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
