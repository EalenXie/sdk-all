package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/5 13:26
 * @version 1.0
 */
@Getter
@Setter
public class SellerPromotions {
    /**
     * benefits
     */
    @JsonProperty("benefits")
    private List<BenefitsType> benefits;
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
     * offerCriteria
     */
    @JsonProperty("offerCriteria")
    private List<SellerOfferCriteria> offerCriteria;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
}
