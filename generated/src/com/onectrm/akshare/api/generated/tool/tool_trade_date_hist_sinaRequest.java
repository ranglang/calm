
    package com.onectrm.akshare.api.generated.tool;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: tool
    * 接口: tool_trade_date_hist_sina
    * 目标地址: https://finance.sina.com.cn/realstock/company/klc_td_sh.txt
    * 描述: 新浪财经的股票交易日历数据
    * 限量: 单次返回从 1990-12-19 到 2021-12-31 之间的股票交易日历数据, 这里补充 1992-05-04 进入交易日
    */
    public class tool_trade_date_hist_sinaRequest extends AkShareRequestAndResponse {
    public tool_trade_date_hist_sinaRequest(){
    setInterfaceName("tool_trade_date_hist_sina");
    }

    public static String name() {
        return "tool_trade_date_hist_sina";
    }
    public String getName() {
    return "tool_trade_date_hist_sina";
    }

    public static tool_trade_date_hist_sinaRequest of(



    Map.Entry
    <String
    , String>... others){
    tool_trade_date_hist_sinaRequest t = new tool_trade_date_hist_sinaRequest();



    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }




    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
