package io.github.ealenxie.armlogi.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/4/23 14:07
 * @version 1.0
 */
@Getter
@Setter
public class TrialFreightVO {

    /**
     * 物流产品代码
     */
    @JsonProperty("shippingCode")
    private String shippingCode;
    /**
     * 预估计费，若是渠道不计费，为0
     */
    @JsonProperty("trialFreight")
    private String trialFreight;
}
