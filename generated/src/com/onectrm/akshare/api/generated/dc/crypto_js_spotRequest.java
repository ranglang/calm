
    package com.onectrm.akshare.api.generated.dc;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: dc
    * 接口: crypto_js_spot
    * 目标地址: https://datacenter.jin10.com/reportType/dc_bitcoin_current
    * 描述: 加密货币实时行情
    * 限量: 单次返回主流加密货币当前时点行情数据
    */
    public class crypto_js_spotRequest extends AkShareRequestAndResponse {
    public crypto_js_spotRequest(){
    setInterfaceName("crypto_js_spot");
    }

    public static String name() {
        return "crypto_js_spot";
    }
    public String getName() {
    return "crypto_js_spot";
    }

    public static crypto_js_spotRequest of(



    Map.Entry
    <String
    , String>... others){
    crypto_js_spotRequest t = new crypto_js_spotRequest();



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
