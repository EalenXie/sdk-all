package io.github.ealenxie.allegro.fulfillment;

import io.github.ealenxie.allegro.PageQueryParams;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/3 9:53
 * @version 1.0
 */
@Getter
@Setter
public class FulfillmentStockQueryParams extends PageQueryParams {
    /**
     * phrase
     */
    private String phrase;
    /**
     * sort
     */
    private String sort;
    /**
     * productId
     */
    private String productId;
    /**
     * productAvailability
     */
    private String productAvailability;
    /**
     * productStatus
     */
    private String productStatus;
    /**
     * storageFee
     */
    private String storageFee;
    /**
     * asnStatus
     */
    private String asnStatus;
    /**
     * outOfStockInFrom
     */
    private String outOfStockInFrom;
    /**
     * outOfStockInTo
     */
    private String outOfStockInTo;

}
