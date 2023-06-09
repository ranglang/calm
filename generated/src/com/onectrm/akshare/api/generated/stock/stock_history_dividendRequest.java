
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: stock
    * 接口: stock_history_dividend
    * 目标地址: http://vip.stock.finance.sina.com.cn/q/go.php/vInvestConsult/kind/lsfh/index.phtml?p=1&amp;num=5000
    * 描述: 新浪财经-发行与分配-历史分红
    * 限量: 单次获取所有股票的历史分红数据
    */
    public class stock_history_dividendRequest extends AkShareRequestAndResponse {
    public stock_history_dividendRequest(){
    setInterfaceName("stock_history_dividend");
    }

    public static String name() {
        return "stock_history_dividend";
    }
    public String getName() {
    return "stock_history_dividend";
    }

    public static stock_history_dividendRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_history_dividendRequest t = new stock_history_dividendRequest();



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
