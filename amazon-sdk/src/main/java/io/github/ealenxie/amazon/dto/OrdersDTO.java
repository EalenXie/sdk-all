package io.github.ealenxie.amazon.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

/**
 * Created by EalenXie on 2022/2/22 14:54
 */
@Getter
@Setter
public class OrdersDTO {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("CreatedAfter")
    private String createdAfter;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("CreatedBefore")
    private String createdBefore;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("LastUpdatedAfter")
    private String lastUpdatedAfter;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("LastUpdatedBefore")
    private String lastUpdatedBefore;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("OrderStatuses")
    private String[] orderStatuses;
    @NonNull
    @JsonProperty("MarketplaceIds")
    private String[] marketplaceIds;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("FulfillmentChannels")
    private String[] fulfillmentChannels;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("PaymentMethods")
    private String[] paymentMethods;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("BuyerEmail")
    private String buyerEmail;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("SellerOrderId")
    private String sellerOrderId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("MaxResultsPerPage")
    private String maxResultsPerPage;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("EasyShipShipmentStatuses")
    private String[] easyShipShipmentStatuses;
    @JsonProperty("NextToken")
    private String nextToken;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("AmazonOrderIds")
    private String[] amazonOrderIds;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("ActualFulfillmentSupplySourceId")
    private String actualFulfillmentSupplySourceId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("IsISPU")
    private String isISPU;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("StoreChainStoreId")
    private String storeChainStoreId;
}
