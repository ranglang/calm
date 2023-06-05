
    package com.onectrm.akshare.api.generated.futures;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: futures
    * 接口: futures_zh_spot
    * 目标地址: https://finance.sina.com.cn/futuremarket/
    * 描述: 新浪财经-期货页面的实时行情数据
    * 限量: 单次返回当日可以订阅的所有期货品种数据
    */
    public class futures_zh_spotRequest extends AkShareRequestAndResponse {
    public futures_zh_spotRequest(){
    setInterfaceName("futures_zh_spot");
    }

    public static String name() {
        return "futures_zh_spot";
    }
    public String getName() {
    return "futures_zh_spot";
    }

    public static futures_zh_spotRequest of(


    String p_subscribelist,

    String p_market,

    String p_adjust,


    Map.Entry
    <String
    , String>... others){
    futures_zh_spotRequest t = new futures_zh_spotRequest();


    t.p_subscribelist = p_subscribelist;
    t.other.put("subscribe_list", p_subscribelist.toString());

    t.p_market = p_market;
    t.other.put("market", p_market.toString());

    t.p_adjust = p_adjust;
    t.other.put("adjust", p_adjust.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: subscribe_list
    * type: str
    * desc: 需要订阅的合约代码; e.g., 按照示例获取
    * required: 
    */
    private String p_subscribelist;

    public String getP_subscribelist() { return this.p_subscribelist;}
    public void setP_subscribelist(String v) { this.p_subscribelist = v;}

    /**
    * name: market
    * type: str
    * desc: market=&quot;CF&quot;; market=&quot;CF&quot;: 商品期货, market=&quot;FF&quot;: 金融期货
    * required: 
    */
    private String p_market;

    public String getP_market() { return this.p_market;}
    public void setP_market(String v) { this.p_market = v;}

    /**
    * name: adjust
    * type: str
    * desc: adjust=&#39;0&#39;; adjust=&#39;1&#39;: 返回合约、交易所和最小变动单位的实时数据, 返回数据会变慢
    * required: 
    */
    private String p_adjust;

    public String getP_adjust() { return this.p_adjust;}
    public void setP_adjust(String v) { this.p_adjust = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
