package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BillingTypePayload {

    /**
     * 计费类型id
     */
    @JsonProperty("id")
    private String id;

    /**
     * 描述
     */
    @JsonProperty("description")
    private String description;
}
