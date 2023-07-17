package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/17 13:53
 */
@NoArgsConstructor
@Data
public class TransactionCharge {

    /**
     * businessDocumentNo
     */
    @JsonProperty("businessDocumentNo")
    private String businessDocumentNo;
    /**
     * referenceOrderNo
     */
    @JsonProperty("referenceOrderNo")
    private String referenceOrderNo;
    /**
     * sellerOrderNo
     */
    @JsonProperty("sellerOrderNo")
    private String sellerOrderNo;
    /**
     * trackingNo
     */
    @JsonProperty("trackingNo")
    private String trackingNo;
    /**
     * winitServiceCode
     */
    @JsonProperty("winitServiceCode")
    private String winitServiceCode;
    /**
     * warehouseName
     */
    @JsonProperty("warehouseName")
    private String warehouseName;
    /**
     * fulfillmentDate
     */
    @JsonProperty("fulfillmentDate")
    private String fulfillmentDate;
    /**
     * orderDate
     */
    @JsonProperty("orderDate")
    private String orderDate;
    /**
     * queryTransactionChargeLineVos
     */
    @JsonProperty("queryTransactionChargeLineVos")
    private List<QueryTransactionChargeLine> queryTransactionChargeLineVos;
}
