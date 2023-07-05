package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.TypePayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/5 13:16
 * @version 1.0
 */
@Getter
@Setter
public class CreatePromotionResponse {

    /**
     * status
     */
    @JsonProperty("status")
    private String status;
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
     * benefits
     */
    @JsonProperty("benefits")
    private List<Benefits> benefits;
    /**
     * offerCriteria
     */
    @JsonProperty("offerCriteria")
    private List<TypePayload> offerCriteria;
}
