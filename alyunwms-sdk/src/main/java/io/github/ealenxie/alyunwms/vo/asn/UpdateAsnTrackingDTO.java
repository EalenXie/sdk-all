package io.github.ealenxie.alyunwms.vo.asn;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/2/24 16:29
 * @version 1.0
 */
@Getter
@Setter
public class UpdateAsnTrackingDTO {

    /**
     * 入库单号
     */
    @JsonProperty("receiving_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String receivingCode;
    /**
     * 跟踪号(可传多个以英文逗号隔开，需开启 BATCH_TRACKING_NUMBER 这个配置)
     */
    @JsonProperty("tracking_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String trackingNumber;
}
