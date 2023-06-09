
    package com.onectrm.akshare.api.generated.bond;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: bond
    * 接口: bond_china_close_return
    * 目标地址: http://www.chinamoney.com.cn/chinese/bkcurvclosedyhis/?bondType=CYCC000&amp;reference=1
    * 描述: 收盘收益率曲线历史数据, 该接口只能获取近 3 个月的数据，且每次获取的数据不超过 1 个月
    * 限量: 返回所有交易日的数据
    */
    public class bond_china_close_returnRequest extends AkShareRequestAndResponse {
    public bond_china_close_returnRequest(){
    setInterfaceName("bond_china_close_return");
    }

    public static String name() {
        return "bond_china_close_return";
    }
    public String getName() {
    return "bond_china_close_return";
    }

    public static bond_china_close_returnRequest of(



    Map.Entry
    <String
    , String>... others){
    bond_china_close_returnRequest t = new bond_china_close_returnRequest();



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
