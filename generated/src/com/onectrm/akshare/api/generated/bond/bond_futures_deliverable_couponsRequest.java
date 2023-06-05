
    package com.onectrm.akshare.api.generated.bond;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: bond
    * 接口: bond_futures_deliverable_coupons
    * 目标地址: http://www.csindex.com.cn/zh-CN/bond-valuation/bond-futures-deliverable-coupons-related-indicators
    * 描述: 国债期货可交割券相关指标
    * 限量: 只能返回近一年的数据
    */
    public class bond_futures_deliverable_couponsRequest extends AkShareRequestAndResponse {
    public bond_futures_deliverable_couponsRequest(){
    setInterfaceName("bond_futures_deliverable_coupons");
    }

    public static String name() {
        return "bond_futures_deliverable_coupons";
    }
    public String getName() {
    return "bond_futures_deliverable_coupons";
    }

    public static bond_futures_deliverable_couponsRequest of(


    String p_tradedate,


    Map.Entry
    <String
    , String>... others){
    bond_futures_deliverable_couponsRequest t = new bond_futures_deliverable_couponsRequest();


    t.p_tradedate = p_tradedate;
    t.other.put("trade_date", p_tradedate.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: trade_date
    * type: str
    * desc: trade_date=&quot;20200922&quot;
    * required: 
    */
    private String p_tradedate;

    public String getP_tradedate() { return this.p_tradedate;}
    public void setP_tradedate(String v) { this.p_tradedate = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
