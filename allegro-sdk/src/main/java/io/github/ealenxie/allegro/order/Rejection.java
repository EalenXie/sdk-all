package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/4 13:21
 * @version 1.0
 */
@Getter
@Setter
public class Rejection {
    /**
     * code
     */
    @JsonProperty("code")
    private String code;
    /**
     * reason
     */
    @JsonProperty("reason")
    private String reason;
    /**
     * createdAt
     */
    @JsonProperty("createdAt")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String createdAt;
}
