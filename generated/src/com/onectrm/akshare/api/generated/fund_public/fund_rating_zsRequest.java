
    package com.onectrm.akshare.api.generated.fund_public;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fund_public
    * 接口: fund_rating_zs
    * 目标地址: http://fund.eastmoney.com/data/fundrating_2.html
    * 描述: 获取天天基金网-基金评级-招商证券评级
    * 限量: 单次返回指定交易日的所有基金评级数据
    */
    public class fund_rating_zsRequest extends AkShareRequestAndResponse {
    public fund_rating_zsRequest(){
    setInterfaceName("fund_rating_zs");
    }

    public static String name() {
        return "fund_rating_zs";
    }
    public String getName() {
    return "fund_rating_zs";
    }

    public static fund_rating_zsRequest of(


    String p_date,


    Map.Entry
    <String
    , String>... others){
    fund_rating_zsRequest t = new fund_rating_zsRequest();


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
    * name: date
    * type: str
    * desc: date=&#39;20201030&#39;
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
