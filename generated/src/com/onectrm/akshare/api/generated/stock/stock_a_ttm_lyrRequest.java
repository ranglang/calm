
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_a_ttm_lyr
    * 目标地址: https://www.legulegu.com/stockdata/a-ttm-lyr
    * 描述: 乐咕乐股-A 股等权重市盈率与中位数市盈率
    * 限量: 单次返回所有数据
    */
    public class stock_a_ttm_lyrRequest extends AkShareRequestAndResponse {
    public stock_a_ttm_lyrRequest(){
    setInterfaceName("stock_a_ttm_lyr");
    }

    public static String name() {
        return "stock_a_ttm_lyr";
    }
    public String getName() {
    return "stock_a_ttm_lyr";
    }

    public static stock_a_ttm_lyrRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_a_ttm_lyrRequest t = new stock_a_ttm_lyrRequest();



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
