package io.github.ealenxie.walmart.marketplace.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;


/**
 * @author EalenXie
 * @since 2022/05/26 9:13
 */
@Getter
@RequiredArgsConstructor
public enum WalmartOrderStatus {
    CREATED("Created"),

    ACKNOWLEDGED("Acknowledged"),
    /**
     * SHIPPED - payment completed. Purchase is ready for processing. *
     * 已发货。购买已准备好进行处理
     */
    SHIPPED("Shipped"),
    /**
     * 运输中的
     */
    DELIVERED("Delivered"),

    /**
     * CANCELLED - purchase cancelled by buyer.
     * 买方取消购买
     */
    CANCELLED("Cancelled"),

    REFUND("Refund");


    private final String status;

    public String getStatus() {
        return this.status;
    }
}
