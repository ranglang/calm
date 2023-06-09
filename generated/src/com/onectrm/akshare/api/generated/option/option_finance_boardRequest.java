
    package com.onectrm.akshare.api.generated.option;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: option
    * 接口: option_finance_board
    * 目标地址: http://www.sse.com.cn/assortment/options/price/, http://www.szse.cn/market/derivative/derivative_list/index.html, http://www.cffex.com.cn/hs300gzqq/
    * 描述: 上海证券交易所、深圳证券交易所、中国金融期货交易所的金融期权行情数据
    * 限量: 单次返回当前交易日指定合约期权行情数据
    */
    public class option_finance_boardRequest extends AkShareRequestAndResponse {
    public option_finance_boardRequest(){
    setInterfaceName("option_finance_board");
    }

    public static String name() {
        return "option_finance_board";
    }
    public String getName() {
    return "option_finance_board";
    }

    public static option_finance_boardRequest of(


    String p_symbol,

    String p_endmonth,


    Map.Entry
    <String
    , String>... others){
    option_finance_boardRequest t = new option_finance_boardRequest();


    t.p_symbol = p_symbol;
    t.other.put("symbol", p_symbol.toString());

    t.p_endmonth = p_endmonth;
    t.other.put("end_month", p_endmonth.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: symbol
    * type: str
    * desc: symbol=&quot;华泰柏瑞沪深300ETF期权&quot;; 合约名称: **金融期权合约名称一览表**
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: end_month
    * type: str
    * desc: end_month=&quot;2003&quot;; 合约到期月份: 2020年3月, 只能获取近期合约的数据
    * required: 
    */
    private String p_endmonth;

    public String getP_endmonth() { return this.p_endmonth;}
    public void setP_endmonth(String v) { this.p_endmonth = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
