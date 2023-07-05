package io.github.ealenxie.allegro.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/6/30 17:29
 * @version 1.0
 */
@Getter
@Setter
public class Content {
    /**
     * expected
     */
    @JsonProperty("expected")
    private Integer expected;
    /**
     * product
     */
    @JsonProperty("product")
    private IdPayload product;
    /**
     * received
     */
    @JsonProperty("received")
    private List<Received> received;
}
