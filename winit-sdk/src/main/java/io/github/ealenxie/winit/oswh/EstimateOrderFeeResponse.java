package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/14 14:39
 * @version 1.0
 */
@Getter
@Setter
public class EstimateOrderFeeResponse {

    /**
     * totalFee
     */
    @JsonProperty("totalFee")
    private Double totalFee;
    /**
     * totalFeeCurrency
     */
    @JsonProperty("totalFeeCurrency")
    private String totalFeeCurrency;
    /**
     * feeList
     */
    @JsonProperty("feeList")
    private List<EstimateFee> feeList;
}
