package io.github.ealenxie.fop.fulfillment.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/10/8 16:04
 */
@Getter
@Setter
public class ConsignmentPackage {
    @JsonProperty("consignment_no")
    private String consignmentNo;
    @JsonProperty("length")
    private Integer length;
    @JsonProperty("width")
    private Integer width;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("package_type")
    private String packageType;
    @JsonProperty("package_weight")
    private Double packageWeight;
    @JsonProperty("shipped_weight")
    private Double shippedWeight;
}
