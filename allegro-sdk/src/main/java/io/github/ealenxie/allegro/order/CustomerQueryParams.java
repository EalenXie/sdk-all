package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.PageQueryParams;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/4 13:15
 * @version 1.0
 */
@Getter
@Setter
public class CustomerQueryParams extends PageQueryParams {
    /**
     * customerReturnId
     */
    @JsonProperty("customerReturnId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String customerReturnId;
    /**
     * customerReturnId
     */
    @JsonProperty("orderId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String orderId;
    /**
     * offerId
     */
    @JsonProperty("items.offerId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String offerId;
    /**
     * name
     */
    @JsonProperty("items.name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String name;
    /**
     * waybill
     */
    @JsonProperty("parcels.waybill")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String waybill;
    /**
     * carrierId
     */
    @JsonProperty("parcels.carrierId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String carrierId;
    /**
     * phoneNumber
     */
    @JsonProperty("parcels.sender.phoneNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String phoneNumber;
    /**
     * referenceNumber
     */
    @JsonProperty("referenceNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String referenceNumber;
    /**
     * from
     */
    @JsonProperty("from")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String from;
    /**
     * createdAtGte
     */
    @JsonProperty("createdAt.gte")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String createdAtGte;
    /**
     * createdAtLte
     */
    @JsonProperty("createdAt.lte")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String createdAtLte;
    /**
     * marketplaceId
     */
    @JsonProperty("marketplaceId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String marketplaceId;
}
