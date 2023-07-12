package io.github.ealenxie.wish.bulkproducts;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/12 13:17
 */
@Getter
@Setter
public class MainImage {
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
