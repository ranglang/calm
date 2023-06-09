
    package com.onectrm.akshare.api.generated.others;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: others
    * 接口: cost_living
    * 目标地址: https://expatistan.com/cost-of-living/index
    * 描述: 世界各大城市生活成本数据
    * 限量: 返回当前时点所有数据
    */
    public class cost_livingRequest extends AkShareRequestAndResponse {
    public cost_livingRequest(){
    setInterfaceName("cost_living");
    }

    public static String name() {
        return "cost_living";
    }
    public String getName() {
    return "cost_living";
    }

    public static cost_livingRequest of(


    String p_region,


    Map.Entry
    <String
    , String>... others){
    cost_livingRequest t = new cost_livingRequest();


    t.p_region = p_region;
    t.other.put("region", p_region.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: region
    * type: str
    * desc: region=&quot;world&quot;, 默认, 返回所有城市数据, 其他城市请查看 **城市一览表**
    * required: 
    */
    private String p_region;

    public String getP_region() { return this.p_region;}
    public void setP_region(String v) { this.p_region = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
