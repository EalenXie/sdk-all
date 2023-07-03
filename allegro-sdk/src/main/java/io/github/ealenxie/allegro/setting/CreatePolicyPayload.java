package io.github.ealenxie.allegro.setting;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/3 10:37
 * @version 1.0
 */
@Getter
@Setter
public class CreatePolicyPayload {

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
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * contact
     */
    @JsonProperty("contact")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Contact contact;
    /**
     * options
     */
    @JsonProperty("options")
    private Options options;
}
