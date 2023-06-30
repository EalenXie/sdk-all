package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class AdditionalInformation {
    /**
     * vin
     */
    @JsonProperty("vin")
    private String vin;
}
