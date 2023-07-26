package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/20 16:17
 */
@Getter
@Setter
public class Metadata {
    /**
     * createTime
     */
    @JsonProperty("create_time")
    private String createTime;
    /**
     * recipientViewUrl
     */
    @JsonProperty("recipient_view_url")
    private String recipientViewUrl;
    /**
     * invoicerViewUrl
     */
    @JsonProperty("invoicer_view_url")
    private String invoicerViewUrl;
}
