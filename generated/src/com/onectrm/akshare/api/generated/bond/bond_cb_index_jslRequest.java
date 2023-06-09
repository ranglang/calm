
    package com.onectrm.akshare.api.generated.bond;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: bond
    * 接口: bond_cb_index_jsl
    * 目标地址: https://www.jisilu.cn/data/cbnew/cb_index/
    * 描述: 可转债-集思录可转债等权指数
    * 限量: 单次返回所有历史数据数据
    */
    public class bond_cb_index_jslRequest extends AkShareRequestAndResponse {
    public bond_cb_index_jslRequest(){
    setInterfaceName("bond_cb_index_jsl");
    }

    public static String name() {
        return "bond_cb_index_jsl";
    }
    public String getName() {
    return "bond_cb_index_jsl";
    }

    public static bond_cb_index_jslRequest of(



    Map.Entry
    <String
    , String>... others){
    bond_cb_index_jslRequest t = new bond_cb_index_jslRequest();



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
