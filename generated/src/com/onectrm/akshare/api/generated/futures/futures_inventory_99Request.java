
    package com.onectrm.akshare.api.generated.futures;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: futures
    * 接口: futures_inventory_99
    * 目标地址: http://www.99qh.com/d/store.aspx
    * 描述: 99 期货网-大宗商品库存数据; 周频率
    * 限量: 单次返回指定 exchange 和指定 symbol 的具体品种的期货库存数据, 仓单日报数据
    */
    public class futures_inventory_99Request extends AkShareRequestAndResponse {
    public futures_inventory_99Request(){
    setInterfaceName("futures_inventory_99");
    }

    public static String name() {
        return "futures_inventory_99";
    }
    public String getName() {
    return "futures_inventory_99";
    }

    public static futures_inventory_99Request of(


    String p_exchange,

    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    futures_inventory_99Request t = new futures_inventory_99Request();


    t.p_exchange = p_exchange;
    t.other.put("exchange", p_exchange.toString());

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
    * name: exchange
    * type: str
    * desc: exchange=&#39;大连商品交易所&#39;; 交易所名称; choice of {&quot;上海期货交易所&quot;, &quot;郑州商品交易所&quot;, &quot;大连商品交易所&quot;, &quot;LME&quot;, &quot;NYMEX&quot;, &quot;CBOT&quot;, &quot;NYBOT&quot;, &quot;TOCOM&quot;, &quot;上海国际能源交易中心&quot;, &quot;OSE&quot;}; 具体交易所查询：http://www.99qh.com/d/store.aspx
    * required: 
    */
    private String p_exchange;

    public String getP_exchange() { return this.p_exchange;}
    public void setP_exchange(String v) { this.p_exchange = v;}

    /**
    * name: symbol
    * type: str
    * desc: symbol=&#39;豆一&#39;; 交易所对应的具体品种; 如：大连商品交易所的 豆一; 具体品种查询：http://www.99qh.com/d/store.aspx
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
