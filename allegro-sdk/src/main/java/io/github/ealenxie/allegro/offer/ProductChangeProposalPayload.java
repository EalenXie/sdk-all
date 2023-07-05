package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import io.github.ealenxie.allegro.UrlPayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/4 11:05
 */
@Getter
@Setter
public class ProductChangeProposalPayload {


    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * note
     */
    @JsonProperty("note")
    private String note;
    /**
     * category
     */
    @JsonProperty("category")
    private IdPayload category;
    /**
     * images
     */
    @JsonProperty("images")
    private List<UrlPayload> images;
    /**
     * parameters
     */
    @JsonProperty("parameters")
    private List<ProductsParameters> parameters;
    /**
     * notifyViaEmailAfterVerification
     */
    @JsonProperty("notifyViaEmailAfterVerification")
    private Boolean notifyViaEmailAfterVerification;
    /**
     * language
     */
    @JsonProperty("language")
    private String language;
}
