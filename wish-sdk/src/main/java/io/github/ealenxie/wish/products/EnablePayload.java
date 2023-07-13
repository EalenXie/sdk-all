package io.github.ealenxie.wish.products;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/13 16:35
 */
@NoArgsConstructor
@Data
public class EnablePayload {

    /**
     * enable
     */
    @JsonProperty("enable")
    private Boolean enable;
}
