package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.TypePayload;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/5 13:29
 * @version 1.0
 */
@Getter
@Setter
public class BenefitsType {
    /**
     * specification
     */
    @JsonProperty("specification")
    private TypePayload specification;
}
