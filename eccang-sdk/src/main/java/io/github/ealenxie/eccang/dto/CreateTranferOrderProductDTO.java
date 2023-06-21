package io.github.ealenxie.eccang.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月26日 0026 11 17
 */
@Getter
@Setter
public class CreateTranferOrderProductDTO {

    /**
     * 产品代码
     */
    @JsonProperty("product_barcode")
    private String productBarcode;

    /**
     * 数量
     */
    @JsonProperty("num")
    private String num;

    /**
     * 采购单号
     */
    @JsonProperty("po_code")
    private String poCode;

    /**
     * 入库单号
     */
    @JsonProperty("receiving_code")
    private String receivingCode;

    /**
     * 批次号
     */
    @JsonProperty("batch_no")
    private String batchNo;

}
