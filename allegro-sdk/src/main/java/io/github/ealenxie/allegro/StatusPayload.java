package io.github.ealenxie.allegro;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/5 10:36
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
