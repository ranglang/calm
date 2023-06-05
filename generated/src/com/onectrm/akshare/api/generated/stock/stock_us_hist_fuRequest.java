
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_us_hist_fu
    * 目标地址: https://www.futunn.com/stock/HON-US
    * 描述: 美股历史行情日频率数据
    * 限量: 单次返回指定上市公司的所有历史行情数据; 该行情数据为表明是否复权，请谨慎使用
    */
    public class stock_us_hist_fuRequest extends AkShareRequestAndResponse {
    public stock_us_hist_fuRequest(){
    setInterfaceName("stock_us_hist_fu");
    }

    public static String name() {
        return "stock_us_hist_fu";
    }
    public String getName() {
    return "stock_us_hist_fu";
    }

    public static stock_us_hist_fuRequest of(


    String p_symbol,

    String p_startdate,

    String p_enddate,


    Map.Entry
    <String
    , String>... others){
    stock_us_hist_fuRequest t = new stock_us_hist_fuRequest();


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
    * desc: 美股代码; 调用 ak.stock_us_code_table_fu() 函数获取 `代码` 字段
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: start_date
    * type: str
    * desc: start_date=&quot;20210101&quot;
    * required: 
    */
    private String p_startdate;

    public String getP_startdate() { return this.p_startdate;}
    public void setP_startdate(String v) { this.p_startdate = v;}

    /**
    * name: end_date
    * type: str
    * desc: end_date=&quot;20210601&quot;
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
