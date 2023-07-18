package io.github.ealenxie.paypal.transaction;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class IncentiveInfo {

    /**
     * 激励详情
     */
    @JsonProperty("incentive_details")
    private List<IncentiveDetail> incentiveDetails;
}
