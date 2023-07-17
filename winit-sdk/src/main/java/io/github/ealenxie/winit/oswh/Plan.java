package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/17 14:35
 */
@Getter
@Setter
public class Plan {
    /**
     * planOutboudDate
     */
    @JsonProperty("planOutboudDate")
    private String planOutboudDate;
    /**
     * planType
     */
    @JsonProperty("planType")
    private String planType;
    /**
     * pickupPackageDeadline
     */
    @JsonProperty("pickupPackageDeadline")
    private String pickupPackageDeadline;
    /**
     * planName
     */
    @JsonProperty("planName")
    private String planName;
    /**
     * createOrderDeadline
     */
    @JsonProperty("createOrderDeadline")
    private String createOrderDeadline;
    /**
     * planShelfDate
     */
    @JsonProperty("planShelfDate")
    private String planShelfDate;
    /**
     * planCode
     */
    @JsonProperty("planCode")
    private String planCode;
}
