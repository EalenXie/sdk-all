package io.github.ealenxie.goodcang.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.goodcang.PagePayload;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/25 12:54
 */
@Getter
@Setter
public class FuelRatePayload extends PagePayload {

    /**
     * 物流产品
     */
    @JsonProperty("logistic_type")
    private Integer logisticType;
    /**
     * 物流产品编码
     */
    @JsonProperty("sm_code")
    private String smCode;
    /**
     * 起始生效时间
     */
    @JsonProperty("begin_time")
    private String beginTime;
    /**
     * 结束生效时间
     */
    @JsonProperty("end_time")
    private String endTime;

}
