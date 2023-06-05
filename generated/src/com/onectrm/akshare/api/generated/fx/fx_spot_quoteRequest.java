
    package com.onectrm.akshare.api.generated.fx;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fx
    * 接口: fx_spot_quote
    * 目标地址: http://www.chinamoney.com.cn/chinese/mkdatapfx/
    * 描述: 人民币外汇即期报价
    * 限量: 单次返回实时行情数据
    */
    public class fx_spot_quoteRequest extends AkShareRequestAndResponse {
    public fx_spot_quoteRequest(){
    setInterfaceName("fx_spot_quote");
    }

    public static String name() {
        return "fx_spot_quote";
    }
    public String getName() {
    return "fx_spot_quote";
    }

    public static fx_spot_quoteRequest of(



    Map.Entry
    <String
    , String>... others){
    fx_spot_quoteRequest t = new fx_spot_quoteRequest();



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
