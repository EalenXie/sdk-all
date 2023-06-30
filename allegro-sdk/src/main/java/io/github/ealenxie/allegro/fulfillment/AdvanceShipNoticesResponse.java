package io.github.ealenxie.allegro.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/6/30 14:53
 * @version 1.0
 */

@Getter
@Setter
public class AdvanceShipNoticesResponse {

    /**
     * advanceShipNotices
     */
    @JsonProperty("advanceShipNotices")
    private List<AdvanceShipNotices> advanceShipNotices;
    /**
     * count
     */
    @JsonProperty("count")
    private Integer count;
    /**
     * totalCount
     */
    @JsonProperty("totalCount")
    private Integer totalCount;
}
