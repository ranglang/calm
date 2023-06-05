
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_zh_ah_spot
    * 目标地址: http://stockapp.finance.qq.com/mstats/#mod=list&amp;id=hk_ah&amp;module=HK&amp;type=AH
    * 描述: A+H 股数据是从腾讯财经获取的数据, 延迟 15 分钟更新
    * 限量: 单次返回所有 A+H 上市公司的实时行情数据
    */
    public class stock_zh_ah_spotRequest extends AkShareRequestAndResponse {
    public stock_zh_ah_spotRequest(){
    setInterfaceName("stock_zh_ah_spot");
    }

    public static String name() {
        return "stock_zh_ah_spot";
    }
    public String getName() {
    return "stock_zh_ah_spot";
    }

    public static stock_zh_ah_spotRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_zh_ah_spotRequest t = new stock_zh_ah_spotRequest();



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
