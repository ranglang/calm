
    package com.onectrm.akshare.api.generated.fx;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fx
    * 接口: fx_pair_quote
    * 目标地址: http://www.chinamoney.com.cn/chinese/mkdatapfx/
    * 描述: 外币对即期报价
    * 限量: 单次返回当前时点最近更新的即时数据
    */
    public class fx_pair_quoteRequest extends AkShareRequestAndResponse {
    public fx_pair_quoteRequest(){
    setInterfaceName("fx_pair_quote");
    }

    public static String name() {
        return "fx_pair_quote";
    }
    public String getName() {
    return "fx_pair_quote";
    }

    public static fx_pair_quoteRequest of(



    Map.Entry
    <String
    , String>... others){
    fx_pair_quoteRequest t = new fx_pair_quoteRequest();



    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }




    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
