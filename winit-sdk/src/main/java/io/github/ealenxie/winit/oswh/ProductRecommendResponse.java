package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/17 11:13
 */
@Getter
@Setter
public class ProductRecommendResponse {


    /**
     * reason
     */
    @JsonProperty("reason")
    private String reason;
    /**
     * isGuarantee
     */
    @JsonProperty("isGuarantee")
    private String isGuarantee;
    /**
     * estimateCompleteDate
     */
    @JsonProperty("estimateCompleteDate")
    private String estimateCompleteDate;
    /**
     * unavailableProduct
     */
    @JsonProperty("unavailableProduct")
    private List<?> unavailableProduct;
    /**
     * isEGDOrder
     */
    @JsonProperty("isEGDOrder")
    private String isEGDOrder;
    /**
     * recomendProduct
     */
    @JsonProperty("recomendProduct")
    private List<?> recomendProduct;
    /**
     * isEbayOrder
     */
    @JsonProperty("isEbayOrder")
    private String isEbayOrder;
    /**
     * currentProduct
     */
    @JsonProperty("currentProduct")
    private CurrentProduct currentProduct;
}
