package io.github.ealenxie.winit.isp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author EalenXie created on 2023/7/14 17:21
 */
@Getter
@Setter
public class IspOrderRevenue {

    /**
     * standardCurrencyCode
     */
    @JsonProperty("standardCurrencyCode")
    private String standardCurrencyCode;
    /**
     * totalEbayItemPriceAmount
     */
    @JsonProperty("totalEbayItemPriceAmount")
    private BigDecimal totalEbayItemPriceAmount;
    /**
     * totalAmount
     */
    @JsonProperty("totalAmount")
    private BigDecimal totalAmount;
    /**
     * cfmGrossWeight
     */
    @JsonProperty("cfmGrossWeight")
    private BigDecimal cfmGrossWeight;
    /**
     * cfmHeight
     */
    @JsonProperty("cfmHeight")
    private BigDecimal cfmHeight;
    /**
     * cfmLength
     */
    @JsonProperty("cfmLength")
    private BigDecimal cfmLength;
    /**
     * cfmWidth
     */
    @JsonProperty("cfmWidth")
    private BigDecimal cfmWidth;
    /**
     * chargeItemList
     */
    @JsonProperty("chargeItemList")
    private List<ChargeItem> chargeItemList;
}
