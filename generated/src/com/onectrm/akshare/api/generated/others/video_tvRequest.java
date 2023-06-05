
    package com.onectrm.akshare.api.generated.others;

    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类1: others
    * 接口: video_tv
    * 目标地址: https://www.endata.com.cn/Video/index.html
    * 描述: 艺恩-视频放映-电视剧集
    * 限量: 返回前一日的电视剧播映数据
    */
    public class video_tvRequest extends AkShareRequestAndResponse {
    public video_tvRequest(){
    setInterfaceName("video_tv");
    }

    public static String name() {
        return "video_tv";
    }
    public String getName() {
    return "video_tv";
    }

    public static video_tvRequest of(



    Map.Entry
    <String
    , String>... others){
    video_tvRequest t = new video_tvRequest();



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
