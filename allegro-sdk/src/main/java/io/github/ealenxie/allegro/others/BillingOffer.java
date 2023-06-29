package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class BillingOffer {
    /**
     * 与账单条目的报价ID
     */
    @JsonProperty("id")
    private String id;
    /**
     * 与计费条目的报价名称
     */
    @JsonProperty("name")
    private String name;
}
