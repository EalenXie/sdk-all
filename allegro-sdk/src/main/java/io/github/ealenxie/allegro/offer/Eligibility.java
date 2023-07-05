package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/5 9:40
 * @version 1.0
 */
@Getter
@Setter
public class Eligibility {
    /**
     * eligible
     */
    @JsonProperty("eligible")
    private Boolean eligible;
    /**
     * refusalReasons
     */
    @JsonProperty("refusalReasons")
    private List<?> refusalReasons;
}
