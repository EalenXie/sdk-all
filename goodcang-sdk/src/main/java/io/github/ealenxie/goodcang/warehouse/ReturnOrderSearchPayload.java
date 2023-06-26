package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 15:39
 */
@Getter
@Setter
public class ReturnOrderSearchPayload {

    /**
     * 退件单号
     */
    @JsonProperty("asroCodes")
    private String asroCodes;
    /**
     * 参考号
     */
    @JsonProperty("reference_no")
    private String referenceNo;
}
