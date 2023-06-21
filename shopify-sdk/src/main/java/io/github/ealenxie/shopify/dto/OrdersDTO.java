package io.github.ealenxie.shopify.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


/**
 * @author EalenXie
 * @since 2022/08/05 16:33
 */
@Getter
@Setter
public class OrdersDTO {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("limit")
    private Integer limit;

    /**
     * shipped: Show orders that have been shipped. returns orders with fulfillment_status of fulfilled.
     * <p>
     * partial: Show partially shipped orders.
     * <p>
     * unshipped: Show orders that have not yet been shipped. Returns orders with fulfillment_status of null.
     * <p>
     * any: Show orders of any fulfillment status.
     * <p>
     * unfulfilled: Returns orders with fulfillment_status of null or partial.
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("fulfillment_status")
    private String fulfillmentStatus;
    /**
     * open: Show only open orders.
     * <p>
     * closed: Show only closed orders.
     * <p>
     * cancelled: Show only canceled orders.
     * <p>
     * any: Show orders of any status, including archived orders.
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String status;

    /**
     * authorized: Show only authorized orders
     * <p>
     * pending:    Show only pending orders
     * <p>
     * paid:      Show only paid orders
     * <p>
     * partially_paid: Show only partially paid orders
     * <p>
     * refunded: Show only refunded orders
     * <p>
     * voided:   Show only voided orders
     * <p>
     * partially_refunded: Show only partially refunded orders
     * <p>
     * any:      Show orders of any financial status.
     * <p>
     * unpaid:   Show authorized and partially paid orders.
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("financial_status")
    private String financialStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("updated_at_min")
    private String updatedAtMin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("updated_at_max")
    private String updatedAtMax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("ids")
    private String ids;

}
