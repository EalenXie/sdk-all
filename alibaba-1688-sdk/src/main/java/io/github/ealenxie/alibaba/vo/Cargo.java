package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author 无敌暴龙战士
 * @since 2022/12/16 10:12
 */
@Setter
@Getter
public class Cargo {
    /**
     * 产品总金额
     */
    @JsonProperty("amount")
    private BigDecimal amount;
    /**
     * 返回信息
     */
    @JsonProperty("message")
    private String message;
    /**
     * 最终单价
     */
    @JsonProperty("finalUnitPrice")
    private BigDecimal finalUnitPrice;
    /**
     * 规格ID，offer内唯一
     */
    @JsonProperty("specId")
    private String specId;
    /**
     * 规格ID，全局唯一
     */
    @JsonProperty("skuId")
    private Long skuId;

    /**
     * 返回码
     */
    @JsonProperty("resultCode")
    private Long resultCode;

    /**
     * 商品ID
     */
    @JsonProperty("offerId")
    private Long offerId;

    /**
     * 商品优惠列表
     */
    @JsonProperty("cargoPromotionList")
    private List<CargoPromotion> cargoPromotionList;


}
