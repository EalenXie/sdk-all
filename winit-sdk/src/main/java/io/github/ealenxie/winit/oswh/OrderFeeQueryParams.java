package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/14 16:27
 * @version 1.0
 */
@Getter
@Setter
public class OrderFeeQueryParams {

    /**
     * businessDocumentNo
     */
    @JsonProperty("businessDocumentNo")
    private String businessDocumentNo;
    /**
     * destinationWarehouse
     */
    @JsonProperty("destinationWarehouse")
    private String destinationWarehouse;
    /**
     * orderDateFrom
     */
    @JsonProperty("orderDateFrom")
    private String orderDateFrom;
    /**
     * orderDateTo
     */
    @JsonProperty("orderDateTo")
    private String orderDateTo;
    /**
     * pageParams
     */
    @JsonProperty("pageParams")
    private PageParams pageParams;
}
