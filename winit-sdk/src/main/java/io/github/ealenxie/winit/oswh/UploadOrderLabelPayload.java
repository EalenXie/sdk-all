package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 出库上传附件请求实体
 *
 * @author create by sch  2023/4/20 16:30
 * @version 1.0
 */
@Getter
@Setter
public class UploadOrderLabelPayload {

    /**
     * 海外仓出库单号
     */
    @JsonProperty("masterOrderNo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String masterOrderNo;
    /**
     * 卖家订单号（客户自定义）
     */
    @JsonProperty("thirdOrderNo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String thirdOrderNo;
    /**
     * 上传附件列表
     */
    @JsonProperty("labels")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<OrderLabelPayload> labels;
}
