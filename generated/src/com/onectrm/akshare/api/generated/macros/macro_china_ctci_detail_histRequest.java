
    package com.onectrm.akshare.api.generated.macros;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_china_ctci_detail_hist
    * 目标地址: http://jgjc.ndrc.gov.cn/dmzs.aspx?clmId=741
    * 描述: 获取中国电煤价格指数-历史电煤价格指数, 具体年的历史数据
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_ctci_detail_histRequest extends AkShareRequestAndResponse {
    public macro_china_ctci_detail_histRequest(){
    setInterfaceName("macro_china_ctci_detail_hist");
    }

    public static String name() {
        return "macro_china_ctci_detail_hist";
    }
    public String getName() {
    return "macro_china_ctci_detail_hist";
    }

    public static macro_china_ctci_detail_histRequest of(


    String p_year,


    Map.Entry
    <String
    , String>... others){
    macro_china_ctci_detail_histRequest t = new macro_china_ctci_detail_histRequest();


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
    * desc: year=&quot;2018&quot;, 从 2014-2019 年
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
