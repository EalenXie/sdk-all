package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/17 13:53
 */
@Getter
@Setter
public class QueryTransactionChargeLine {
    /**
     * transactionNo
     */
    @JsonProperty("transactionNo")
    private String transactionNo;
    /**
     * chargeCode
     */
    @JsonProperty("chargeCode")
    private String chargeCode;
    /**
     * chargeName
     */
    @JsonProperty("chargeName")
    private String chargeName;
    /**
     * sourceAmt
     */
    @JsonProperty("sourceAmt")
    private Double sourceAmt;
    /**
     * acctAmt
     */
    @JsonProperty("acctAmt")
    private Double acctAmt;
    /**
     * sourceCurrency
     */
    @JsonProperty("sourceCurrency")
    private String sourceCurrency;
    /**
     * acctCurrency
     */
    @JsonProperty("acctCurrency")
    private String acctCurrency;
    /**
     * exchangeRate
     */
    @JsonProperty("exchangeRate")
    private Double exchangeRate;
    /**
     * dateAcct
     */
    @JsonProperty("dateAcct")
    private String dateAcct;
    /**
     * tradeDate
     */
    @JsonProperty("tradeDate")
    private String tradeDate;
    /**
     * weight
     */
    @JsonProperty("weight")
    private Double weight;
    /**
     * chargeWeight
     */
    @JsonProperty("chargeWeight")
    private Double chargeWeight;
    /**
     * volume
     */
    @JsonProperty("volume")
    private Double volume;
    /**
     * volumeWeight
     */
    @JsonProperty("volumeWeight")
    private Double volumeWeight;
    /**
     * description
     */
    @JsonProperty("description")
    private String description;
}
