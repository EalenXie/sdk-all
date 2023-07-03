package io.github.ealenxie.allegro.setting;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/3 13:35
 * @version 1.0
 */
@Getter
@Setter
public class WarrantyResponse {

    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * seller
     */
    @JsonProperty("seller")
    private Seller seller;
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
     * individual
     */
    @JsonProperty("individual")
    private WarrantyIndividual individual;
    /**
     * corporate
     */
    @JsonProperty("corporate")
    private WarrantyIndividual corporate;
    /**
     * attachment
     */
    @JsonProperty("attachment")
    private Attachment attachment;
    /**
     * description
     */
    @JsonProperty("description")
    private String description;
}
