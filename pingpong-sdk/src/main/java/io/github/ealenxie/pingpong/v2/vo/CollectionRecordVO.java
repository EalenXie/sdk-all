package io.github.ealenxie.pingpong.v2.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author create by sch  2023/6/9 9:22
 * @version 1.0
 */
@Getter
@Setter
public class CollectionRecordVO {

    /**
     * 流⽔号
     */
    @JsonProperty("collectionId")
    private String collectionId;
    /**
     * 创建时间，unix时间戳（秒）
     */
    @JsonProperty("createTime")
    private Long createTime;
    /**
     * 店铺所属客户ID
     */
    @JsonProperty("fromClientId")
    private String fromClientId;
    /**
     * 店铺所属客户名称
     */
    @JsonProperty("fromClientName")
    private String fromClientName;
    /**
     * 店铺在平台的唯⼀ID
     */
    @JsonProperty("sellerId")
    private String sellerId;
    /**
     * 店铺名称
     */
    @JsonProperty("storeName")
    private String storeName;
    /**
     * 平台CODE
     */
    @JsonProperty("platform")
    private String platform;
    /**
     * 店铺所在地区
     */
    @JsonProperty("nation")
    private String nation;
    /**
     * 店铺收款账户ID
     */
    @JsonProperty("fromAccountId")
    private String fromAccountId;
    /**
     * 接收⽅客户ID
     */
    @JsonProperty("clientId")
    private String clientId;
    /**
     * 接收⽅客户名称
     */
    @JsonProperty("clientName")
    private String clientName;
    /**
     * 接收⽅账号ID
     */
    @JsonProperty("accountId")
    private String accountId;
    /**
     * 归集⾦额
     */
    @JsonProperty("applyAmount")
    private BigDecimal applyAmount;
    /**
     * 归集币种
     */
    @JsonProperty("applyCurrency")
    private String applyCurrency;
    /**
     * 到账⾦额
     */
    @JsonProperty("arrivalAmount")
    private BigDecimal arrivalAmount;
    /**
     * 到账币种
     */
    @JsonProperty("arrivalCurrency")
    private String arrivalCurrency;
    /**
     * 优惠⾦额
     */
    @JsonProperty("promotionAmount")
    private BigDecimal promotionAmount;
    /**
     * 优惠币种
     */
    @JsonProperty("promotionCurrency")
    private String promotionCurrency;
    /**
     * 费⽤列表
     */
    @JsonProperty("feeList")
    private List<FeeVO> feeList;
}
