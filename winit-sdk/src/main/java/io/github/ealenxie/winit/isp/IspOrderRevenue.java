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
     * 币种（USD）
     */
    @JsonProperty("standardCurrencyCode")
    private String standardCurrencyCode;
    /**
     * ebay总申报价值
     */
    @JsonProperty("totalEbayItemPriceAmount")
    private BigDecimal totalEbayItemPriceAmount;
    /**
     * 总额
     */
    @JsonProperty("totalAmount")
    private BigDecimal totalAmount;
    /**
     * 核实重量(kg)
     */
    @JsonProperty("cfmGrossWeight")
    private BigDecimal cfmGrossWeight;
    /**
     * 核实长(cm)
     */
    @JsonProperty("cfmHeight")
    private BigDecimal cfmHeight;
    /**
     * 核实宽(cm)
     */
    @JsonProperty("cfmLength")
    private BigDecimal cfmLength;
    /**
     * 核实高(cm)
     */
    @JsonProperty("cfmWidth")
    private BigDecimal cfmWidth;
    /**
     * 费用明细列表
     */
    @JsonProperty("chargeItemList")
    private List<ChargeItem> chargeItemList;
}
