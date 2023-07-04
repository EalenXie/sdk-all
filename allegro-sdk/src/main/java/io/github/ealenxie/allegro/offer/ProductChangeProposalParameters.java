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
