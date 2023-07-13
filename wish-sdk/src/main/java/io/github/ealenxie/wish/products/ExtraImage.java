package io.github.ealenxie.wish.products;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/13 16:27
 */
@Getter
@Setter
public class ExtraImage {
    /**
     * url
     */
    @JsonProperty("url")
    private String url;
    /**
     * variationSkus
     */
    @JsonProperty("variation_skus")
    private List<String> variationSkus;
    /**
     * isCleanImage
     */
    @JsonProperty("is_clean_image")
    private Boolean isCleanImage;
}
