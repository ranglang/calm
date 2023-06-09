
    package com.onectrm.akshare.api.generated.index;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: index
    * 接口: spot_goods
    * 目标地址: http://finance.sina.com.cn/futuremarket/spotprice.shtml#titlePos_0
    * 描述: 新浪财经-商品现货价格指数
    * 限量: 返回指定 symbol 的数据
    */
    public class spot_goodsRequest extends AkShareRequestAndResponse {
    public spot_goodsRequest(){
    setInterfaceName("spot_goods");
    }

    public static String name() {
        return "spot_goods";
    }
    public String getName() {
    return "spot_goods";
    }

    public static spot_goodsRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    spot_goodsRequest t = new spot_goodsRequest();


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
    * desc: symbol=&quot;composite&quot;; choice of {&quot;composite&quot;, &quot;shanghai-rotterdam&quot;, &quot;rotterdam-shanghai&quot;, &quot;shanghai-los angeles&quot;, &quot;los angeles-shanghai&quot;, &quot;shanghai-genoa&quot;, &quot;new york-rotterdam&quot;, &quot;rotterdam-new york&quot;}
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
