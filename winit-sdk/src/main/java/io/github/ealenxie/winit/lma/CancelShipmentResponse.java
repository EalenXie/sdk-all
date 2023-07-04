package io.github.ealenxie.winit.lma;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/4/21 16:14
 * @version 1.0
 */
@Getter
@Setter
public class CancelShipmentResponse {

    /**
     * 失败个数
     */
    @JsonProperty("failedCount")
    private Integer failedCount;
    /**
     * 成功个数
     */
    @JsonProperty("successCount")
    private Integer successCount;
    /**
     * 错误信息
     */
    @JsonProperty("errorMsg")
    private List<String> errorMsg;
}
