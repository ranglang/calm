
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_zh_ah_name
    * 目标地址: http://stockapp.finance.qq.com/mstats/#mod=list&amp;id=hk_ah&amp;module=HK&amp;type=AH
    * 描述: A+H 股数据是从腾讯财经获取的数据, 历史数据按日频率更新
    * 限量: 单次返回所有 A+H 上市公司的代码和名称字典
    */
    public class stock_zh_ah_nameRequest extends AkShareRequestAndResponse {
    public stock_zh_ah_nameRequest(){
    setInterfaceName("stock_zh_ah_name");
    }

    public static String name() {
        return "stock_zh_ah_name";
    }
    public String getName() {
    return "stock_zh_ah_name";
    }

    public static stock_zh_ah_nameRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_zh_ah_nameRequest t = new stock_zh_ah_nameRequest();



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
