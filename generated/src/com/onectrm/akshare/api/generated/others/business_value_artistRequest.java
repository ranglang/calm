
    package com.onectrm.akshare.api.generated.others;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: others
    * 接口: business_value_artist
    * 目标地址: https://www.endata.com.cn/Marketing/Artist/business.html
    * 描述: 艺恩-艺人-艺人商业价值
    * 限量: 返回当前的艺人商业价值数据
    */
    public class business_value_artistRequest extends AkShareRequestAndResponse {
    public business_value_artistRequest(){
    setInterfaceName("business_value_artist");
    }

    public static String name() {
        return "business_value_artist";
    }
    public String getName() {
    return "business_value_artist";
    }

    public static business_value_artistRequest of(



    Map.Entry
    <String
    , String>... others){
    business_value_artistRequest t = new business_value_artistRequest();



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
