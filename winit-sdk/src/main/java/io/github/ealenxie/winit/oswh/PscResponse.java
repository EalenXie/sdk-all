package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/17 10:50
 */
@NoArgsConstructor
@Data
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
