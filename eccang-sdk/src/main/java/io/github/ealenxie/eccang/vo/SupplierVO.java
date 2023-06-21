package io.github.ealenxie.eccang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2022/12/13 9:47
 */
@Getter
@Setter
public class SupplierVO {
    /**
     * 供应商主键
     */
    @JsonProperty("supplier_id")
    private Integer supplierId;
    /**
     * 供应商代码
     */
    @JsonProperty("supplier_code")
    private String supplierCode;
    /**
     * 供应商名称
     */
    @JsonProperty("supplier_name")
    private String supplierName;
    /**
     * 供应商级别
     */
    @JsonProperty("level")
    private String level;
}
