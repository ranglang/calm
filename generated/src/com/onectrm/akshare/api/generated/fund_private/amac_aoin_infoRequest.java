
    package com.onectrm.akshare.api.generated.fund_private;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: fund_private
    * 接口: amac_aoin_info
    * 目标地址: http://gs.amac.org.cn/amac-infodisc/res/aoin/product/index.html
    * 描述: 获取中国证券投资基金业协会-信息公示-基金产品公示-证券公司直投基金
    * 限量: 单次返回当前时刻所有历史数据
    */
    public class amac_aoin_infoRequest extends AkShareRequestAndResponse {
    public amac_aoin_infoRequest(){
    setInterfaceName("amac_aoin_info");
    }

    public static String name() {
        return "amac_aoin_info";
    }
    public String getName() {
    return "amac_aoin_info";
    }

    public static amac_aoin_infoRequest of(



    Map.Entry
    <String
    , String>... others){
    amac_aoin_infoRequest t = new amac_aoin_infoRequest();



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
