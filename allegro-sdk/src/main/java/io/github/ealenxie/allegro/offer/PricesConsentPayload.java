package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/5 9:23
 * @version 1.0
 */
@Getter
@Setter
public class PricesConsentPayload {

    /**
     * status
     */
    @JsonProperty("status")
    private String status;
}
