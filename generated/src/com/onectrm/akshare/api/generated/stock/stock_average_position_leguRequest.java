
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_average_position_legu
    * 目标地址: https://www.legulegu.com/stockdata/averageposition
    * 描述: 乐咕乐股网-调查平均持仓数据; 该数据近期未更新
    * 限量: 单次返回所有平均持仓数据
    */
    public class stock_average_position_leguRequest extends AkShareRequestAndResponse {
    public stock_average_position_leguRequest(){
    setInterfaceName("stock_average_position_legu");
    }

    public static String name() {
        return "stock_average_position_legu";
    }
    public String getName() {
    return "stock_average_position_legu";
    }

    public static stock_average_position_leguRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_average_position_leguRequest t = new stock_average_position_leguRequest();



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
