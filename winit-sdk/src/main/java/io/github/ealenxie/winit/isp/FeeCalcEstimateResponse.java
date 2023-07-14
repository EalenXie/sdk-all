package io.github.ealenxie.winit.isp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/14 18:01
 */
@Getter
@Setter
public class FeeCalcEstimateResponse {

    /**
     * currency
     */
    @JsonProperty("currency")
    private String currency;
    /**
     * totalFeeCNY
     */
    @JsonProperty("totalFeeCNY")
    private Double totalFeeCNY;
    /**
     * feeDetailList
     */
    @JsonProperty("feeDetailList")
    private List<FeeDetail> feeDetailList;
    /**
     * productQuotation
     */
    @JsonProperty("productQuotation")
    private String productQuotation;
}
