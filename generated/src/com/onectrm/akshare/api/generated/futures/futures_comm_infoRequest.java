
    package com.onectrm.akshare.api.generated.futures;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: futures
    * 接口: futures_comm_info
    * 目标地址: http://www.9qihuo.com/qihuoshouxufei
    * 描述: 九期网-期货手续费数据
    * 限量: 单次返回指定 symbol 的所有数据
    */
    public class futures_comm_infoRequest extends AkShareRequestAndResponse {
    public futures_comm_infoRequest(){
    setInterfaceName("futures_comm_info");
    }

    public static String name() {
        return "futures_comm_info";
    }
    public String getName() {
    return "futures_comm_info";
    }

    public static futures_comm_infoRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    futures_comm_infoRequest t = new futures_comm_infoRequest();


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
    * desc: symbol=&quot;所有&quot;; choice of {&quot;所有&quot;, &quot;上海期货交易所&quot;, &quot;大连商品交易所&quot;, &quot;郑州商品交易所&quot;, &quot;上海国际能源交易中心&quot;, &quot;中国金融期货交易所&quot;}
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
