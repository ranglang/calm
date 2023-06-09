
    package com.onectrm.akshare.api.generated.bond;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: bond
    * 接口: get_bond_bank
    * 目标地址: http://zhuce.nafmii.org.cn/fans/publicQuery/manager
    * 描述: 银行间债券市场数据
    * 限量: 单次最大 20 行, 建议用循环获取数据
    */
    public class get_bond_bankRequest extends AkShareRequestAndResponse {
    public get_bond_bankRequest(){
    setInterfaceName("get_bond_bank");
    }

    public static String name() {
        return "get_bond_bank";
    }
    public String getName() {
    return "get_bond_bank";
    }

    public static get_bond_bankRequest of(


    Integer p_pagenum,


    Map.Entry
    <String
    , String>... others){
    get_bond_bankRequest t = new get_bond_bankRequest();


    t.p_pagenum = p_pagenum;
    t.other.put("page_num", p_pagenum.toString());


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: page_num
    * type: int
    * desc: 默认参数 page_num=1, 输入想要提取的页码, 多页提取请用 for 循环
    * required: 
    */
    private Integer p_pagenum;

    public Integer getP_pagenum() { return this.p_pagenum;}
    public void setP_pagenum(Integer v) { this.p_pagenum = v;}


    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
