package io.github.ealenxie.winit.lma;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/4/21 16:49
 * @version 1.0
 */
@Getter
@Setter
public class BatchPrintResponse {

    /**
     * 获取面单失败的个数
     */
    @JsonProperty("failedCount")
    private Integer failedCount;
    /**
     * 正在抓取中面单的个数
     */
    @JsonProperty("obtainingCount")
    private Integer obtainingCount;
    /**
     * 获取面单成功的个数
     */
    @JsonProperty("successCount")
    private Integer successCount;
    /**
     * 面单列表
     */
    @JsonProperty("labelList")
    private List<LabelList> labelList;
    /**
     * 正在抓取中面单的订单列表
     */
    @JsonProperty("obtainList")
    private List<LabelList> obtainList;
    /**
     * 获取面单失败的列表
     */
    @JsonProperty("failureList")
    private List<?> failureList;
}
