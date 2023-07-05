package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class Items {
    /**
     * promoted
     */
    @JsonProperty("promoted")
    private List<Regular> promoted;
    /**
     * regular
     */
    @JsonProperty("regular")
    private List<Regular> regular;
}
