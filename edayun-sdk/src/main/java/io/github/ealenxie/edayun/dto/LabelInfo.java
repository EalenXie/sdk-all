package io.github.ealenxie.edayun.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * VC/VE订单的面单信息
 * （当物流产品为VC/VE物流时必填）
 */
@Getter
@Setter
public class LabelInfo {
    /**
     * 销售物流承运商
     */
    private String courierChannel;
    /**
     * 跟踪号(多个跟踪号以半角逗号隔开)
     */
    private String trackingNum;
    /**
     * 面单装箱清单列表
     * （当物流产品为VC/VE物流时必填）
     */
    private List<Label> labels;
}
