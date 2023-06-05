
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_board_industry_index_ths
    * 目标地址: http://q.10jqka.com.cn/gn/detail/code/301558/
    * 描述: 同花顺-板块-行业板块-指数日频率数据
    * 限量: 单次返回所有日频指数数据
    */
    public class stock_board_industry_index_thsRequest extends AkShareRequestAndResponse {
    public stock_board_industry_index_thsRequest(){
    setInterfaceName("stock_board_industry_index_ths");
    }

    public static String name() {
        return "stock_board_industry_index_ths";
    }
    public String getName() {
    return "stock_board_industry_index_ths";
    }

    public static stock_board_industry_index_thsRequest of(


    String p_symbol,

    String p_startdate,

    String p_enddate,


    Map.Entry
    <String
    , String>... others){
    stock_board_industry_index_thsRequest t = new stock_board_industry_index_thsRequest();


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
    * desc: symbol=&quot;半导体及元件&quot;; 可以通过调用 **ak.stock_board_industry_name_ths()** 查看同花顺的所有行业名称
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: start_date
    * type: str
    * desc: start_date=&quot;20200101&quot;; 开始时间
    * required: 
    */
    private String p_startdate;

    public String getP_startdate() { return this.p_startdate;}
    public void setP_startdate(String v) { this.p_startdate = v;}

    /**
    * name: end_date
    * type: str
    * desc: end_date=&quot;20211027&quot;; 结束时间
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
