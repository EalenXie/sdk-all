package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2022/12/16 10:15
 */
@Getter
@Setter
public class CargoPromotion {
    /**
     * 优惠券ID
     */
    @JsonProperty("promotionId")
    private String promotionId;
    /**
     * 是否默认选中
     */
    @JsonProperty("selected")
    private Boolean selected;
    /**
     * 优惠券名称
     */
    @JsonProperty("text")
    private Long text;
    /**
     * 优惠券描述
     */
    @JsonProperty("desc")
    private Long desc;
    /**
     * 是否免邮
     */
    @JsonProperty("freePostage")
    private Long freePostage;
    /**
     * 减去金额，单位为分
     */
    @JsonProperty("discountFee")
    private Long discountFee;

}
