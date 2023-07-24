package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/24 10:51
 */
@Getter
@Setter
public class Attachment {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * referenceUrl
     */
    @JsonProperty("reference_url")
    private String referenceUrl;
}
