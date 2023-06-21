package io.github.ealenxie.winit.oswh.outbound.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/4/21 13:23
 * @version 1.0
 */
@Getter
@Setter
public class IncomeSettlementLineVos {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("orgId")
    private Integer orgId;
    @JsonProperty("isDelete")
    private String isDelete;
    /**
     * 是否生效
     */
    @JsonProperty("isActive")
    private String isActive;
    /**
     * 交易时间（精确至秒）
     */
    @JsonProperty("created")
    private String created;
    /**
     * 交易创建者
     */
    @JsonProperty("createdby")
    private String createdby;
    @JsonProperty("updated")
    private String updated;
    @JsonProperty("updatedby")
    private String updatedby;
    /**
     * 费用项编码
     */
    @JsonProperty("chargeCode")
    private String chargeCode;
    /**
     * 费用项名称
     */
    @JsonProperty("chargeName")
    private String chargeName;
    /**
     * 金额（原币）
     */
    @JsonProperty("sourceAmt")
    private Double sourceAmt;
    /**
     * 结算金额（结算币）
     */
    @JsonProperty("acctAmt")
    private Double acctAmt;
    /**
     * 币种（原币币种）
     */
    @JsonProperty("sourceCurrency")
    private String sourceCurrency;
    /**
     * 币种(结算币种)
     */
    @JsonProperty("acctCurrency")
    private String acctCurrency;
    /**
     * 汇率（本币兑美元汇率）
     */
    @JsonProperty("exchangeRate")
    private Double exchangeRate;
    /**
     * 记账时间（精确至秒）
     */
    @JsonProperty("dateAcct")
    private String dateAcct;
    /**
     * 重量（Kg）
     */
    @JsonProperty("weight")
    private Double weight;
    /**
     * 体积（m3）
     */
    @JsonProperty("volume")
    private Double volume;
    /**
     * 体积重（CBM）
     */
    @JsonProperty("volumeWeight")
    private Double volumeWeight;
    /**
     * 计费重（Kg）
     */
    @JsonProperty("chargeWeight")
    private Double chargeWeight;
    /**
     * 备注
     */
    @JsonProperty("description")
    private Double description;
}
