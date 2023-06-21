package io.github.ealenxie.alyunwms.vo.asn;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/2/22 16:56
 * @version 1.0
 */
@Getter
@Setter
public class SerialNumbers {
    /**
     * 序列号
     */
    @JsonProperty("serial_number")
    private String serialNumber;
    /**
     * 产品sku
     */
    @JsonProperty("product_sku")
    private String productSku;
    /**
     * 产品类型 1代表良品，2代表不良品
     */
    @JsonProperty("product_type")
    private Integer productType;
}
