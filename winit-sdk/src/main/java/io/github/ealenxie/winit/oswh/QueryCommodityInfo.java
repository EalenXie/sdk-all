package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/1/28 15:13
 * @version 1.0
 */

@Getter
@Setter
public class QueryCommodityInfo {

    /**
     * 页码信息
     */
    @JsonProperty("pageNo")
    private Integer pageNo = 1;
    /**
     * 每页记录数
     */
    @JsonProperty("pageSize")
    private Integer pageSize = 100;
    /**
     * 商品编码SKU
     */
    @JsonProperty("skuCode")
    private String skuCode;
    /**
     * 商品注册开始时间 格式：YYYY-MM-DD HH:MM:SS
     */
    @JsonProperty("startTime")
    private String startTime;
    /**
     * 商品注册结束时间 格式：YYYY-MM-DD HH:MM:SS
     */
    @JsonProperty("endTime")
    private String endTime;
}
