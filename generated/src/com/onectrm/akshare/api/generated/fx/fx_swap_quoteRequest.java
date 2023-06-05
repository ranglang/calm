
    package com.onectrm.akshare.api.generated.fx;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fx
    * 接口: fx_swap_quote
    * 目标地址: http://www.chinamoney.com.cn/chinese/mkdatapfx/
    * 描述: 人民币外汇远掉报价
    * 限量: 单次返回实时行情数据
    */
    public class fx_swap_quoteRequest extends AkShareRequestAndResponse {
    public fx_swap_quoteRequest(){
    setInterfaceName("fx_swap_quote");
    }

    public static String name() {
        return "fx_swap_quote";
    }
    public String getName() {
    return "fx_swap_quote";
    }

    public static fx_swap_quoteRequest of(



    Map.Entry
    <String
    , String>... others){
    fx_swap_quoteRequest t = new fx_swap_quoteRequest();



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
