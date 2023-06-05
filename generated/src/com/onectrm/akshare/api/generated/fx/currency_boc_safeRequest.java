
    package com.onectrm.akshare.api.generated.fx;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fx
    * 接口: currency_boc_safe
    * 目标地址: http://www.safe.gov.cn/safe/rmbhlzjj/index.html
    * 描述: 外汇管理局-人民币汇率中间价
    * 限量: 单次返回所有历史数据
    */
    public class currency_boc_safeRequest extends AkShareRequestAndResponse {
    public currency_boc_safeRequest(){
    setInterfaceName("currency_boc_safe");
    }

    public static String name() {
        return "currency_boc_safe";
    }
    public String getName() {
    return "currency_boc_safe";
    }

    public static currency_boc_safeRequest of(



    Map.Entry
    <String
    , String>... others){
    currency_boc_safeRequest t = new currency_boc_safeRequest();



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
