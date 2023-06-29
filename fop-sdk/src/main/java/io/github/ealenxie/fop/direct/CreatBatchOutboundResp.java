package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 11:40
 */
@Getter
@Setter
public class CreatBatchOutboundResp {

    /**
     * 请求id
     */
    @JsonProperty("requestId")
    private String requestId;

    /**
     * 出库预报批次号（一次预报产生一个唯一识别的批次号）
     */
    @JsonProperty("departureCode")
    private String departureCode;
}
