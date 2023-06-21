package io.github.ealenxie.alibaba.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author jadechiang
 * @since 2022/12/16 9:07
 */
@Getter
@Setter
public class CargoParam {
    /**
     * 商品对应的offer id
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("offerId")
    private Long offerId;
    /**
     * 商品规格id
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("specId")
    private String specId;
    /**
     * 商品数量(计算金额用)
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("quantity")
    private BigDecimal quantity;
}
