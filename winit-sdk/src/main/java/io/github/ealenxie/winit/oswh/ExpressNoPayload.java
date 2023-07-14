package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/14 17:02
 * @version 1.0
 */
@Getter
@Setter
public class ExpressNoPayload {
    /**
     * expressNo
     */
    @JsonProperty("expressNo")
    private String expressNo;
    /**
     * expressCompany
     */
    @JsonProperty("expressCompany")
    private String expressCompany;
    /**
     * sellerCaseNo
     */
    @JsonProperty("sellerCaseNo")
    private String sellerCaseNo;
    /**
     * thirdPartyCaseNo
     */
    @JsonProperty("thirdPartyCaseNo")
    private String thirdPartyCaseNo;
}
