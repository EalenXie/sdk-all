package io.github.ealenxie.alibaba.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2022/12/15 13:59
 */
@Setter
@Getter
public class PreOrderInfo {
    /**
     * 创建预订单时传入的市场名
     */
    private String marketName;
    /**
     * 预订单是否为当前查询的通过当前查询的ERP创建
     */
    private Boolean createPreOrderApp;
}
