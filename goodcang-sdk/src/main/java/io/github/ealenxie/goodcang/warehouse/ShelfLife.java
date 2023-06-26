package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 10:43
 */
@Getter
@Setter
public class ShelfLife {
    /**
     * 过期日期
     */
    @JsonProperty("expiration_date")
    private String expirationDate;
    /**
     * 生产日期
     */
    @JsonProperty("manufacture_date")
    private String manufactureDate;
    /**
     * 上架数量
     */
    @JsonProperty("rbd_putaway_qty")
    private Integer rbdPutawayQty;
}
