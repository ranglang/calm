
    package com.onectrm.akshare.api.generated.index;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: index
    * 接口: stock_zh_index_hist_csindex
    * 目标地址: https://www.csindex.com.cn/zh-CN/indices/index-detail/H30374#/indices/family/detail?indexCode=H30374
    * 描述: 中证指数日频率的数据
    * 限量: 该接口返回指定 symbol 的 start_date 和 end_date 的指数日频率数据, 该接口只能返回最近 60 个交易日的数据
    */
    public class stock_zh_index_hist_csindexRequest extends AkShareRequestAndResponse {
    public stock_zh_index_hist_csindexRequest(){
    setInterfaceName("stock_zh_index_hist_csindex");
    }

    public static String name() {
        return "stock_zh_index_hist_csindex";
    }
    public String getName() {
    return "stock_zh_index_hist_csindex";
    }

    public static stock_zh_index_hist_csindexRequest of(


    String p_symbol,

    String p_startdate,

    String p_enddate,


    Map.Entry
    <String
    , String>... others){
    stock_zh_index_hist_csindexRequest t = new stock_zh_index_hist_csindexRequest();


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
    * desc: symbol=&quot;H30374&quot;; 指数代码
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: start_date
    * type: str
    * desc: start_date=&quot;20100101&quot;
    * required: 
    */
    private String p_startdate;

    public String getP_startdate() { return this.p_startdate;}
    public void setP_startdate(String v) { this.p_startdate = v;}

    /**
    * name: end_date
    * type: str
    * desc: end_date=&quot;20211015&quot;
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
