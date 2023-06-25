package io.github.ealenxie.goodcang.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/25 13:00
 */
@Getter
@Setter
public class TaskStatus {

    /**
     * 请求id
     */
    @JsonProperty("request_id")
    private String requestId;
    /**
     * 文档编码（出库单号、入库单号、 sku 等等）
     */
    @JsonProperty("doc_no")
    private String docNo;
    /**
     * 状态
     */
    @JsonProperty("status")
    private Integer status;
    /**
     * 失败信息
     */
    @JsonProperty("error_message")
    private String errorMessage;
}
