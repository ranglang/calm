
    package com.onectrm.akshare.api.generated.fund_private;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fund_private
    * 接口: amac_fund_info
    * 目标地址: http://gs.amac.org.cn/amac-infodisc/res/pof/fund/index.html
    * 描述: 中国证券投资基金业协会-信息公示-基金产品公示-私募基金管理人基金产品
    * 限量: 单次返回指定页码之间的所有历史数据, 其中与每页 100 条的目标网站对应; 默认返回所有数据
    */
    public class amac_fund_infoRequest extends AkShareRequestAndResponse {
    public amac_fund_infoRequest(){
    setInterfaceName("amac_fund_info");
    }

    public static String name() {
        return "amac_fund_info";
    }
    public String getName() {
    return "amac_fund_info";
    }

    public static amac_fund_infoRequest of(


    String p_startpage,

    String p_endpage,


    Map.Entry
    <String
    , String>... others){
    amac_fund_infoRequest t = new amac_fund_infoRequest();


    t.p_startpage = p_startpage;
    t.other.put("start_page", p_startpage.toString());

    t.p_endpage = p_endpage;
    t.other.put("end_page", p_endpage.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: start_page
    * type: str
    * desc: start_page=&#39;1&#39;; 开始页码
    * required: 
    */
    private String p_startpage;

    public String getP_startpage() { return this.p_startpage;}
    public void setP_startpage(String v) { this.p_startpage = v;}

    /**
    * name: end_page
    * type: str
    * desc: end_page=&quot;2000&quot;; 结束页码
    * required: 
    */
    private String p_endpage;

    public String getP_endpage() { return this.p_endpage;}
    public void setP_endpage(String v) { this.p_endpage = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
