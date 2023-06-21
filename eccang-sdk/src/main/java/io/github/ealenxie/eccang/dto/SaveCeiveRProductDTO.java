package io.github.ealenxie.eccang.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月26日 0026 11 05
 */
@Getter
@Setter
public class SaveCeiveRProductDTO {
    /**
     * 产品代码
     */
    @JsonProperty("productSku")
    private String productSku;

    /**
     * 产品数量
     */
    @JsonProperty("qty")
    private Integer qty;

    /**
     * 备注
     */
    @JsonProperty("cudNote")
    private String cudNote;

    /**
     * 供应商编码
     */
    @JsonProperty("supplierCode")
    private String supplierCode;

    /**
     * 成本单价
     */
    @JsonProperty("unitPrice")
    private String unitPrice;

    /**
     * 入库单号
     */
    @JsonProperty("receivingCode")
    private String receivingCode;

    /**
     * 母产品的产品代码cProductList.productSku
     */
    @JsonProperty("motherSku")
    private String motherSku;

}
