package io.github.ealenxie.allegro.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/3/27 10:56
 */
@Getter
@Setter
public class Items {
    @JsonProperty("waybill")
    private String waybill;
    @JsonProperty("dimensions")
    private Dimensions dimensions;
    @JsonProperty("weight")
    private Height weight;
    @JsonProperty("description")
    private String description;
    @JsonProperty("value")
    private Money value;
    @JsonProperty("type")
    private String type;
}
