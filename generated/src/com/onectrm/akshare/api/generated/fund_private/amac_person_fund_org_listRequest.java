
    package com.onectrm.akshare.api.generated.fund_private;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fund_private
    * 接口: amac_person_fund_org_list
    * 目标地址: http://gs.amac.org.cn/amac-infodisc/res/pof/person/personOrgList.html
    * 描述: 中国证券投资基金业协会-信息公示-从业人员信息-基金从业人员资格注册信息
    * 限量: 单次返回当前时刻所有历史数据
    */
    public class amac_person_fund_org_listRequest extends AkShareRequestAndResponse {
    public amac_person_fund_org_listRequest(){
    setInterfaceName("amac_person_fund_org_list");
    }

    public static String name() {
        return "amac_person_fund_org_list";
    }
    public String getName() {
    return "amac_person_fund_org_list";
    }

    public static amac_person_fund_org_listRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    amac_person_fund_org_listRequest t = new amac_person_fund_org_listRequest();


    t.p_symbol = p_symbol;
    t.other.put("symbol", p_symbol.toString());


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
    * desc: symbol=&quot;公募基金管理公司&quot;; choice of {&quot;公募基金管理公司&quot;, &quot;公募基金管理公司资管子公司&quot;, &quot;商业银行&quot;, &quot;证券公司&quot;, &quot;证券公司子公司&quot;, &quot;私募基金管理人&quot;, &quot;保险公司子公司&quot;, &quot;保险公司&quot;, &quot;外包服务机构&quot;, &quot;期货公司&quot;, &quot;期货公司资管子公司&quot;, &quot;媒体机构&quot;, &quot;证券投资咨询机构&quot;, &quot;评价机构&quot;, &quot;外资私募证券基金管理人&quot;, &quot;支付结算&quot;, &quot;独立服务机构&quot;, &quot;地方自律组织&quot;, &quot;境外机构&quot;, &quot;律师事务所&quot;, &quot;会计师事务所&quot;, &quot;交易所&quot;, &quot;独立第三方销售机构&quot;, &quot;证券公司资管子公司&quot;, &quot;证券公司私募基金子公司&quot;, &quot;其他&quot;}
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
