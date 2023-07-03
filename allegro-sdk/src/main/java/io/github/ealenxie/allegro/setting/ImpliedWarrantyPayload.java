package io.github.ealenxie.allegro.setting;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/3 11:22
 * @version 1.0
 */
@Getter
@Setter
public class ImpliedWarrantyPayload {
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * individual
     */
    @JsonProperty("individual")
    private Individual individual;
    /**
     * corporate
     */
    @JsonProperty("corporate")
    private Individual corporate;
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
}
