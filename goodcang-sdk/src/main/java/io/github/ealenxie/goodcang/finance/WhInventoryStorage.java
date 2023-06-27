package io.github.ealenxie.goodcang.finance;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/27 11:20
 */

@Getter
@Setter
public class WhInventoryStorage {

    /**
     * 仓租单号
     */
    @JsonProperty("wis_code")
    private String wisCode;
    /**
     * 结算周期
     */
    @JsonProperty("wp_settlement_cycle")
    private String wpSettlementCycle;
    /**
     * 仓库代码
     */
    @JsonProperty("ow_id_charge")
    private String owIdCharge;
    /**
     * 发生时间
     */
    @JsonProperty("is_date")
    private String isDate;
    /**
     * 体积
     */
    @JsonProperty("isdb_volume")
    private String isdbVolume;
    /**
     * 计费总金额
     */
    @JsonProperty("is_amount")
    private String isAmount;
    /**
     * 计费货币
     */
    @JsonProperty("currency_code")
    private String currencyCode;
    /**
     * 结算总金额
     */
    @JsonProperty("is_settlement_amount")
    private String isSettlementAmount;
    /**
     * 结算货币
     */
    @JsonProperty("settlement_currency_code")
    private String settlementCurrencyCode;
    /**
     * 备注
     */
    @JsonProperty("note")
    private String note;
}
