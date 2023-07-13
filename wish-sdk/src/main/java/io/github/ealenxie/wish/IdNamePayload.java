package io.github.ealenxie.wish;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/13 13:51
 * @version 1.0
 */
@Getter
@Setter
public class IdNamePayload {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
}
