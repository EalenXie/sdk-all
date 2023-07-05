package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/4 11:07
 */
@Getter
@Setter
public class ProductChangeProposalParameters {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * values
     */
    @JsonProperty("values")
    private List<ProposalPayload> values;
}
