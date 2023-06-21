package io.github.ealenxie.alyunwms.vo.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/3/15 14:22
 * @version 1.0
 */
@Getter
@Setter
public class PdfVO {
    /**
     * url地址
     */
    @JsonProperty("url")
    private String url;
    /**
     * 产品sku
     */
    @JsonProperty("product_sku")
    private String productSku;
    /**
     * 产品代码
     */
    @JsonProperty("product_barcode")
    private String productBarcode;
    /**
     * 打印尺寸
     */
    @JsonProperty("print_size")
    private String printSize;
}
