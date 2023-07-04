package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/4 13:21
 * @version 1.0
 */
@Getter
@Setter
public class CustomerReturns {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * createdAt
     */
    @JsonProperty("createdAt")
    private String createdAt;
    /**
     * referenceNumber
     */
    @JsonProperty("referenceNumber")
    private String referenceNumber;
    /**
     * orderId
     */
    @JsonProperty("orderId")
    private String orderId;
    /**
     * items
     */
    @JsonProperty("items")
    private List<Items> items;
    /**
     * refund
     */
    @JsonProperty("refund")
    private CustomerRefund refund;
    /**
     * parcels
     */
    @JsonProperty("parcels")
    private List<Parcels> parcels;
    /**
     * rejection
     */
    @JsonProperty("rejection")
    private Rejection rejection;
    /**
     * marketplaceId
     */
    @JsonProperty("marketplaceId")
    private String marketplaceId;
}
