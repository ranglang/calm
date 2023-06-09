
    package com.onectrm.akshare.api.generated.spot;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: spot
    * 接口: spot_hist_sge
    * 目标地址: https://www.sge.com.cn/sjzx/mrhq
    * 描述: 上海黄金交易所-数据资讯-行情走势-历史数据
    * 限量: 单次返回指定 symbol 的所有历史数据
    */
    public class spot_hist_sgeRequest extends AkShareRequestAndResponse {
    public spot_hist_sgeRequest(){
    setInterfaceName("spot_hist_sge");
    }

    public static String name() {
        return "spot_hist_sge";
    }
    public String getName() {
    return "spot_hist_sge";
    }

    public static spot_hist_sgeRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    spot_hist_sgeRequest t = new spot_hist_sgeRequest();


    t.p_symbol = p_symbol;
    t.other.put("symbol", p_symbol.toString());


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
    * desc: symbol=&quot;Au99.99&quot;; 可以通过 ak.spot_symbol_table_sge() 获取品种表
    * required: 
    */
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
