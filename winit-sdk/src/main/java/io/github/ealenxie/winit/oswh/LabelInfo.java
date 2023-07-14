package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/14 14:06
 * @version 1.0
 */
@Getter
@Setter
public class LabelInfo {
    /**
     * barcode
     */
    @JsonProperty("barcode")
    private String barcode;
    /**
     * sku
     */
    @JsonProperty("sku")
    private String sku;
    /**
     * skuCode
     */
    @JsonProperty("skuCode")
    private String skuCode;
    /**
     * specification
     */
    @JsonProperty("specification")
    private String specification;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
}
