package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/17 10:50
 */
@Getter
@Setter
public class PscResponse {
    /**
     * productName
     */
    @JsonProperty("productName")
    private String productName;
    /**
     * productCode
     */
    @JsonProperty("productCode")
    private String productCode;
    /**
     * sla
     */
    @JsonProperty("sla")
    private String sla;
    /**
     * deliveryService
     */
    @JsonProperty("deliveryService")
    private String deliveryService;
}
