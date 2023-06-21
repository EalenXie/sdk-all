package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月16日 0016 11 38
 */
@Getter
@Setter
public class LogisticsSendGood {
    /**
     * 商品名
     */
    @JsonProperty("goodName")
    private String goodName;
    /**
     * 商品数量
     */
    @JsonProperty("quantity")
    private String quantity;
    /**
     * 商品单位
     */
    @JsonProperty("unit")
    private String unit;
}
