package io.github.ealenxie.fruugo.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2022/08/24 15:04
 */
@Getter
@Setter
public class ItemDTO {
    /**
     * 产品Id
     */
    private String fruugoProductId;
    /**
     * skuId
     */
    private String fruugoSkuId;
    /**
     * 产品数量
     */
    private Integer quantity;

    @Override
    public String toString() {
        return "{" +
                "fruugoProductId=" + fruugoProductId +
                ", fruugoSkuId=" + fruugoSkuId +
                ", quantity=" + quantity +
                '}';
    }
}
