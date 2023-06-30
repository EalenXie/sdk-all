package io.github.ealenxie.allegro.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/6/30 17:13
 * @version 1.0
 */
@Getter
@Setter
public class Output {
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
}
