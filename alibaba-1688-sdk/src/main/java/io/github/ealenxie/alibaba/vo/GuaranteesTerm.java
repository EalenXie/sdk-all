package io.github.ealenxie.alibaba.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2022/12/15 14:01
 */
@Setter
@Getter
public class GuaranteesTerm {
    /**
     * 保障条款
     */
    private String assuranceInfo;
    /**
     * 保障方式。国际站：TA(信保)
     */
    private String assuranceType;
    /**
     * 质量保证类型。国际站：pre_shipment(发货前),post_delivery(发货后)
     */
    private String qualityAssuranceType;
}
