package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 15:46
 */
@Getter
@Setter
public class ReturnOrderListPayload {

    /**
     * 每页行数
     */
    @JsonProperty("pageSize")
    private Integer pageSize;
    /**
     * 当前页
     */
    @JsonProperty("currentPage")
    private Integer currentPage;
    /**
     * 创建时间
     */
    @JsonProperty("startTime")
    private String startTime;
    /**
     * 创建时间
     */
    @JsonProperty("endTime")
    private String endTime;
    /**
     * 更新时间
     */
    @JsonProperty("startUpdateTime")
    private String startUpdateTime;
    /**
     * 结束更新时间
     */
    @JsonProperty("endUpdateTime")
    private String endUpdateTime;
    /**
     * 售后退件状态
     */
    @JsonProperty("asroStatus")
    private Integer asroStatus;
    /**
     * 退件类型
     */
    @JsonProperty("cassType")
    private Integer cassType;
    /**
     * 退件单号
     */
    @JsonProperty("asroCodes")
    private String asroCodes;
}
