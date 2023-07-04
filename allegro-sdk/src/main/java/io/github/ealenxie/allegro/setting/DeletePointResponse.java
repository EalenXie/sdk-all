package io.github.ealenxie.allegro.setting;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.Error;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/4 10:57
 * @version 1.0
 */
@Getter
@Setter
public class DeletePointResponse {
    /**
     * errors
     */
    @JsonProperty("errors")
    private List<Error> errors;
}
