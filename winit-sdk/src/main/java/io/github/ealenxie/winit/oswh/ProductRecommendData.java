package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/17 11:09
 */
@NoArgsConstructor
@Data
public class ProductRecommendData {

    /**
     * parcels
     */
    @JsonProperty("parcels")
    private List<Parcel> parcels;
    /**
     * salesAmount
     */
    @JsonProperty("salesAmount")
    private String salesAmount;
    /**
     * currency
     */
    @JsonProperty("currency")
    private String currency;
    /**
     * receiverAddress
     */
    @JsonProperty("receiverAddress")
    private ReceiverAddress receiverAddress;
    /**
     * sellerID
     */
    @JsonProperty("sellerID")
    private String sellerID;
    /**
     * validationType
     */
    @JsonProperty("validationType")
    private String validationType;
    /**
     * warehouseCode
     */
    @JsonProperty("warehouseCode")
    private String warehouseCode;
    /**
     * winitProductCode
     */
    @JsonProperty("winitProductCode")
    private String winitProductCode;
}
