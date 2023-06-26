package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 13:19
 */
@Getter
@Setter
public class DocumentFileResponse {

    /**
     * 入库单号
     */
    @JsonProperty("receiving_code")
    private String receivingCode;
    /**
     * 状态
     */
    @JsonProperty("file_status")
    private Integer fileStatus;
}
