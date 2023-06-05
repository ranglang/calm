
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_sina_lhb_yytj
    * 目标地址: http://vip.stock.finance.sina.com.cn/q/go.php/vLHBData/kind/yytj/index.phtml
    * 描述: 新浪财经-龙虎榜-营业上榜统计
    * 限量: 单次返回指定 recent_day 的所有历史数据
    */
    public class stock_sina_lhb_yytjRequest extends AkShareRequestAndResponse {
    public stock_sina_lhb_yytjRequest(){
    setInterfaceName("stock_sina_lhb_yytj");
    }

    public static String name() {
        return "stock_sina_lhb_yytj";
    }
    public String getName() {
    return "stock_sina_lhb_yytj";
    }

    public static stock_sina_lhb_yytjRequest of(


    String p_recentday,


    Map.Entry
    <String
    , String>... others){
    stock_sina_lhb_yytjRequest t = new stock_sina_lhb_yytjRequest();


    t.p_recentday = p_recentday;
    t.other.put("recent_day", p_recentday.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: recent_day
    * type: str
    * desc: recent_day=&quot;5&quot;; choice of {&quot;5&quot;: 最近 5 天; &quot;10&quot;: 最近 10 天; &quot;30&quot;: 最近 30 天; &quot;60&quot;: 最近 60 天;}
    * required: Y
    */
    private String p_recentday;

    public String getP_recentday() { return this.p_recentday;}
    public void setP_recentday(String v) { this.p_recentday = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
