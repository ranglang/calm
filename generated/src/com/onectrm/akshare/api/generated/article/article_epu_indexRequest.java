
    package com.onectrm.akshare.api.generated.article;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: article
    * 接口: article_epu_index
    * 目标地址: http://www.policyuncertainty.com/index.html
    * 描述: 获取国家或地区的经济政策不确定性(EPU)数据
    * 限量: 单次返回某个具体国家或地区的所有月度经济政策不确定性数据
    */
    public class article_epu_indexRequest extends AkShareRequestAndResponse {
    public article_epu_indexRequest(){
    setInterfaceName("article_epu_index");
    }

    public static String name() {
        return "article_epu_index";
    }
    public String getName() {
    return "article_epu_index";
    }

    public static article_epu_indexRequest of(


    String p_index,


    Map.Entry
    <String
    , String>... others){
    article_epu_indexRequest t = new article_epu_indexRequest();


    t.p_index = p_index;
    t.other.put("index", p_index.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: index
    * type: str
    * desc: index=&quot;China&quot;; 按 **国家和地区一览表** 输入相应参数
    * required: Y
    */
    private String p_index;

    public String getP_index() { return this.p_index;}
    public void setP_index(String v) { this.p_index = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
