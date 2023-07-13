package io.github.ealenxie.wish.promotionplatform;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.IdPayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/13 15:31
 * @version 1.0
 */
@Getter
@Setter
public class EligibleProductPayload {

    /**
     * variations
     */
    @JsonProperty("variations")
    private List<IdPayload> variations;
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
}
