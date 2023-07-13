package io.github.ealenxie.wish.price;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.PageQueryParams;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/13 10:00
 * @version 1.0
 */
@Getter
@Setter
public class ShipmentQueryParams extends PageQueryParams {
    /**
     * createdAtMax
     */
    @JsonProperty("created_at_max")
    private Integer createdAtMax;
    /**
     * createdAtMin
     */
    @JsonProperty("created_at_min")
    private Integer createdAtMin;

}
