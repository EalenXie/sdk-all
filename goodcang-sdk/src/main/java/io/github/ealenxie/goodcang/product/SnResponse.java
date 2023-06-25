package io.github.ealenxie.goodcang.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/25 16:24
 */
@Getter
@Setter
public class SnResponse {

    /**
     * 品类ID
     */
    @JsonProperty("serial_number")
    private String serialNumber;
    /**
     * 状态
     */
    @JsonProperty("status")
    private String status;
    /**
     * 错误原因
     */
    @JsonProperty("msg")
    private String msg;
}
