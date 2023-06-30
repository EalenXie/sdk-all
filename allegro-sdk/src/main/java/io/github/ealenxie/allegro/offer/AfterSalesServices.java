package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/29 15:39
 */
@Getter
@Setter
public class AfterSalesServices {
    /**
     * impliedWarranty
     */
    @JsonProperty("impliedWarranty")
    private IdPayload impliedWarranty;
    /**
     * returnPolicy
     */
    @JsonProperty("returnPolicy")
    private IdPayload returnPolicy;
    /**
     * warranty
     */
    @JsonProperty("warranty")
    private IdPayload warranty;
}
