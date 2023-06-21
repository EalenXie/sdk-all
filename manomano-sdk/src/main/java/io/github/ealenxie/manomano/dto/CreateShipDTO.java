package io.github.ealenxie.manomano.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


/**
 * @author EalenXie
 * @since 2022/08/25 8:55
 */
@Setter
@Getter
public class CreateShipDTO extends ManoManoDTO {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("order_ref")
    private String orderRef;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("tracking_number")
    private String trackingNumber;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("tracking_url")
    private String trackingUrl;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String carrier;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("shipping_date")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date shippingDate;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("estimated_delivery_date")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date estimatedDeliveryDate;


    public CreateShipDTO(String login, String password) {
        super(login, password, "create_shipping");
    }
}
