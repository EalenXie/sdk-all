package io.github.ealenxie.walmart.marketplace;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/6 17:02
 * @version 1.0
 */
@Getter
@Setter
public class StatusPayload {
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
}
