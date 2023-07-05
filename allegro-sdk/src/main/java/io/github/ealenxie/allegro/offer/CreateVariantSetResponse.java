package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/5 10:59
 */
@NoArgsConstructor
@Data
public class CreateVariantSetResponse {


    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * offers
     */
    @JsonProperty("offers")
    private List<CreateVariantSetOffers> offers;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * parameters
     */
    @JsonProperty("parameters")
    private List<IdPayload> parameters;
}
