
    package com.onectrm.akshare.api.generated.article;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: article
    * 接口: article_ff_crr
    * 目标地址: http://mba.tuck.dartmouth.edu/pages/faculty/ken.french/data_library.html
    * 描述: 获取 Current Research Returns 多因子数据
    * 限量: 单次返回所有历史数据
    */
    public class article_ff_crrRequest extends AkShareRequestAndResponse {
    public article_ff_crrRequest(){
    setInterfaceName("article_ff_crr");
    }

    public static String name() {
        return "article_ff_crr";
    }
    public String getName() {
    return "article_ff_crr";
    }

    public static article_ff_crrRequest of(



    Map.Entry
    <String
    , String>... others){
    article_ff_crrRequest t = new article_ff_crrRequest();



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
