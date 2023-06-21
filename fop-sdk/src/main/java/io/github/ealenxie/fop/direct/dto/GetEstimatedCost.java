package io.github.ealenxie.fop.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/22 14:40
 */
@Getter
@Setter
public class GetEstimatedCost {

    @JsonProperty("request_no")
    private String requestNo;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("weight")
    private String weight;
    @JsonProperty("length")
    private String length;
    @JsonProperty("width")
    private String width;
    @JsonProperty("height")
    private String height;
    @JsonProperty("cargocode")
    private String cargoCode;
    @JsonProperty("logistics_product_code")
    private List<String> logisticsProductCode;
    @JsonProperty("recipient_post_code")
    private String recipientPostCode;
}
