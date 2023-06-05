
    package com.onectrm.akshare.api.generated.others;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: others
    * 接口: car_gasgoo_sale_rank
    * 目标地址: http://i.gasgoo.com/data/ranking
    * 描述: 获取盖世汽车资讯的汽车销量排行榜数据
    * 限量: 单次返回指定 symbol 和 date 的汽车销量排行榜数据
    */
    public class car_gasgoo_sale_rankRequest extends AkShareRequestAndResponse {
    public car_gasgoo_sale_rankRequest(){
    setInterfaceName("car_gasgoo_sale_rank");
    }

    public static String name() {
        return "car_gasgoo_sale_rank";
    }
    public String getName() {
    return "car_gasgoo_sale_rank";
    }

    public static car_gasgoo_sale_rankRequest of(


    String p_symbol,

    String p_date,


    Map.Entry
    <String
    , String>... others){
    car_gasgoo_sale_rankRequest t = new car_gasgoo_sale_rankRequest();


    t.p_symbol = p_symbol;
    t.other.put("symbol", p_symbol.toString());

    t.p_date = p_date;
    t.other.put("date", p_date.toString());


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
    * desc: symbol=&quot;车型榜&quot;; choice of {&quot;车企榜&quot;, &quot;品牌榜&quot;, &quot;车型榜&quot;}
    * required: Y
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: date
    * type: str
    * desc: date=&quot;202104&quot;; 指定到月份即可
    * required: Y
    */
    private String p_date;

    public String getP_date() { return this.p_date;}
    public void setP_date(String v) { this.p_date = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
