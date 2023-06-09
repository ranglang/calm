
    package com.onectrm.akshare.api.generated.futures;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: futures
    * 接口: futures_pig_info
    * 目标地址: https://zhujia.zhuwang.cc/
    * 描述: 养猪数据中心-猪肉价格信息数据
    * 限量: 单次返回指定 symbol 的所有历史数据
    */
    public class futures_pig_infoRequest extends AkShareRequestAndResponse {
    public futures_pig_infoRequest(){
    setInterfaceName("futures_pig_info");
    }

    public static String name() {
        return "futures_pig_info";
    }
    public String getName() {
    return "futures_pig_info";
    }

    public static futures_pig_infoRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    futures_pig_infoRequest t = new futures_pig_infoRequest();


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
    * desc: symbol=&quot;猪肉批发价&quot;; choice of {&quot;猪肉批发价&quot;, &quot;仔猪价格&quot;, &quot;生猪期货指数&quot;, &quot;二元母猪价格&quot;, &quot;生猪产能数据&quot;, &quot;饲料原料数据&quot;, &quot;中央储备冻猪肉&quot;, &quot;白条肉&quot;, &quot;育肥猪配合饲料&quot;, &quot;肉类价格指数&quot;, &quot;猪粮比价&quot;, &quot;猪企销售简报-销售量&quot;, &quot;猪企销售简报-销售额&quot;, &quot;猪企销售简报-销售均价&quot;}
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
