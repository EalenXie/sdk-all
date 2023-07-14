package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author create by sch  2023/7/14 14:04
 * @version 1.0
 */
@Getter
@Setter
public class ProductLabelQueryParams {

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
     * barcode
     */
    @JsonProperty("barcode")
    private String barcode;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * pageVo
     */
    @JsonProperty("pageVo")
    private PageParams pageVo;
}
