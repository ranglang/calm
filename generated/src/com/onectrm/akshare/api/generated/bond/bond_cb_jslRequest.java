
    package com.onectrm.akshare.api.generated.bond;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: bond
    * 接口: bond_cb_jsl
    * 目标地址: https://app.jisilu.cn/data/cbnew/#cb
    * 描述: 集思录可转债实时数据，包含行情数据（涨跌幅，成交量和换手率等）及可转债基本信息（转股价，溢价率和到期收益率等）
    * 限量: 单次返回当前交易时刻的所有数据
    */
    public class bond_cb_jslRequest extends AkShareRequestAndResponse {
    public bond_cb_jslRequest(){
    setInterfaceName("bond_cb_jsl");
    }

    public static String name() {
        return "bond_cb_jsl";
    }
    public String getName() {
    return "bond_cb_jsl";
    }

    public static bond_cb_jslRequest of(


    String p_cookie,


    Map.Entry
    <String
    , String>... others){
    bond_cb_jslRequest t = new bond_cb_jslRequest();


    t.p_cookie = p_cookie;
    t.other.put("cookie", p_cookie.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: cookie
    * type: str
    * desc: cookie=&#39;&#39;; 此处输入您的集思录 cookie 就可以获取完整数据，否则只能返回前 30 条
    * required: 
    */
    private String p_cookie;

    public String getP_cookie() { return this.p_cookie;}
    public void setP_cookie(String v) { this.p_cookie = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
