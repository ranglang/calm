
    package com.onectrm.akshare.api.generated.futures;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: futures
    * 接口: futures_dce_position_rank
    * 目标地址: http://www.dce.com.cn/dalianshangpin/xqsj/tjsj26/rtj/rcjccpm/index.html
    * 描述: 获取大连商品交易所指定交易日的具体合约的持仓排名
    * 限量: 单次返回所有合约的持仓排名数据, 返回以合约名字为键, 具体排名数据为值的字典
    */
    public class futures_dce_position_rankRequest extends AkShareRequestAndResponse {
    public futures_dce_position_rankRequest(){
    setInterfaceName("futures_dce_position_rank");
    }

    public static String name() {
        return "futures_dce_position_rank";
    }
    public String getName() {
    return "futures_dce_position_rank";
    }

    public static futures_dce_position_rankRequest of(


    String p_date,


    Map.Entry
    <String
    , String>... others){
    futures_dce_position_rankRequest t = new futures_dce_position_rankRequest();


    t.p_date = p_date;
    t.other.put("date", p_date.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: date
    * type: str
    * desc: date=&quot;20200511&quot;; 指定交易日, 该数据接口可以获取从 2000 年开始的数据, 20160104 由于交易所数据问题，返回为空可以调用 **futures_dce_position_rank_other** 来返回数据
    * required: Y
    */
    private String p_date;

    public String getP_date() { return this.p_date;}
    public void setP_date(String v) { this.p_date = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
