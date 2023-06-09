
    package com.onectrm.akshare.api.generated.macro;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: macro
    * 接口: macro_china_national_tax_receipts
    * 目标地址: http://data.eastmoney.com/cjsj/nationaltaxreceipts.aspx
    * 描述: 中国全国税收收入数据, 数据区间从 2005 一季度-至今
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_national_tax_receiptsRequest extends AkShareRequestAndResponse {
    public macro_china_national_tax_receiptsRequest(){
    setInterfaceName("macro_china_national_tax_receipts");
    }

    public static String name() {
        return "macro_china_national_tax_receipts";
    }
    public String getName() {
    return "macro_china_national_tax_receipts";
    }

    public static macro_china_national_tax_receiptsRequest of(



    Map.Entry
    <String
    , String>... others){
    macro_china_national_tax_receiptsRequest t = new macro_china_national_tax_receiptsRequest();



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
