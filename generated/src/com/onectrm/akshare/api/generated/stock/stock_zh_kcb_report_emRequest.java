
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_zh_kcb_report_em
    * 目标地址: http://data.eastmoney.com/notices/kcb.html
    * 描述: 东方财富-科创板报告数据
    * 限量: 单次返回所有科创板上市公司的报告数据
    */
    public class stock_zh_kcb_report_emRequest extends AkShareRequestAndResponse {
    public stock_zh_kcb_report_emRequest(){
    setInterfaceName("stock_zh_kcb_report_em");
    }

    public static String name() {
        return "stock_zh_kcb_report_em";
    }
    public String getName() {
    return "stock_zh_kcb_report_em";
    }

    public static stock_zh_kcb_report_emRequest of(


    Integer p_frompage,

    Integer p_topage,


    Map.Entry
    <String
    , String>... others){
    stock_zh_kcb_report_emRequest t = new stock_zh_kcb_report_emRequest();


    t.p_frompage = p_frompage;
    t.other.put("from_page", p_frompage.toString());

    t.p_topage = p_topage;
    t.other.put("to_page", p_topage.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: from_page
    * type: int
    * desc: from_page=1; 始获取的页码
    * required: 
    */
    private Integer p_frompage;

    public Integer getP_frompage() { return this.p_frompage;}
    public void setP_frompage(Integer v) { this.p_frompage = v;}

    /**
    * name: to_page
    * type: int
    * desc: to_page=100; 结束获取的页码
    * required: 
    */
    private Integer p_topage;

    public Integer getP_topage() { return this.p_topage;}
    public void setP_topage(Integer v) { this.p_topage = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
