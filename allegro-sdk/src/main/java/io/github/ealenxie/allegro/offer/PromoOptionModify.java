package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/30 15:20
 */
@Getter
@Setter
public class PromoOptionModify {
    /**
     * modificationType
     */
    @JsonProperty("modificationType")
    private String modificationType;
    /**
     * packageType
     */
    @JsonProperty("packageType")
    private String packageType;
    /**
     * packageId
     */
    @JsonProperty("packageId")
    private String packageId;
}
