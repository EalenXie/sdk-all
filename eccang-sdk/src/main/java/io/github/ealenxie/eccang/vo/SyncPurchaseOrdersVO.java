package io.github.ealenxie.eccang.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2022/12/23 13:36
 */
@Getter
@Setter
public class SyncPurchaseOrdersVO {
    /**
     * 采购单号
     */
    private String poCode;
    /**
     * 入库单号
     */
    private String receivingCode;
}
