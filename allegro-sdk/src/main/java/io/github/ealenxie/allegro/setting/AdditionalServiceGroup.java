package io.github.ealenxie.allegro.setting;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/3 15:40
 * @version 1.0
 */
@Getter
@Setter
public class AdditionalServiceGroup {

    /**
     * additionalServices
     */
    @JsonProperty("additionalServices")
    private List<AdditionalService> additionalServices;
    /**
     * createdAt
     */
    @JsonProperty("createdAt")
    private String createdAt;
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * updatedAt
     */
    @JsonProperty("updatedAt")
    private String updatedAt;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * seller
     */
    @JsonProperty("seller")
    private IdPayload seller;
    /**
     * language
     */
    @JsonProperty("language")
    private String language;
}
