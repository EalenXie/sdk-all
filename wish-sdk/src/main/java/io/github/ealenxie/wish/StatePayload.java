package io.github.ealenxie.wish;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author create by sch  2023/7/13 14:03
 * @version 1.0
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StatePayload {
    /**
     * state
     */
    @JsonProperty("state")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String state;
}
