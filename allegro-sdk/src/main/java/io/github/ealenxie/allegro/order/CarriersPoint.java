package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/29 10:13
 */
@Getter
@Setter
public class CarriersPoint {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
    /**
     * services
     */
    @JsonProperty("services")
    private List<CarriersPointServices> services;
    /**
     * restrictions
     */
    @JsonProperty("restrictions")
    private List<CarriersPointServices> restrictions;
    /**
     * description
     */
    @JsonProperty("description")
    private String description;
    /**
     * payments
     */
    @JsonProperty("payments")
    private List<CarriersPointPayment> payments;
    /**
     * address
     */
    @JsonProperty("address")
    private CarriersPointAddress address;
    /**
     * opening
     */
    @JsonProperty("opening")
    private List<Opening> opening;
    /**
     * carriers
     */
    @JsonProperty("carriers")
    private List<String> carriers;
}
