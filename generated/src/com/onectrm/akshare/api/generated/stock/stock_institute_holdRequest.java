
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_institute_hold
    * 目标地址: http://vip.stock.finance.sina.com.cn/q/go.php/vComStockHold/kind/jgcg/index.phtml
    * 描述: 获取新浪财经-机构持股-机构持股一览表
    * 限量: 单次获取新浪财经-机构持股-机构持股一览表所有数据
    */
    public class stock_institute_holdRequest extends AkShareRequestAndResponse {
    public stock_institute_holdRequest(){
    setInterfaceName("stock_institute_hold");
    }

    public static String name() {
        return "stock_institute_hold";
    }
    public String getName() {
    return "stock_institute_hold";
    }

    public static stock_institute_holdRequest of(


    String p_quarter,


    Map.Entry
    <String
    , String>... others){
    stock_institute_holdRequest t = new stock_institute_holdRequest();


    t.p_quarter = p_quarter;
    t.other.put("quarter", p_quarter.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: quarter
    * type: str
    * desc: quarter=&quot;20051&quot;; 从 2005 年开始, {&quot;一季报&quot;:1, &quot;中报&quot;:2 &quot;三季报&quot;:3 &quot;年报&quot;:4}, e.g., &quot;20191&quot;, 其中的 1 表示一季报; &quot;20193&quot;, 其中的 3 表示三季报;
    * required: Y
    */
    private String p_quarter;

    public String getP_quarter() { return this.p_quarter;}
    public void setP_quarter(String v) { this.p_quarter = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
