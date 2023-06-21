package io.github.ealenxie.armlogi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/3/31 14:19
 * @version 1.0
 */
@Getter
@Setter
public class ProductPdfDTO {

    /**
     * 是否打印MADE IN CHINA
     */
    @JsonProperty("madeInChina")
    private Boolean madeInChina;
    /**
     * 产品
     */
    @JsonProperty("productBarcodes")
    private List<ProductBarcode> productBarcodes;
    /**
     * 尺寸[SIZE_100_100,SIZE_100_30,SIZE_100_60,SIZE_50_30,SIZE_70_30,SIZE_A4_3,SIZE_A4_4,SIZE_90_30]
     */
    @JsonProperty("type")
    private String type;
}
