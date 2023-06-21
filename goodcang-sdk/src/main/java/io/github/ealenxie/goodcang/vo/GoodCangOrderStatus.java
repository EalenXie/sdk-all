package io.github.ealenxie.goodcang.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum GoodCangOrderStatus {

    TO_BE_DELIVERED("W", "待发货"),
    SHIPPED("D", "已发货"),
    ABNORMAL_ORDER("N", "异常订单"),
    PROBLEM_PIECE("P", "问题件"),
    ABANDONED("X", "废弃");

    /**
     * 编码
     */
    final String orderStatus;

    /**
     * 描述
     */
    final String desc;

    public static GoodCangOrderStatus ofOrderStatus(String orderStatus) {
        GoodCangOrderStatus[] values = GoodCangOrderStatus.values();
        for (GoodCangOrderStatus v : values) {
            if (v.getOrderStatus().equals(orderStatus)) {
                return v;
            }
        }
        throw new UnsupportedOperationException(String.format("不能识别的goodcang状态值[%s]", orderStatus));
    }
}