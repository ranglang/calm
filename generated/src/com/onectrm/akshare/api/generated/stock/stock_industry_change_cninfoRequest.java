
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_industry_change_cninfo
    * 目标地址: http://webapi.cninfo.com.cn/#/apiDoc
    * 描述: 巨潮资讯-数据-上市公司行业归属的变动情况
    * 限量: 单次获取指定 symbol 在 start_date 和 end_date 之间的上市公司行业归属的变动情况数据
    */
    public class stock_industry_change_cninfoRequest extends AkShareRequestAndResponse {
    public stock_industry_change_cninfoRequest(){
    setInterfaceName("stock_industry_change_cninfo");
    }

    public static String name() {
        return "stock_industry_change_cninfo";
    }
    public String getName() {
    return "stock_industry_change_cninfo";
    }

    public static stock_industry_change_cninfoRequest of(


    String p_symbol,

    String p_startdate,

    String p_enddate,


    Map.Entry
    <String
    , String>... others){
    stock_industry_change_cninfoRequest t = new stock_industry_change_cninfoRequest();


    t.p_symbol = p_symbol;
    t.other.put("symbol", p_symbol.toString());

    t.p_startdate = p_startdate;
    t.other.put("start_date", p_startdate.toString());

    t.p_enddate = p_enddate;
    t.other.put("end_date", p_enddate.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: symbol
    * type: str
    * desc: symbol=&quot;002594&quot;
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: start_date
    * type: str
    * desc: start_date=&quot;20091227&quot;
    * required: 
    */
    private String p_startdate;

    public String getP_startdate() { return this.p_startdate;}
    public void setP_startdate(String v) { this.p_startdate = v;}

    /**
    * name: end_date
    * type: str
    * desc: end_date=&quot;20220708&quot;
    * required: 
    */
    private String p_enddate;

    public String getP_enddate() { return this.p_enddate;}
    public void setP_enddate(String v) { this.p_enddate = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
