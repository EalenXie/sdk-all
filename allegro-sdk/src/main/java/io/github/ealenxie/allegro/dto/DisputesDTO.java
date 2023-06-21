package io.github.ealenxie.allegro.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2023/3/3 12:45
 */
@Getter
@Setter
public class DisputesDTO {
    /**
     * string <uuid>
     * Example: checkoutForm.id=29738e61-7f6a-11e8-ac45-09db60ede9d6
     * Checkout form identifier.
     */
    @JsonProperty("checkoutForm.id")
    private String name;
    /**
     * integer <int32> [ 1 .. 100 ]
     * Default: 10
     * The maximum number of disputes in a response.
     */
    @JsonProperty("limit")
    private Integer limit;
    /**
     * integer <int32> >= 0
     * Default: 0
     * Index of first returned dispute.
     */
    @JsonProperty("offset")
    private String offset;
}
