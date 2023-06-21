package io.github.ealenxie.pingpong.v1.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/3/30 10:34
 */
@Getter
@Setter
public class StoreInfoList {
    /**
     * 页码
     */
    @JsonProperty("pg_no")
    private Integer pgNo;
    /**
     * 总页数 (当大于1 时需要分页获取)
     */
    @JsonProperty("total_pg")
    private Integer totalPg;
    /**
     * 店铺列表信息
     */
    @JsonProperty("storeInfoList")
    private List<StoreInfo> storeInfos;
}
