package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/21 17:57
 */
@NoArgsConstructor
@Data
public class GenerateQrCodePayload {

    /**
     * width
     */
    @JsonProperty("width")
    private Integer width;
    /**
     * height
     */
    @JsonProperty("height")
    private Integer height;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("action")
    private String action;
}
