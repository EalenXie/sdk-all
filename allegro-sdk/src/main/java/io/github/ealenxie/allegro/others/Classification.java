package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class Classification {
    /**
     * fulfilled
     */
    @JsonProperty("fulfilled")
    private Boolean fulfilled;
    /**
     * lastChanged
     */
    @JsonProperty("lastChanged")
    private String lastChanged;
}
