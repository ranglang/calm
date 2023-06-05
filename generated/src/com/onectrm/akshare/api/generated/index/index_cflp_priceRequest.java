
    package com.onectrm.akshare.api.generated.index;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: index
    * 接口: index_cflp_price
    * 目标地址: http://index.0256.cn/expx.htm
    * 描述: 获取指定 symbol 的中国公路物流运价指数的数据
    * 限量: 只能获取近期的数据; 目前该接口数据源更新有几个交易日的延时
    */
    public class index_cflp_priceRequest extends AkShareRequestAndResponse {
    public index_cflp_priceRequest(){
    setInterfaceName("index_cflp_price");
    }

    public static String name() {
        return "index_cflp_price";
    }
    public String getName() {
    return "index_cflp_price";
    }

    public static index_cflp_priceRequest of(


    String p_startdate,

    String p_enddate,


    Map.Entry
    <String
    , String>... others){
    index_cflp_priceRequest t = new index_cflp_priceRequest();


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
    * name: start_date
    * type: str
    * desc: start_date=&quot;20200320&quot;; 注意开始和结束之间的时间跨度不能太长, 只能获取当前交易日近一个月内的数据
    * required: 
    */
    private String p_startdate;

    public String getP_startdate() { return this.p_startdate;}
    public void setP_startdate(String v) { this.p_startdate = v;}

    /**
    * name: end_date
    * type: str
    * desc: end_date=&quot;20200327&quot;; 只能获取当前交易日近一个月内的数据
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
