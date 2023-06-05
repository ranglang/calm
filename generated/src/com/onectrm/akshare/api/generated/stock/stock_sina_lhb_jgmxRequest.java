
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_sina_lhb_jgmx
    * 目标地址: http://vip.stock.finance.sina.com.cn/q/go.php/vLHBData/kind/jgzz/index.phtml
    * 描述: 新浪财经-龙虎榜-机构席位成交明细
    * 限量: 单次返回所有历史数据
    */
    public class stock_sina_lhb_jgmxRequest extends AkShareRequestAndResponse {
    public stock_sina_lhb_jgmxRequest(){
    setInterfaceName("stock_sina_lhb_jgmx");
    }

    public static String name() {
        return "stock_sina_lhb_jgmx";
    }
    public String getName() {
    return "stock_sina_lhb_jgmx";
    }

    public static stock_sina_lhb_jgmxRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_sina_lhb_jgmxRequest t = new stock_sina_lhb_jgmxRequest();



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
