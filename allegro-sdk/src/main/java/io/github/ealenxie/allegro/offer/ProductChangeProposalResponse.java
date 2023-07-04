package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/4 11:07
 */
@NoArgsConstructor
@Data
public class ProductChangeProposalResponse {


    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * name
     */
    @JsonProperty("name")
    private ProposalPayload name;
    /**
     * category
     */
    @JsonProperty("category")
    private ProposalPayload category;
    /**
     * note
     */
    @JsonProperty("note")
    private String note;
    /**
     * images
     */
    @JsonProperty("images")
    private List<ProposalPayload> images;
    /**
     * parameters
     */
    @JsonProperty("parameters")
    private List<ProductChangeProposalParameters> parameters;
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
