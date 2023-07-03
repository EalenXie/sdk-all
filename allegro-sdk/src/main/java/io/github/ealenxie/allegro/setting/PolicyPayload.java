package io.github.ealenxie.allegro.setting;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/3 10:42
 * @version 1.0
 */
@Getter
@Setter
public class PolicyPayload {

    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * seller
     */
    @JsonProperty("seller")
    private IdPayload seller;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * availability
     */
    @JsonProperty("availability")
    private Availability availability;
    /**
     * withdrawalPeriod
     */
    @JsonProperty("withdrawalPeriod")
    private String withdrawalPeriod;
    /**
     * returnCost
     */
    @JsonProperty("returnCost")
    private ReturnCost returnCost;
    /**
     * address
     */
    @JsonProperty("address")
    private Address address;
    /**
     * description
     */
    @JsonProperty("description")
    private String description;
    /**
     * contact
     */
    @JsonProperty("contact")
    private Contact contact;
    /**
     * options
     */
    @JsonProperty("options")
    private Options options;
}
