
    package com.onectrm.akshare.api.generated.others;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: others
    * 接口: air_quality_hebei
    * 目标地址: http://110.249.223.67/publish/
    * 描述: 河北省指定 symbol 的最近 6 天空气质量数据
    * 限量: 单次指定 symbol 的最近 6 天的数据
    */
    public class air_quality_hebeiRequest extends AkShareRequestAndResponse {
    public air_quality_hebeiRequest(){
    setInterfaceName("air_quality_hebei");
    }

    public static String name() {
        return "air_quality_hebei";
    }
    public String getName() {
    return "air_quality_hebei";
    }

    public static air_quality_hebeiRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    air_quality_hebeiRequest t = new air_quality_hebeiRequest();


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
    * desc: symbol=&quot;定州市&quot;, 返回具体市的数据; symbol=&quot;&quot;, 则返回所有城市数据
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
