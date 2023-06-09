
    package com.onectrm.akshare.api.generated.others;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: others
    * 接口: sport_olympic_winter_hist
    * 目标地址: https://m.sports.qq.com/g/sv3/winter-oly22/winter-olympic-rank.htm?type=0
    * 描述: 腾讯运动-冬奥会-历届奖牌榜
    * 限量: 单次返回 1924-2018 年度的冬奥会历届奖牌榜数据
    */
    public class sport_olympic_winter_histRequest extends AkShareRequestAndResponse {
    public sport_olympic_winter_histRequest(){
    setInterfaceName("sport_olympic_winter_hist");
    }

    public static String name() {
        return "sport_olympic_winter_hist";
    }
    public String getName() {
    return "sport_olympic_winter_hist";
    }

    public static sport_olympic_winter_histRequest of(



    Map.Entry
    <String
    , String>... others){
    sport_olympic_winter_histRequest t = new sport_olympic_winter_histRequest();



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
