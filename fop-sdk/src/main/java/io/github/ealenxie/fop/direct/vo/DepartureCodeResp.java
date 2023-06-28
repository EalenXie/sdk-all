package io.github.ealenxie.fop.direct.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 12:33
 */
@Getter
@Setter
public class DepartureCodeResp {

    /**
     * 出库预报批次号（一次预报产生一个唯一识别的批次号）
     */
    @JsonProperty("departure_code")
    private String departureCode;

    /**
     * 请求id
     */
    @JsonProperty("request_id")
    private String requestId;
}
