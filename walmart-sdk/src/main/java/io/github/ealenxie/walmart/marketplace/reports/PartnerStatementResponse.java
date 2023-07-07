package io.github.ealenxie.walmart.marketplace.reports;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 10:12
 */
@NoArgsConstructor
@Data
public class PartnerStatementResponse {


    /**
     * statusCode
     */
    @JsonProperty("statusCode")
    private Integer statusCode;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * error
     */
    @JsonProperty("error")
    private String error;
    /**
     * partnerId
     */
    @JsonProperty("partnerId")
    private String partnerId;
    /**
     * payload
     */
    @JsonProperty("payload")
    private PartnerStatementPayload payload;
}
