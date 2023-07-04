package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/4 11:05
 */
@NoArgsConstructor
@Data
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
    private List<Images> images;
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
