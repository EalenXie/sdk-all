package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/4 13:21
 * @version 1.0
 */
@Getter
@Setter
public class CustomerReason {
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
    /**
     * userComment
     */
    @JsonProperty("userComment")
    private String userComment;
}
