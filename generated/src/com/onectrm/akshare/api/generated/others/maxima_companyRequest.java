
    package com.onectrm.akshare.api.generated.others;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: others
    * 接口: maxima_company
    * 目标地址: https://www.itjuzi.com/chollima
    * 描述: 获取千里马公司数据库, 该数据未更新
    * 限量: 返回所有历史数据, 该数据未更新
    */
    public class maxima_companyRequest extends AkShareRequestAndResponse {
    public maxima_companyRequest(){
    setInterfaceName("maxima_company");
    }

    public static String name() {
        return "maxima_company";
    }
    public String getName() {
    return "maxima_company";
    }

    public static maxima_companyRequest of(


    String p_,


    Map.Entry
    <String
    , String>... others){
    maxima_companyRequest t = new maxima_companyRequest();


    t.p_ = p_;
    t.other.put("-     -", p_.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 
    * type: 
    * desc: -     -
    * required: 
    */
    private String p_;

    public String getP_() { return this.p_;}
    public void setP_(String v) { this.p_ = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
