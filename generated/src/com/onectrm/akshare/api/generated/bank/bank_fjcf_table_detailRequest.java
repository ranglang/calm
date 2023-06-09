
    package com.onectrm.akshare.api.generated.bank;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: bank
    * 接口: bank_fjcf_table_detail
    * 目标地址: http://www.cbirc.gov.cn/cn/view/pages/ItemDetail.html?docId=881574&amp;itemId=4115&amp;generaltype=9
    * 描述: 首页-政务信息-行政处罚-银保监分局本级-XXXX行政处罚信息公开表, 是信息公开表不是处罚决定书书
    * 限量: 单次返回银保监分局本级行政处罚中的指定页数的所有表格数据
    */
    public class bank_fjcf_table_detailRequest extends AkShareRequestAndResponse {
    public bank_fjcf_table_detailRequest(){
    setInterfaceName("bank_fjcf_table_detail");
    }

    public static String name() {
        return "bank_fjcf_table_detail";
    }
    public String getName() {
    return "bank_fjcf_table_detail";
    }

    public static bank_fjcf_table_detailRequest of(


    Integer p_page,


    Map.Entry
    <String
    , String>... others){
    bank_fjcf_table_detailRequest t = new bank_fjcf_table_detailRequest();


    t.p_page = p_page;
    t.other.put("page", p_page.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: page
    * type: int
    * desc: page=5, 获取前 5 页数据, 并返回处理好后的数据框
    * required: Y
    */
    private Integer p_page;

    public Integer getP_page() { return this.p_page;}
    public void setP_page(Integer v) { this.p_page = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
