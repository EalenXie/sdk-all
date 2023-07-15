package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/15 13:39
 */
@NoArgsConstructor
@Data
public class CreateOutboundOrderPayload {

    /**
     * storeType
     */
    @JsonProperty("storeType")
    private String storeType;
    /**
     * doorplateNumbers
     */
    @JsonProperty("doorplateNumbers")
    private String doorplateNumbers;
    /**
     * address1
     */
    @JsonProperty("address1")
    private String address1;
    /**
     * address2
     */
    @JsonProperty("address2")
    private String address2;
    /**
     * city
     */
    @JsonProperty("city")
    private String city;
    /**
     * deliveryWayID
     */
    @JsonProperty("deliveryWayID")
    private String deliveryWayID;
    /**
     * emailAddress
     */
    @JsonProperty("emailAddress")
    private String emailAddress;
    /**
     * phoneNum
     */
    @JsonProperty("phoneNum")
    private String phoneNum;
    /**
     * productList
     */
    @JsonProperty("productList")
    private List<OutboundOrderProduct> productList;
    /**
     * recipientName
     */
    @JsonProperty("recipientName")
    private String recipientName;
    /**
     * region
     */
    @JsonProperty("region")
    private String region;
    /**
     * repeatable
     */
    @JsonProperty("repeatable")
    private String repeatable;
    /**
     * sellerOrderNo
     */
    @JsonProperty("sellerOrderNo")
    private String sellerOrderNo;
    /**
     * state
     */
    @JsonProperty("state")
    private String state;
    /**
     * warehouseID
     */
    @JsonProperty("warehouseID")
    private String warehouseID;
    /**
     * zipCode
     */
    @JsonProperty("zipCode")
    private String zipCode;
}
