package io.github.ealenxie.wish;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/13 14:06
 * @version 1.0
 */
@Setter
@Getter
public class IdPayload {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
}
