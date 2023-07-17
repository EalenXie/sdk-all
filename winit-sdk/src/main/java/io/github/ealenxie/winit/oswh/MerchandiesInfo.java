package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/17 10:26
 */
@Getter
@Setter
public class MerchandiesInfo {
    /**
     * nameCn
     */
    @JsonProperty("nameCn")
    private String nameCn;
    /**
     * nameEn
     */
    @JsonProperty("nameEn")
    private String nameEn;
    /**
     * confirmLength
     */
    @JsonProperty("confirmLength")
    private Double confirmLength;
    /**
     * confirmWidth
     */
    @JsonProperty("confirmWidth")
    private Double confirmWidth;
    /**
     * confirmHeight
     */
    @JsonProperty("confirmHeight")
    private Double confirmHeight;
    /**
     * confirmWeight
     */
    @JsonProperty("confirmWeight")
    private Double confirmWeight;
}
