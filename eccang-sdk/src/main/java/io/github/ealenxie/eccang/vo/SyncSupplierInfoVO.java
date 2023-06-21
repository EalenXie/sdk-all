package io.github.ealenxie.eccang.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/1/4 17:50
 */
@Getter
@Setter
public class SyncSupplierInfoVO {
    /**
     * 供应商代码
     */
    private String supplierCode;
    /**
     * 供应商名称
     */
    private String supplierName;
    /**
     * 组织机构id
     */
    private String supplierOrganizationId;
    /**
     * 供应商id
     */
    private Long supplierId;
}
