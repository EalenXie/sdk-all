package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class OrdersQueryParams {
    private String limit;
    private String lastModifiedStartDate;
    private String lastModifiedEndDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String shipNodeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String createdStartDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String createdEndDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sku;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String customerOrderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String purchaseOrderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String fromExpectedShipDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String toExpectedShipDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String shippingProgramType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String replacementInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String orderType;


}